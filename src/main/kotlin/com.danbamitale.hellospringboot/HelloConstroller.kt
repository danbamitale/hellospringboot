package com.danbamitale.hellospringboot

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController("HelloController")
class HelloController{
    @GetMapping("/")
    @ResponseBody
    fun root() = "Hello World SpringBoot"

    @RequestMapping("/")
    @ResponseBody
    fun rootOther(): ResponseEntity<String> {
        return ResponseEntity<String>("Request not permmitted", HttpStatus.FORBIDDEN)
    }
}