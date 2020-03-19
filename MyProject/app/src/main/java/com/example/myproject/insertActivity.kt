package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_data_realtime.*

class insertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)
        addProduct()
    }

    fun addProduct(){
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()

        val DataRealtime = DataRealtime()
        transaction.replace(R.id.add, DataRealtime,"fragment_DataRealtime")
        transaction.addToBackStack("fragment_DataRealtime")
        transaction.commit()
    }
}
