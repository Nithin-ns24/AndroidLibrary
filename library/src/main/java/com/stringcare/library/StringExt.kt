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
): String = SC.obfuscate(this, androidTreatment, version)

fun String.reveal(
        androidTreatment: Boolean = defaultAndroidTreatment,
fun String.parseToIntOrNull(): Int? = this.toIntOrNull()

fun String.parseToFloatOrNull(): Float? = this.toFloatOrNull()

fun String.reveal(
    androidTreatment: AndroidTreatment, 
    defaultVersion: Version = defaultVersion
): String = SC.reveal(this, androidTreatment, defaultVersion)

fun String.jsonArray(): JSONArray = SC.asset().jsonArray(this)


fun String.bytes(
        predicate: () -> Boolean = { true }
): ByteArray = SC.asset().bytes(this, predicate)
