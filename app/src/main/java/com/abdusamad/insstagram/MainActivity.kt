package com.abdusamad.insstagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.abdusamad.insstagram.Fragments.Fragment_1
import com.abdusamad.insstagram.Fragments.Fragment_2
import com.abdusamad.insstagram.Fragments.Fragment_3
import com.abdusamad.insstagram.Fragments.Fragment_4
import com.abdusamad.insstagram.Fragments.Fragment_5
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupFragment(Fragment_1())
        val navigate_menu: BottomNavigationView = findViewById(R.id.bottom_navigation_id)
        val pager: FrameLayout = findViewById(R.id.bottom_navigation_container)

        navigate_menu.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.bottom_menu_home -> setupFragment(Fragment_1())
                R.id.bottom_menu_search -> setupFragment(Fragment_2())
                R.id.bottom_menu_add -> setupFragment(Fragment_3())
                R.id.bottom_menu_reels -> setupFragment(Fragment_4())
                R.id.bottom_menu_account -> setupFragment(Fragment_5())
            }
            true
        }
    }

    fun setupFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.bottom_navigation_container, fragment)
            .commit()
    }
}