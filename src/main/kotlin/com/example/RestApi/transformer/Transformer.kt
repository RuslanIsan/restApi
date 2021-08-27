package com.example.RestApi.transformer

interface Transformer <A, B> {
    fun transform(source: A): B
}