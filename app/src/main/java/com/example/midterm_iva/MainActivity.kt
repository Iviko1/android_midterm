package com.example.midterm_iva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var email : EditText;
    private lateinit var recipientEmail : EditText;
    private lateinit var message: EditText;
    private lateinit var sendBtn: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        main()
    }

    private fun main(){
        if(!email.text.contains("@") || !recipientEmail.text.contains("@")){
            Toast.makeText(this, "Please enter valid email", Toast.LENGTH_SHORT).show()
            return
        }

        if(message.text.length > 250){
            Toast.makeText(this, "Message can't contain more than 250 characters", Toast.LENGTH_SHORT).show()
            return
        }

        var intent = Intent(this, SecondActivity::class.java);
        intent.putExtra("fromEmail", email.text)
        intent.putExtra("recipientEmail", recipientEmail.text)
        intent.putExtra("message", message.text)

        startActivity(intent)
    }

    private fun init(){
        email = findViewById(R.id.editTextEmail)
        recipientEmail = findViewById(R.id.editTextRecipientEmail)
        message = findViewById(R.id.editTextMsg)
        sendBtn = findViewById(R.id.sendBtn);
    }
}