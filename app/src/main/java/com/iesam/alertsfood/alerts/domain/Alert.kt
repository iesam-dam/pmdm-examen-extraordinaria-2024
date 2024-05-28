package com.iesam.alertsfood.alerts.domain

data class Alert(
    val body: String,
    val id: String,
    val labelSource: String,
    val publishData: Long,
    val summary: String,
    val title: String,
    val typeAlert: Int,
    val urlImage: String,
    val urlSource: String
)