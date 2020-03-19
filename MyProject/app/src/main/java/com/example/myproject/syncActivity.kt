package com.example.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class syncActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sync)

        val ShowData = ShowSyncData()
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.layout1, ShowData,"fragment_ShowData")
        transaction.addToBackStack("fragment_ShowData")
        transaction.commit()
    }
}
