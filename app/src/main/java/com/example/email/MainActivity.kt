package com.example.email

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emails = EmailFetcher.getEmails()

        val emailRv = findViewById<RecyclerView>(R.id.emailRv)

        val adapter = EmailAdapter(emails)

        emailRv.adapter = adapter

        emailRv.layoutManager = LinearLayoutManager(this)

    }
}