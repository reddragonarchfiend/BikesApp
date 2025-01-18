package my.app.bikesapp.db

import androidx.room.TypeConverter
import com.google.gson.Gson
import my.app.bikesapp.data.models.Location

class Converters {

    private val gson = Gson()

    @TypeConverter
    fun fromCompanyList(company: List<String?>?): String? {
        return gson.toJson(company)
    }

    @TypeConverter
    fun toCompanyList(companyJson: String?): List<String?>? {
        return gson.fromJson(companyJson, Array<String>::class.java)?.toList()
    }

    @TypeConverter
    fun fromLocation(location: Location?): String? {
        return gson.toJson(location)
    }

    @TypeConverter
    fun toLocation(locationJson: String?): Location? {
        return gson.fromJson(locationJson, Location::class.java)
    }
}