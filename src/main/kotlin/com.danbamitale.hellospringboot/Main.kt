package com.danbamitale.hellospringboot

import org.apache.coyote.Response
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@ComponentScan(basePackages = arrayOf("com.danbamitale.hellospringboot"))
@Configuration(value = "application.yml")
open class MyApplication


fun main(args: Array<String>){
        SpringApplication.run(arrayOf(MyApplication::class.java), args)
}
