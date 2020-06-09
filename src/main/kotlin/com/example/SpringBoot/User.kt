package com.example.springboot

import kotlin.random.Random

data class User(val id: Long = Random.nextLong(99999), val firstName: String? = "Liad", val lastName: String? = "Horovitz")