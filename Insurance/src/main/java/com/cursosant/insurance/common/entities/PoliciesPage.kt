package com.cursosant.insurance.common.entities

import com.google.gson.annotations.SerializedName

/**
 * Simple wrapper for the paginated policies endpoint.
 */
data class PoliciesPage(
    val count: Int?,
    val next: String?,
    val previous: String?,
    @SerializedName("results")
    val policies: List<Policy> = emptyList()
)
