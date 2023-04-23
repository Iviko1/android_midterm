package com.example.midterm_iva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    private lateinit var emailFrom: TextView;
    private lateinit var emailTo: TextView;
    private lateinit var message: TextView;
    private lateinit var clearBtn: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        init()
        main()
    }

    private fun main(){
        var intent = intent
        emailFrom.text = intent.getCharSequenceExtra("fromEmail")
        emailTo.text = intent.getCharSequenceExtra("recipientEmail")
        message.text = intent.getCharSequenceExtra("message")

        clearBtn.setOnClickListener {
            emailFrom.text=""
            emailTo.text=""
            message.text=""
            Toast.makeText(this, "cleared succesfully", Toast.LENGTH_SHORT).show();
        }
    }


    private fun init(){
        emailFrom = findViewById(R.id.textViewEmailFrom)
        emailTo = findViewById(R.id.textViewEmailTo)
        message = findViewById(R.id.textViewMessage)
        clearBtn = findViewById(R.id.clearBtn);
    }
}