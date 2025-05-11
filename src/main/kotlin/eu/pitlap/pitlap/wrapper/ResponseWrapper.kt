package eu.pitlap.pitlap.wrapper

data class ResponseWrapper<T>(
    val success: Boolean,
    val data: T?,
)
