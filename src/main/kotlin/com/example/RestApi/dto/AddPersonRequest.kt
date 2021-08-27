package com.example.RestApi.dto

data class AddPersonRequest (
    val name:String,
    val lastName:String? = null)