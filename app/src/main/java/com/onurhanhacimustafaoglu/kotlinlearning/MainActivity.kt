package com.onurhanhacimustafaoglu.kotlinlearning

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            //Variables (DEĞİŞKEN) kısaltması="var"

        //Integer

        println("------- Integer -------")

            var x = 5
            var y = 4

        println(x*y)

        var age = 35

        println(age / 7 * 5)

        val name ="Ahmet" // val olarak girilen değer değiştirilemez


        //Constants (SABİTLER) kısatlma "val"

        val result = age / 7 * 5

        println(result)
        //Defining (Tanımlamak)
        val myInteger : Int
        // Initialize (başlamak) ilk değerini atamak
        myInteger = 10

        val a : Int = 23

        println(a/2)

        var myLong : Long = 100


        //Double & Float

        println("------- Double & Float -------")

        val pi = 3.14


        println(pi * 2.0)

        val myFloat = 3.14f

        println(myFloat * 2)

        var myAge : Double
        myAge = 23.0
        println(myAge/2)

        //camelCase
        //snake_case

        //String
        println("------- String -------")

        val myString = "onur Han"
        val name1 = "Mehmet"
        val surname = "Koç"

        val fullname = name + " " + surname

        println(fullname)

        val larsName : String = "Lars"

        println(myString.capitalize())

        //Boolean
        println("------- Boolean -------")

        var myBoolean : Boolean = true
        myBoolean = false

        var isAlive = true

        // <
        // >
        // <=
        // >=
        // ==
        // !=
        // && -> AND
        // || -> OR

        println(3 < 5)
        println(6 < 3)
        println(3 == 3)
        println( 4 != 5)


        /// Conversion
        println("------- Conversion -------")
        var myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger * 2)

    //Collections

    //Array

    println("------- Array -------")

    val myArray = arrayOf("Ahmet","Mehmet","Hüsnü","Ali")

        //index
        println(myArray[0])
        myArray[0] = "Ahmet Çoban"
        println(myArray[0])

        myArray.set(1,"James Hamilton")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])

        val myNewArray = doubleArrayOf(1.0,2.0,3.0)

        val mixedArray = arrayOf("Onur",5)
        println(mixedArray[0])
        println(mixedArray[1])

        //List - ArrayList

        println("------- List -------")

        val myMusician = arrayListOf<String>("James","Kirk")
        myMusician.add("Lars")
        println(myMusician[2])
        myMusician.add(0,"Rob")
        println(myMusician[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(200)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("Onur")
        myMixedArrayList.add(12.25)
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])

        //Set

        println("------- Set -------")

        val myExampleArray = arrayOf(1,1,2,3,4)
        println("element 1 : ${myExampleArray[0]}")
        println("element 2 : ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3)

        println(mySet.size)

        //For Each (Herbiri için)

        mySet.forEach { println(it) }

        val myStringSet = HashSet<String>()
        myStringSet.add("Onur")
        myStringSet.add("Onur")
        println(myStringSet.size)

        //Map - HashMap

        println("------- Map -------")

        //Key - Value

        val fruitArray = arrayOf("Apple", "Banana")
        val caloriesArray = arrayOf(100,150)

        println("${fruitArray[0]} : ${caloriesArray[0]}")

        val fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("Apple",100)
        fruitCalorieMap.put("Banana",150)
        println(fruitCalorieMap["Apple"])

        var myHashMap = HashMap<String, String>()

        val myNewMap = hashMapOf<String,Int>("A" to 1,"B" to 2,"C" to 3)
        println(myNewMap["C"])

        //Operator

        println("------- Operator -------")

        var m = 5
        println(m)
        m = m + 1
        println(m)
        m++
        println(m)
        m--
        println(m)

        var n = 7

        println(n > m)

        // && -> ve
        // || -> veya
        println(n > m && 1 > 2)
        println(n > m || 1 > 2)

        println(10+2)
        println(10-2)
        println(10*2)
        println(10/2)
        //Remainder
        println(10%3) // mod alma yani 10 un 3 e bölümden kalan "1"

        //If Control
        println("------- If Control -------")

        val myNumberAge = 44

        if (myNumberAge < 20){
            println("< 20")
        } else if (myNumberAge >= 20 && myNumberAge < 30) {
            println("23 - 30")
        }else if(myNumberAge >= 30 && myNumberAge < 40){
            println("30 - 40")
        } else {
            println(">=40")
        }

        //Switch - When
        println("------- Switch - When -------")

        val day = 3
        var dayString = ""

        /*
        if (day == 1){
            dayString = "Monday"
        }else if (day == 2){
            dayString = "Tuesday"
        }else if (day == 3){
            dayString = "Wednesday"
        }
        println(dayString)
        */

        when(day) {

            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }
        println(dayString)

        //Loops
        //For Loop

        println("------- For Loop -------")

        val myArrayofNumbers = arrayOf(12,42,35,43,56,63,72,81)
        myArrayofNumbers[0]
        val deger = myArrayofNumbers[0] / 3 * 5
        println(deger)

        for(number in myArrayofNumbers) {
            val z = number / 3 * 5
            println(z)
        }

        for (i in myArrayofNumbers.indices){
            val qz = myArrayofNumbers[i] / 3 * 5
            println(qz)
        }

        for(b in 0..9) {
            println(b)
        }

        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Onur")
        myStringArrayList.add("Han")
        myStringArrayList.add("Whiskey")

        for (str in myStringArrayList){
            println(str)
        }

        myStringArrayList.forEach { println(it)}


        //While Loop
        println("------- While -------")

        var j = 0

        while(j < 10) {
            println(j)
            j = j + 1
        }

















    }

    }
