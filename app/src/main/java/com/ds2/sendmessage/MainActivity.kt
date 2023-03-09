package com.ds2.sendmessage

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.AbsListView
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View){
        val textMessage = findViewById<EditText>(R.id.editMessage)
    //  val displayMessage = findViewById<TextView>(R.id.displayMessage)
    //  displayMessage.text = textMessage.text
        // essas linhas mostram o valor de displayMeassage na própria Activity.
        // Removidas pois iremos

        val message = textMessage.text.toString()
        val intent = Intent(this, DisplayMessageActivity:: class.java).apply { putExtra(EXTRA_MESSAGE, message) }
        startActivity(intent)

    }


}