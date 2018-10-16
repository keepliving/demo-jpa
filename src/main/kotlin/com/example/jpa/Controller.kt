package com.example.jpa

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.sql.DataSource

@RestController
@RequestMapping("/api")
class MyController(private val myRepository: MyRepository,
                        private val dataSource: DataSource) {

    @GetMapping("/index")
    fun index(): Long {
        return 10
    }

    @GetMapping("/hello")
    fun help() = "worla"
}