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
            // 내정보에서 수정버튼 누르면 이동하는 기능이지만,
            // 데이터를 가져오기 위해서 이동한다고 선언이 필요
            startActivityForResult(myIntent, REQUEST_FOR_NICKNAME)
        }
        testp.setOnClickListener {
            finish()
        }
    }
//      아래는 프로필 수정한 값을 반영을 위해서 추가한 구역
//      데이터를 가져왔을때만 반응하는 부분
//      Interrupt 와 비슷한 기능
//      requestCode 번호가 동일한지 확인하는 내용으로 진행
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//      기존에 text 쓰였던 걸 덮어씌우기 위해서 override 필요
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQUEST_FOR_NICKNAME){
//          단순히 데이터 query가 있는게 아니라, 원하는 버튼이 눌러서 들어온 건지 확인필요
//          해당 구문 추가로 다양한 데이터를 선별적으로 반영 쌉가능
            if(resultCode == Activity.RESULT_OK){
//              닉네임에서 걸러낸 데이터 가져와서 반영
                val newNickname = data?.getStringExtra("nickname")
                rNickName.text = newNickname
            }
        }

    }
}