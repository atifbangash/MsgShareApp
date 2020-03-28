package com.example.msgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BtnShowToast.setOnClickListener {
            Log.i("MainActivity", "button was clicked")
           Toast.makeText(this,"Button was clicked", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "Clicked for sure",Toast.LENGTH_LONG).show()
            Toast.makeText(this, "Yup",Toast.LENGTH_SHORT).show()
        }
        btnSendMsgToNextActivity.setOnClickListener {
            val  message:String = etUserMessage.text.toString()
            Toast.makeText(this, message,Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
startActivity(intent)
        }

    }
}