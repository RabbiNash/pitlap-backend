package eu.pitlap.pitlap.service.practice.model

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Represents a single lap entry in a Formula 1 practice session.")
data class PracticeLapModel(

    @Schema(description = "Driver's short name or code (e.g., 'VER' for Verstappen)", example = "VER")
    val driver: String,

    @Schema(description = "URL to the driver's headshot image", example = "https://example.com/images/verstappen.png")
    val headshotUrl: String,

    @Schema(description = "Tyre compound used during the lap", example = "Soft")
    val compound: String,

    @Schema(description = "Lap time as a formatted string", example = "1:32.456")
    val lapTime: String,

    @Schema(description = "Lap number during the session", example = "14")
    val lapNumber: Int,

    @Schema(description = "Indicates if this lap was the driver's personal best", example = "true")
    val isPersonalBest: Boolean,

    @Schema(description = "Driver's full name", example = "Max Verstappen")
    val fullName: String
)
