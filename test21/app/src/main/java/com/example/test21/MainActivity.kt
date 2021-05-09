package com.example.test21

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.flag1.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var render = Render(this)
        render.setAnimation(Bounce().InDown(btn))
        render.start()

    }

        setContentView(R.layout.activity_main)      //java 에서 find viewid 가져오던 것과 다르게 여기서 알아서 찾아줌

        /*edittext에 글자를 입력할 때 하나하나 로그에 표시*/
        et.addTextChangedListener(object  : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                println("입력끝 " + p0)
            }
            override fun beforeTextChanged(p0: CharSequence?, start: Int, count: Int, after: Int) {
                println("입력전 " + p0)
            }
            override fun onTextChanged(p0: CharSequence?, start: Int, before: Int, count: Int) {
                println("입력중 " + p0)
            }

        })

    }


}