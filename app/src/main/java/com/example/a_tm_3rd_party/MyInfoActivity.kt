package com.example.a_tm_3rd_party

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_info.*

class MyInfoActivity : AppCompatActivity() {
    val REQUEST_FOR_NICKNAME = 1005

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_info)



        editUserInfo.setOnClickListener {
            val myIntent = Intent(this, MyInfo_ProfileActivity::class.java)

            startActivityForResult(myIntent, REQUEST_FOR_NICKNAME)
        }
        testp.setOnClickListener {
            finish()
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQUEST_FOR_NICKNAME){
            if(resultCode == Activity.RESULT_OK){
                val newNickname = data?.getStringExtra("nickname")
                rNickName.text = newNickname
            }
        }

    }
}