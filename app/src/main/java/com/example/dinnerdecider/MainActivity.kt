package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var list = arrayListOf<String>("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener { value ->
            addNewFood(newFoodText.text.toString())
            newFoodText.text.clear()
            val toast = Toast.makeText(applicationContext,"New Food Added!",Toast.LENGTH_SHORT)
            toast.show()
        }

        decideButton.setOnClickListener { value ->
            nameText.text = getRandomFood()
        }

        nameText.text = getRandomFood()
    }

    fun getRandomFood():String{
        return list.random()
    }

    fun addNewFood(value:String?){
        if (value == null) { return }
        var _value = value?:""
        list.add(_value)
    }
}