package com.example.jpa

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MyRepository: JpaRepository<MyEntity, Long>
