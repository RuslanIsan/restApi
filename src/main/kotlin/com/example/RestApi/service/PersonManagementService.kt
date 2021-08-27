package com.example.RestApi.service

import com.example.RestApi.dto.AddPersonRequest
import com.example.RestApi.dto.PersonResponse
import com.example.RestApi.dto.UpdatePersonRequest

interface PersonManagementService {

    fun findById(id:Long): PersonResponse?
    fun findAll(): List<PersonResponse>
    fun save(addPersonRequest: AddPersonRequest): PersonResponse
    fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse
    fun deleteById(id:Long)
}