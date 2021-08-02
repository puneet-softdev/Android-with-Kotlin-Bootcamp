package com.bootcamp.kotlinoverview

class ConstructorDemo(_name: String) {

    var name: String = _name
    val age = 22

    init {
        print("init called")
        if (age > 20) {
            print("Welcome Young Boy")
        }
    }

    // if primary constructor is present then call this from secondary constructor
    constructor(name: String, age: Int) : this(name) {
        print("name is $name and he is: $age years old")
    }

}