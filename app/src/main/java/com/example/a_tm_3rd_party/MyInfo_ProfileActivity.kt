package com.example.a_tm_3rd_party

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_my_info_profile.*

class MyInfo_ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_info_profile)


        saveInfo.setOnClickListener {
// userNickName을 MyInfoActivity로 넘김
//            val myIntent = Intent(this, MyInfoActivity::class.java)
//            val deliverMessage = userNickName.text.toString()
//            myIntent.putExtra("message", deliverMessage)
//            startActivity(myIntent)
//            finish()
            val inputNickname = userNickName.text.toString()
            val resultIntent = Intent()

            resultIntent.putExtra("nickname", inputNickname)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }

    }
}