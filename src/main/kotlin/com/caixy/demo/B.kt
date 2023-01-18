package com.caixy.demo

open class B : A {
    override fun a(): Int {
        println("kotlin 继承java")
        return 1
    }
}