package my.app.bikesapp.ui.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import my.app.bikesapp.data.models.BikeCompany
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.TimeZone
import kotlin.math.round

fun String.toFlagEmoji(): String {

    if (this.length != 2) {
        return this
    }

    val countryCodeCaps =
        this.uppercase(Locale.getDefault())
    val firstLetter = Character.codePointAt(countryCodeCaps, 0) - 0x41 + 0x1F1E6
    val secondLetter = Character.codePointAt(countryCodeCaps, 1) - 0x41 + 0x1F1E6

    if (!countryCodeCaps[0].isLetter() || !countryCodeCaps[1].isLetter()) {
        return this
    }

    return String(Character.toChars(firstLetter)) + String(Character.toChars(secondLetter))
}

fun calculateDistance(
    userLocation: Pair<Double, Double>?,
    bikeCompany: BikeCompany?
): Float? {
    val userLat = userLocation?.first ?: return null
    val userLng = userLocation.second
    val bikeCompanyLat = bikeCompany?.location?.latitude ?: return null
    val bikeCompanyLng = bikeCompany.location.longitude ?: return null

    val currentLocation = android.location.Location("location1").apply {
        latitude = userLat
        longitude = userLng
    }

    val bikeCompanyLocation = android.location.Location("location2").apply {
        latitude = bikeCompanyLat
        longitude = bikeCompanyLng
    }

    val distance = currentLocation.distanceTo(bikeCompanyLocation) / 1000
    return round(distance)
}


fun uTCToLocal(dateToConvert: String?): String? {
    return dateToConvert?.let {
        var dateToReturn = dateToConvert

        val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'", Locale.ENGLISH)
        sdf.timeZone = TimeZone.getTimeZone("UTC")

        val sdfOutPutToSend = SimpleDateFormat("dd-MM-yyyy HH:mm", Locale.ENGLISH)
        sdfOutPutToSend.timeZone = TimeZone.getDefault()

        try {
            val gmt = sdf.parse(dateToConvert)
            dateToReturn = sdfOutPutToSend.format(gmt)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        dateToReturn
    }
}

fun openGoogleMaps(context: Context, latitude: Double, longitude: Double) {
    val navigationUri =
        Uri.parse("google.navigation:q=${latitude},${longitude}")

    val mapIntent = Intent(Intent.ACTION_VIEW, navigationUri).apply {
        setPackage("com.google.android.apps.maps")
    }

    if (mapIntent.resolveActivity(context.packageManager) != null) {
        context.startActivity(mapIntent)
    }
}