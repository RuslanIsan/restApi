package com.example.RestApi.resource

import com.example.RestApi.dto.AddPersonRequest
import com.example.RestApi.dto.PersonResponse
import com.example.RestApi.dto.UpdatePersonRequest
import org.springframework.http.ResponseEntity

interface PersonResource {
    fun findById(id:Long): ResponseEntity<PersonResponse?>
    fun findAll(): ResponseEntity<List<PersonResponse>>
    fun save(addPersonRequest: AddPersonRequest): ResponseEntity<PersonResponse>
    fun update(updatePersonRequest: UpdatePersonRequest): ResponseEntity<PersonResponse>
    fun deleteById(id:Long): ResponseEntity<Unit>
}