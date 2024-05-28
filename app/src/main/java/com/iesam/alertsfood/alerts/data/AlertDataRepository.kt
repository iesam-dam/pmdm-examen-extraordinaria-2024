package com.iesam.alertsfood.alerts.data

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.iesam.alertsfood.R
import com.iesam.alertsfood.alerts.domain.Alert


class AlertDataRepository(val context: Context) {

    val typeToken = object : TypeToken<List<AlertApiModel>>() {}.type

    fun getAlerts(): List<Alert> {
        val json = context.resources.openRawResource(R.raw.alerts)
            .bufferedReader().use { it.readText() }

        val apiAlerts = Gson().fromJson<List<AlertApiModel>>(json, typeToken)
        return apiAlerts.map {
            it.toDomain()
        }
    }

    fun getAlert(alertId: String): Alert? {
        val alerts = getAlerts()
        alerts.forEach {
            if (it.id == alertId) {
                return it
            }
        }
        return null
    }
}