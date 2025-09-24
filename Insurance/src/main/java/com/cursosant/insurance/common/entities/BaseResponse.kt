package com.cursosant.insurance.common.entities

open class BaseResponse(
    val success: Boolean = false,
    val message: String? = null,
    val status: String? = null,
    val error: String? = null
)
