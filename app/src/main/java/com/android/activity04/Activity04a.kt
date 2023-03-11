package com.android.activity04

class studentsInfo {

    // property (data member)
    private var isOn: Boolean = false

    // member function
    fun turnOn() {
        isOn = true
    }

    // member function
    fun turnOff() {
        isOn = false
    }

    fun displayLightStatus() {
        if (isOn == true)
            println("lamp is on.")
        else
            println("lamp is off.")
    }
}

fun main(args: Array<String>) {

    val lamp = studentsInfo()
    lamp.displayLightStatus()
}