package com.example.myproject

import android.app.AlertDialog
import android.app.AlertDialog.*
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        insertProduct()
        viewChart()
        sync_data()
        showData()
    }

    fun insertProduct(){
        add_pro.setOnClickListener(){
            intent = Intent(this,insertActivity::class.java)
            startActivity(intent)
        }
    }

    fun sync_data(){
        sync_data.setOnClickListener(){
            intent = Intent(this,syncActivity::class.java)
            startActivity(intent)
        }
    }

    fun viewChart(){
        view_chart.setOnClickListener(){
            intent = Intent(this,chartActivity::class.java)
            startActivity(intent)
        }
    }

    fun showData(){
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()

        val ShowData = ShowData()
        transaction.replace(R.id.show, ShowData,"fragment_ShowData")
        transaction.addToBackStack("fragment_ShowData")
        transaction.commit()

    }

    fun dialog(view: View) {
        val builder: Builder = Builder(this@MainActivity)
        builder.setMessage("รับขนมจีบซาลาเปาเพิ่มมั้ยคะ?")
        builder.setPositiveButton("รับ",
            DialogInterface.OnClickListener { dialog, id ->
                Toast.makeText(
                    applicationContext,
                    "ขอบคุณค่ะ", Toast.LENGTH_SHORT
                ).show()
            })
        builder.setNegativeButton("ไม่รับ",
            DialogInterface.OnClickListener { dialog, which ->
                //dialog.dismiss();
            })
        builder.show()
    }
}
