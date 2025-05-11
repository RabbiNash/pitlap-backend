package eu.pitlap.pitlap.exception

import org.apache.coyote.Response
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(NoSuchElementException::class)
    fun handleNotFound(exception: NoSuchElementException): ResponseEntity<ErrorResponse> {
        val error = ErrorResponse(message = exception.message ?: "Resource not found")
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error)
    }

    @ExceptionHandler(Exception::class)
    fun handleGenericException(exception: Exception): ResponseEntity<ErrorResponse> {
        val error = ErrorResponse(message = exception.localizedMessage ?: "An unexpected error occurred")
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error)
    }
}