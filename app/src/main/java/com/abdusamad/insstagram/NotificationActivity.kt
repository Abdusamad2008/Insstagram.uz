package com.abdusamad.insstagram

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class NotificationActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notification_layout)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId ==  android.R.id.home){
            super.onBackPressed()
        }
        return true
    }
}