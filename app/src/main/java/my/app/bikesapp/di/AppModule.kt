package my.app.bikesapp.di

import android.content.Context
import androidx.room.Room
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import my.app.bikesapp.BuildConfig
import my.app.bikesapp.R
import my.app.bikesapp.db.AppDatabase
import my.app.bikesapp.db.CompanyCacheDao
import my.app.bikesapp.networking.AuthInterceptor
import my.app.bikesapp.networking.NetworkService
import my.app.bikesapp.util.Const.BIKE_PREFS
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideOkHttpClient(
        interceptor: HttpLoggingInterceptor,
        authInterceptor: AuthInterceptor
    ): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .addInterceptor(authInterceptor)
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .build()

    @Provides
    fun provideAuthInterceptor() = AuthInterceptor()

    @Provides
    fun provideLoggingInterceptor() =
        HttpLoggingInterceptor().apply {
            level =
                if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
        }

    @Singleton
    @Provides
    fun provideSharedPreferences(
        @ApplicationContext context: Context,
        masterKey: MasterKey
    ) = EncryptedSharedPreferences.create(
        context,
        BIKE_PREFS,
        masterKey,
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
    )

    @Provides
    fun provideMasterKey(@ApplicationContext context: Context) = MasterKey.Builder(context)
        .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
        .build()

    @Provides
    fun provideGson() = Gson()

    @Provides
    @Singleton
    fun provideGsonConverterFactory(gson: Gson): GsonConverterFactory =
        GsonConverterFactory.create(
            gson
        )

    @Singleton
    @Provides
    fun provideNetworkService(
        okHttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory,
        @ApplicationContext context: Context
    ) = provideService(okHttpClient, converterFactory, NetworkService::class.java, context)

    private fun createRetrofit(
        okHttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory,
        context: Context
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(
                context.resources.getString(R.string.base_url)
            )
            .client(okHttpClient)
            .addConverterFactory(converterFactory)
            .build()
    }

    private fun <T> provideService(
        okHttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory,
        clazz: Class<T>,
        context: Context
    ): T {
        return createRetrofit(okHttpClient, converterFactory, context).create(clazz)
    }

    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "bikes_database"
        ).build()
    }

    @Provides
    fun provideCompanyCacheDao(appDatabase: AppDatabase): CompanyCacheDao {
        return appDatabase.companyCacheDao()
    }

}