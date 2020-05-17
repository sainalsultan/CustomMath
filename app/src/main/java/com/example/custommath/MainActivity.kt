package com.example.custommath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myutils.MyMath

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyMath().Div(1,2)
    }
}
