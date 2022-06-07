package com.husainazkas.myskillacademy.presenter.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.husainazkas.myskillacademy.R
import com.husainazkas.myskillacademy.presenter.fragments.EmbeddedFragment
import kotlinx.android.synthetic.main.activity_fragment_demo.*

class FragmentDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_demo)

        initView()
    }

    private fun initView() {
        btn_fragment_demo_show_fragment.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fl_fragment_demo_fragment, EmbeddedFragment.getInstance()).commit()
            it.visibility = View.INVISIBLE
        }
        btn_fragment_demo_open_custom_activity_fragment.setOnClickListener {
            startActivity(Intent(this, CustomActivity::class.java))
        }
    }
}