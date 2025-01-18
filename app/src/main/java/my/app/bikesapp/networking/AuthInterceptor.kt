package my.app.bikesapp.networking

import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class AuthInterceptor : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .header("Accept","application/json")
            .header("User-Agent","BikesApp")
            .build()
        return chain.proceed(request)
    }
}