package com.example.praktika15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OnClick(view: View) {
        val breedText: TextView = findViewById(R.id.editTextTextPersonName)
        val yearOfBirthText: TextView = findViewById(R.id.editTextNumber)
        val monthOfBirthText: TextView = findViewById(R.id.editTextNumber2)
        val breed = breedText.text.toString()
        val year = yearOfBirthText.text.toString()
        val month = monthOfBirthText.text.toString()
        val user : SecondActivity.User = SecondActivity.User (month, year, breed)
        val intent: Intent = Intent(
            this@MainActivity, SecondActivity::class.java)
        intent.putExtra(user.javaClass.simpleName, user)
        when (view.id){
            R.id.button -> startActivity(intent)
        }
    }
}