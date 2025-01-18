package my.app.bikesapp.data.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "company_cache")
@Parcelize
data class BikeCompany(
    @PrimaryKey
    val id : String,
    val company : List<String?>? = null,
    val href : String? = null,
    val location : Location? = null,
    val name : String? = null
) : Parcelable {
    @Ignore
    val stations : List<Station?>? = null
}
