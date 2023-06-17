package com.abdusamad.insstagram

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.Context
import android.os.Bundle
import android.content.ClipboardManager
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.nio.file.CopyOption
import java.nio.file.Files

class ShareProfile:AppCompatActivity() {
    val link ="https://t.me/Dasturchi_28"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.share_profiel_layout)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        val link ="https://t.me/Dasturchi_28"
        val copy_link_btn:Button=findViewById(R.id.copy_link_profile)
        copy_link_btn.setOnClickListener {

            val clipboardManager = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("text", "$link")
            clipboardManager.setPrimaryClip(clipData)
            Toast.makeText(this, "Text copied to clipboard", Toast.LENGTH_LONG).show()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            super.onBackPressed()
        }
        return true
    }


}