package com.example.day20customisedalertbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

//    Create a variable of type Dialog

    lateinit var dialog : Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

//         Creating variables for the custom_dialogue.xml
        var buttonFantastic = dialog.findViewById<Button>(R.id.btnFantastic)
        var buttonFeedback = dialog.findViewById<Button>(R.id.btnFeedback)

        buttonFantastic.setOnClickListener {
            dialog.dismiss()
        }

        buttonFeedback.setOnClickListener {
//            intents / Toast
            Toast.makeText(this, "ThankYou For Your FeedBack!",Toast.LENGTH_SHORT).show()
        }
        val myButton = findViewById<Button>(R.id.btnClick)
        myButton.setOnClickListener {
            dialog.show()
        }
    }
}