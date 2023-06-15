package com.abdusamad.insstagram.utils

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.abdusamad.insstagram.R

class GridViewAdapter(private val gridList: ArrayList<GridModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return gridList.size
    }

    override fun getItem(postion: Int): Any {
        return gridList[postion]
    }

    override fun getItemId(postion: Int): Long {
        return postion.toLong()
    }

    @SuppressLint("ViewHolder", "MissingInflatedId")
    override fun getView(postion: Int, view: View?, parent: ViewGroup?): View {
        val root =
            LayoutInflater.from(parent?.context).inflate(R.layout.item_grid_view, parent, false)
        val post_img: ImageView = root.findViewById(R.id.item_grid_img)
        val user_name: TextView = root.findViewById(R.id.insta_1_user_name_id)
        val likes :TextView = root.findViewById(R.id.insta_like_counter_1)
        val user_img:ImageView = root.findViewById(R.id.insta_1_user_img_id)
        user_img.setImageResource(gridList[postion].user_img)
        likes.text = gridList[postion].like_count.toString()
        post_img.setImageResource(gridList[postion].post_img)
        user_name.text = gridList[postion].Name


        return root
    }
}