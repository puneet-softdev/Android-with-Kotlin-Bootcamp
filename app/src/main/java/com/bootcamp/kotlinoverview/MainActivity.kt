package com.bootcamp.kotlinoverview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    /*
    * VARIABLES - val, var, null value, type inference, lateinit, lazy
    * *//*
    // immutable variable
    private val immutableVariableWithType = 5


    // mutable variable
    private var mutableVarWithType: String = "With String"


    // Type Inference for both Mutable and Immutable
    private val immutableVariable = 5.5
    private var mutableVarWithoutType = "hello"


    // variable with Null Value
    private var varWithNullValue: String? = null


    // late init variable
    // must have type defined
    private lateinit var lateInitVariable: String


    // lazy variable
    val lazyVariable: String by lazy { "hey lazy initialised" }


    // data class
    lateinit var bootCampModel1: BootCampModel

    private var bootCampModel2: BootCampModel? = null*/

    lateinit var btnSecond: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity Lifecycle", "OnCreate Called")
        setContentView(R.layout.activity_main)

        btnSecond = findViewById(R.id.btnSecond)

        /*mutableVarWithoutType = "Reassigned value"

        lateInitVariable = "Initialised late"



        // ---- Null Checks ----

        var getStringLengthOfNullTypeVariable = varWithNullValue?.length

        var withElvisOperator = varWithNullValue!!.length


        // -- using Data Class --
        bootCampModel1 = BootCampModel("Puneet", false)
        bootCampModel2 = BootCampModel("Hari")

        val isPuneetTrainee: Boolean = bootCampModel1.isTrainee

        var nameOfTrainee: String? = bootCampModel2?.name


        // -- Call Functions --

        var response = add(5,7)

        addWithDefaultValue(5,7)

        // call fun with default value
        addWithDefaultValue(5)

        // call fun with named parameter
        addWithDefaultValue(b= 5, a = 7)




        // -- Constructors

//        var constructor1 = ConstructorDemo()
        var constructor1 = ConstructorDemo("Aman")

        var constructor2 = ConstructorDemo("Nitin", 25)

        var constructorDemo2 = ConstructorDemo2("Hitesh")

        var constructorDemo21 = ConstructorDemo2(20)*/


        btnSecond.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        Log.d("MainActivity Lifecycle", "OnStart Called")
        super.onStart()
    }

    override fun onResume() {
        Log.d("MainActivity Lifecycle", "OnResume Called")
        super.onResume()
    }

    override fun onPause() {
        Log.d("MainActivity Lifecycle", "OnPause Called")
        super.onPause()
    }

    override fun onStop() {
        Log.d("MainActivity Lifecycle", "OnStop Called")
        super.onStop()
    }

    override fun onRestart() {
        Log.d("MainActivity Lifecycle", "OnRestart Called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d("MainActivity Lifecycle", "OnDestroy Called")
        super.onDestroy()
    }

    /*// ----- Functions in Kotlin ----

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    // function without braces -- More concise code
    fun addFunWithoutBraces(a: Int, b: Int): Int = a + b


    // function Without Return Type Explicitly Defined
    fun add3(a: Int, b: Int) = "hello"

    private fun addWithDefaultValue(a: Int, b: Int = 5): Int {
        return a + b
    }*/
}