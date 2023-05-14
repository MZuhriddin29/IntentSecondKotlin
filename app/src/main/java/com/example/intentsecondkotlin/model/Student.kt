package com.example.intentsecondkotlin.model

import java.io.Serializable

class Student(var age:Int, var name:String) : Serializable {

    override fun toString(): String {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'
    }
}