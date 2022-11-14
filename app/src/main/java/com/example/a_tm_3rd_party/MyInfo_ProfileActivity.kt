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
            //사용자가 닉네임 지정한걸 "내정보"페이지로 넘기기위한 작업
            //해당 id가 inputNickName
            setResult(Activity.RESULT_OK, resultIntent)
            //공백의 Intent에 임시로 데이터 넣어주는 기능
            //Stack에 쌓는거와 동일 구조
            finish()
            // 안드로이드 구조상 각 액티비티들이 쌓이는 구조이므로 이전화면을 띄우고나서 현재 화면을 날려서 메모리 확보
        }

    }
}