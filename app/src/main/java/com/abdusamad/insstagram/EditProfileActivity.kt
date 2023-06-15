package com.abdusamad.insstagram

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.abdusamad.insstagram.utils.DataBase

class EditProfileActivity:AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editprofile_layout)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val database = DataBase()

        val editname:EditText = findViewById(R.id.edit_profile_name)
        val enter_btn:Button = findViewById(R.id.edit_profile_enter)

        enter_btn.setOnClickListener {
            database.MyName = editname.text.toString()
        }

        val name=editname.text.toString()
        database.MyName = editname.text.toString()

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            super.onBackPressed()
        }
        return true
    }

}