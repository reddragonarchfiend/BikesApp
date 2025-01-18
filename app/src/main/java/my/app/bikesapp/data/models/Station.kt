package my.app.bikesapp.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Station(
    val name : String? = null,
    val timestamp : String? = null,
    val longitude : Double? = null,
    val latitude : Double? = null,
    val free_bikes : Int? = null,
    val empty_slots : Int? = null,
    val id : String? = null
) : Parcelable
