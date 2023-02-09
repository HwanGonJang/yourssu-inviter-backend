package com.example.yourssuinviterbackend.domain.auth.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController {
    @Operation(
        summary = "테스트 메소드",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "OK",
            ),
        ],
    )
    @PostMapping
    fun test(): String {
        return "Hello World!"
    }
}