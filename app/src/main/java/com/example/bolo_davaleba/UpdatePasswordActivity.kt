package com.example.bolo_davaleba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UpdatePasswordActivity : AppCompatActivity() {
    private lateinit var goBackButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_password)
        goBackButton = findViewById(R.id.goBackButton)


        goBackButton.setOnClickListener {
            finish()
        }
    }
}