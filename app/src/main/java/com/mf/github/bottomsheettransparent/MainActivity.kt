package com.mf.github.bottomsheettransparent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val materialButton = findViewById<MaterialButton>(R.id.show_sheet)
        materialButton.setOnClickListener {
            TransparentSheet
                .newInstance()
                .show(supportFragmentManager, null)
        }

    }
}