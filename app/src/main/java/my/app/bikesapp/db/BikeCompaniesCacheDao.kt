package my.app.bikesapp.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import my.app.bikesapp.data.models.BikeCompany

@Dao
interface CompanyCacheDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCompanies(companies: List<BikeCompany>)

    @Query("SELECT * FROM company_cache")
    suspend fun getAllCompanies(): List<BikeCompany>

    @Query("DELETE FROM company_cache")
    suspend fun clearCache()
}