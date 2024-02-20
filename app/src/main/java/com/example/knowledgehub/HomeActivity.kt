package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button = findViewById<Button>(R.id.callAsBtn)

        button.setOnClickListener {
           val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.setData(Uri.parse("tel:123456789"));
            startActivity(callIntent);
        }
        val android_card = findViewById<CardView>(R.id.Android_card)
        android_card.setOnClickListener {
            val intent = Intent(this, AndroidDev::class.java)
            startActivity(intent)
        }
        val web_card = findViewById<CardView>(R.id.web_card)
        web_card.setOnClickListener {
            val intent = Intent(this, WebTech::class.java)
            startActivity(intent)
        }

        val blockcard = findViewById<CardView>(R.id.chain_card)
        blockcard.setOnClickListener {
            val intent = Intent(this, Blockchain::class.java)
            startActivity(intent)
        }

        val mlcard = findViewById<CardView>(R.id.ML_card)
        mlcard.setOnClickListener {
            val intent = Intent(this, M_LActivity::class.java)
            startActivity(intent)
        }

        val cloudcard = findViewById<CardView>(R.id.cloud_card)
        cloudcard.setOnClickListener {
            val intent = Intent(this, cloud::class.java)
            startActivity(intent)
        }

        val robotic_card = findViewById<CardView>(R.id.robotic_card)
        robotic_card.setOnClickListener {
            val intent = Intent(this, Robotic::class.java)
            startActivity(intent)
        }



    }
}