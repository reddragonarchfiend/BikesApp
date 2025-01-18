package my.app.bikesapp.util

import android.content.SharedPreferences

object PreferenceHelper {

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = this.edit()
        operation(editor)
        editor.apply()
    }

    /**
     * puts a key value pair in shared prefs if doesn't exists, otherwise updates value on given [key]
     */
    operator fun SharedPreferences.set(key: String, value: Any?) {
        when (value) {
            is String? -> edit { it.putString(key, value) }
            is Int -> edit { it.putInt(key, value) }
            is Boolean -> edit { it.putBoolean(key, value) }
            is Float -> edit { it.putFloat(key, value) }
            is Long -> edit { it.putLong(key, value) }
            is MutableSet<*> -> edit { it.putStringSet(key, value as MutableSet<String>?) }
            else -> throw UnsupportedOperationException("Not yet implemented")
        }
    }

    /**
     * finds value on given key.
     * [T] is the type of value
     * @param defaultValue optional default value - will take null for strings, false for bool and -1 for numeric values if [defaultValue] is not specified
     */
    inline operator fun <reified T : Any> SharedPreferences.get(
        key: String,
        defaultValue: T? = null
    ): T? {
        return when (T::class) {
            String::class -> getString(key, defaultValue as? String) as T?
            Int::class -> getInt(key, defaultValue as? Int ?: -1) as T?
            Boolean::class -> getBoolean(key, defaultValue as? Boolean ?: false) as T?
            Float::class -> getFloat(key, defaultValue as? Float ?: -1f) as T?
            Long::class -> getLong(key, defaultValue as? Long? ?: -1) as T?
            else -> throw UnsupportedOperationException("Not yet implemented")
        }
    }

    fun SharedPreferences.getCacheExpiry(): Long {
        return this[Const.CACHE_EXPIRY_MILLISECONDS, 30L] ?: 30L
    }

    fun SharedPreferences.setCacheExpiry(cacheExpiryMillis: Long?) {
        this[Const.CACHE_EXPIRY_MILLISECONDS] = cacheExpiryMillis
    }

    fun SharedPreferences.getLastFetchedAt(): Long? {
        return this[Const.LAST_FETCHED_AT]
    }

    fun SharedPreferences.setLastFetchedAt(cacheExpiryMillis: Long?) {
        this[Const.LAST_FETCHED_AT] = cacheExpiryMillis
    }

}