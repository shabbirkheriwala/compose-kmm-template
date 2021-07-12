package com.ssk.composekmmtemplate

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}