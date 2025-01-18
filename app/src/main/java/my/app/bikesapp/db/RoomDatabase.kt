package my.app.bikesapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import my.app.bikesapp.data.models.BikeCompany

@Database(entities = [BikeCompany::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun companyCacheDao(): CompanyCacheDao
}