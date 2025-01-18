package my.app.bikesapp.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location(
    var latitude : Double? = null,
    val longitude : Double? = null,
    val city : String? = null,
    val country : String? = null
) : Parcelable
