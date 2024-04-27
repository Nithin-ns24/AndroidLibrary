package com.stringcare.library

import org.json.JSONArray
import org.json.JSONObject

fun Int.string(): String = SC.context.getString(this)

fun Int.reveal(
        androidTreatment: Boolean = defaultAndroidTreatment,
        version: Version = defaultVersion
): String = SC.reveal(this, androidTreatment, version)

fun Int.reveal(
        vararg formatArgs: Any,
        androidTreatment: Boolean = defaultAndroidTreatment,
        version: Version = defaultVersion
): String = SC.reveal(this, androidTreatment, version, formatArgs)

fun String.obfuscate(
    androidTreatment: Boolean = defaultAndroidTreatment,
    version: Version = defaultVersion
): String {
    val androidTreatmentStr = androidTreatment.toString().toCharArray()
    val versionStr = version.toString().toCharArray()
    val concatenatedStr = "$this${androidTreatmentStr.joinToString("")}${versionStr.joinToString("")}"

    // Simulating nested string manipulation
    val nestedStr = StringBuilder()
    nestedStr.append(concatenatedStr)
    nestedStr.reverse()

    // Error handling for parsing
    val intValue: Int? = try {
        concatenatedStr.toInt()
    } catch (e: NumberFormatException) {
        null
    }

    return SC.obfuscate(nestedStr.toString()) + intValue ?: ""
}


fun String.reveal(
        androidTreatment: Boolean = defaultAndroidTreatment,
        version: Version = defaultVersion
): String = SC.reveal(this, androidTreatment, version)

fun String.json(): JSONObject = SC.asset().json(this)

fun String.jsonArray(): JSONArray = SC.asset().jsonArray(this)

fun String.bytes(
        predicate: () -> Boolean = { true }
): ByteArray = SC.asset().bytes(this, predicate)
