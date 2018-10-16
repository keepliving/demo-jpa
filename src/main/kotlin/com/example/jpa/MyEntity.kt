package com.example.jpa

import javax.persistence.*

@Entity
data class MyEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        val name: String
)
