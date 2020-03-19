package com.example.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class chartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)

        val MainChart = MainChart()
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.contentContainer, MainChart,"fragment_MainChart")
        transaction.addToBackStack("fragment_MainChart")
        transaction.commit()

    }
}
