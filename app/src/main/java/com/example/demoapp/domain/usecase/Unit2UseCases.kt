package com.example.demoapp.domain.usecase
import android.util.Log
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.logging.Logger
const val TAG =  "Unit2UseCases"

class Unit2UseCases {
    // ref https://developer.android.com/codelabs/basic-android-kotlin-compose-nullability
    class LessonNullable {
        fun returnNullableString(name: String):String?{
            if(name == "someone")
                return null
            return "someone else"
        }

        fun returnFavFood(name: String):Int?{
            return name?.length
        }

        fun elvisOperator(name: String):Int{
            var favoriteActor: String? = "Keanu Reeves"
            val lengthOfName = favoriteActor?.length ?: 0
            return lengthOfName
        }
    }

    // ref https://developer.android.com/codelabs/basic-android-kotlin-compose-conditionals
    class LessonWhen {
        fun trafficLightIf(trafficLightColor: String): String{
            if (trafficLightColor == "Red") {
                return "Stop"
            } else if (trafficLightColor == "Yellow") {
                return "Slow Down"
            } else if (trafficLightColor == "Green") {
                return "Go"
            }
            return "Invalid Color"
        }

        fun trafficLightWhen(trafficLightColor: String): String{
            return when (trafficLightColor) {
                "Red" -> ("Stop")
                "Yellow" -> ("Slow")
                "Green" -> ("Go")
                else -> ("Invalid Color")
            }
        }

        fun trafficLightWhenMultiple(trafficLightColor: String): String{
            return when (trafficLightColor) {
                "Red" -> ("Stop")
                "Yellow", "Amber" -> ("Slow")
                "Green" -> ("Go")
                else -> ("Invalid Color")
            }
        }

        fun greetUser(): String{
            val current = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("k")
            val formatted = current.format(formatter)
            val timeOfDayIn24 = formatted.toInt()

            val message = when {
                timeOfDayIn24 >= 1 && timeOfDayIn24 <= 12 -> "Good Morning"
                timeOfDayIn24 > 12 && timeOfDayIn24 < 18 -> "Good Afternoon"
                timeOfDayIn24 > 18 -> "Good Evening"
                else -> "Good time"
            }

            return message
        }

        fun greetUserImproved(): String{
            val current = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("k")
            val formatted = current.format(formatter)
            val timeOfDayIn24 = formatted.toInt()

            val message = when {
                timeOfDayIn24 > 18 -> "Good Evening"
                timeOfDayIn24 > 12 -> "Good Afternoon"
                timeOfDayIn24 > 1 -> "Good Morning"
                else -> "Good time"
            }
            return message
        }
    }


    // TODO: Continue from step 5
    private class SmartDevice {
        val name = "Samsung Watch"
        val category = "Entertainment"
        var deviceStatus = "online"

        fun turnOn() {
            Log.i(TAG, "Device Turned on")
        }
        fun turnOff() {
            Log.i(TAG, "Device Turned off")
        }
    }

    class LessonClasses {
        fun main(){
            val smartWatch = SmartDevice()
            Log.i(TAG, "Device Name: ${smartWatch.name}")
            smartWatch.turnOn()
            smartWatch.turnOff()
        }
    }
}