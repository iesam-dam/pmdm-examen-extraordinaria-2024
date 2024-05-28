package com.iesam.alertsfood

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.iesam.alertsfood.alerts.data.AlertDataRepository

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alertDataRepository = AlertDataRepository(this)

        //Código test
        val alerts = alertDataRepository.getAlerts()
        val alert = alertDataRepository.getAlert(alerts.first().id)
    }
}