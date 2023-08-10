package com.exzray.enxryl.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EnxrylEurekaApplication

fun main(args: Array<String>) {
    runApplication<EnxrylEurekaApplication>(*args)
}
