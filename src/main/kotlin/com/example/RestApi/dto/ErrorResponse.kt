package com.example.RestApi.dto

import java.time.LocalDateTime

class ErrorResponse ( val title: String = "Bad request", val message: String, val dateTime: LocalDateTime = LocalDateTime.now())