package com.example.RestApi.dto

data class UpdatePersonRequest (
    val id:Long,
    val name:String,
    val lastName:String? = null)