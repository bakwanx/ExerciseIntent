package com.example.exerciseintent.model

import java.io.Serializable

data class Person(
    var nama: String,
    var umur: Int,
    var email: String,
    var domisili: String,
    var statusMenikah: Boolean
) : Serializable
