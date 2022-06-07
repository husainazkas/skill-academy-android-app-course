package com.husainazkas.myskillacademy.presenter.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.husainazkas.myskillacademy.R
import com.husainazkas.myskillacademy.presenter.CustomController
import kotlinx.android.synthetic.main.activity_custom.*

class CustomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom)

        fl_custom_activity.apply {
            removeAllViews()
            addView(CustomController(this@CustomActivity))
        }
    }
}