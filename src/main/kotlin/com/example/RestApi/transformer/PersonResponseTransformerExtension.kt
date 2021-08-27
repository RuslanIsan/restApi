package com.example.RestApi.transformer

import com.example.RestApi.domain.Person
import com.example.RestApi.dto.PersonResponse

fun Person?.toPersonResponse(): PersonResponse {
    return PersonResponse(
        id = this?.id ?: 1L,
        fullName = "${this?.lastName} ${this?.name}"
    )
}