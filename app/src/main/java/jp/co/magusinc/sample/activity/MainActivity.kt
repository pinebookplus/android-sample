package jp.co.magusinc.sample.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import jp.co.magusinc.sample.R

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sendButton = findViewById<Button>(R.id.send_button)
        sendButton.setOnClickListener {
            val intent = Intent(application, SampleActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
