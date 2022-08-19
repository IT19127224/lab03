package com.example.tute03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun openNewActivity(view: View) {
        when (view.id) {
            R.id.btnRASend -> {

            }
            R.id.btnRACansel -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

        }
    }
}