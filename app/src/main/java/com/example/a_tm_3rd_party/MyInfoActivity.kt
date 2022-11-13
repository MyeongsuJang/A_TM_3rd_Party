package com.example.a_tm_3rd_party

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_info.*

class MyInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_info)

        editUserInfo.setOnClickListener {
            val editUserInformation = Intent(this, MyInfo_ProfileActivity::class.java)

            startActivity(editUserInformation)
            finish()
        }
        testp.setOnClickListener {
            finish()
        }

        val intentMessage = intent.getStringExtra("message")

        rNickName.text = intentMessage
    }
}