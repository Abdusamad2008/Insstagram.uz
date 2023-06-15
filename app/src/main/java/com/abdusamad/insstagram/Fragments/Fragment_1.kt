package com.abdusamad.insstagram.Fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.abdusamad.insstagram.ChatActivity
import com.abdusamad.insstagram.NotificationActivity
import com.abdusamad.insstagram.R
import com.abdusamad.insstagram.utils.DataBase
import kotlin.random.Random
import kotlin.random.nextInt

class Fragment_1 : Fragment() {
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.insta_layout_1, container, false)

        val post_imgs = arrayOf(
            R.drawable.png_1,
            R.drawable.png_2,
            R.drawable.png_3,
            R.drawable.ins,
            R.drawable.ins_2,
            R.drawable.ins_3,
            R.drawable.ins_4,
        )

        val user_imgs = arrayOf(
            R.drawable.acc_circle_2,
            R.drawable.icon_account_circle,
            R.drawable.icon_account_circle2,
            R.drawable.icon_account_circle3,
            R.drawable.icon_account_circle3,
            R.drawable.icon_account_circle3,
            R.drawable.icon_account_circle3,
        )

        val user_names = arrayOf(
            "Abdusamad",
            "firdavs",
            "Dasturchi_28",
            "Programmer",
            "Programmer",
            "Programmer",
            "Programmer",
        )

        val likes = arrayOf(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
        )
//
//        val gridlist = ArrayList<GridModel>()
//        for (i in like_count.indices){
//            gridlist.add(
//                GridModel(
//                    user_names[i],
//                    user_imgs[i],
//                    post_imgs[i],
//                    like_count[i],
//                    ""
//                )
//            )
//        }
//        val  gridView:GridView = root.findViewById(R.id.insta_1_gridview)
//        val adapter = GridViewAdapter(gridlist)
//        gridView.adapter = adapter


        val database = DataBase()
        val myName: TextView = root.findViewById(R.id.insta_1_myname)


        val favorite_btn: ImageView = root.findViewById(R.id.favorite_btn_id)
        favorite_btn.setOnClickListener {
            startActivity(Intent(requireActivity(), NotificationActivity::class.java))
        }

        val chat_btn: ImageView = root.findViewById(R.id.insta_1_chat_id)
        chat_btn.setOnClickListener {
            startActivity(Intent(requireActivity(), ChatActivity::class.java))
        }

//        val comment_btn:ImageView =root.findViewById(R.id.comment_btn)
//        val bottomSheet: LinearLayout = root.findViewById(R.id.bottom_sheet_layout_id)
//        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
//        val bottomSheetClose: TextView = root.findViewById(R.id.bottom_sheet_close)
//        bottomSheetBehavior.peekHeight = 0
//
//        comment_btn.setOnClickListener {
//            bottomSheetBehavior.state = BottomSheetBehavior.STATE_HALF_EXPANDED
//            bottomSheetBehavior.peekHeight=400
//        }
//        bottomSheetClose.setOnClickListener {
//            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
//            bottomSheetBehavior.peekHeight = 0
//        }
//
//
        val my_story: ImageView = root.findViewById(R.id.insta_1_my_story)
        my_story.setOnClickListener {
            setupFragment5()
        }

        val my_story_2: ImageView = root.findViewById(R.id.insta_1_my_story_2)
        my_story_2.setOnClickListener {
            setupFragment5()
        }

        val my_story_3: ImageView = root.findViewById(R.id.insta_1_my_story_3)
        my_story_3.setOnClickListener {
            setupFragment5()
        }

        val other_user_1: ImageView = root.findViewById(R.id.other_user_1)
        other_user_1.setOnClickListener {
            setupFragment(OtherUser1())
        }

        val other_user_2: ImageView = root.findViewById(R.id.other_user_2)
        other_user_2.setOnClickListener {
            setupFragment(OtherUser2())
        }

        val other_user_3: ImageView = root.findViewById(R.id.other_user_3)
        other_user_3.setOnClickListener {
            setupFragment(OtherUser3())
        }
//
//
//        /////////////////////////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////////////////////////////////////////////////////////////////////
        var book_counter_1 = 1
        var book_counter_2 = 1
        var book_counter_3 = 1
        val bookmark_1: ImageView = root.findViewById(R.id.bookmark)
        val bookmark_2: ImageView = root.findViewById(R.id.bookmark_)
        val bookmark_3: ImageView = root.findViewById(R.id.bookmark_2)
        bookmark_1.setOnClickListener {
            book_counter_1++
            if (book_counter_1 % 2 == 0) {
                bookmark_1.setImageResource(R.drawable.icon_bookmark)
            } else bookmark_1.setImageResource(R.drawable.icon_bookmark_border)
        }
        bookmark_2.setOnClickListener {
            book_counter_2++
            if (book_counter_2 % 2 == 0) {
                bookmark_2.setImageResource(R.drawable.icon_bookmark)
            } else bookmark_2.setImageResource(R.drawable.icon_bookmark_border)
        }
        bookmark_3.setOnClickListener {
            book_counter_3++
            if (book_counter_3 % 2 == 0) {
                bookmark_3.setImageResource(R.drawable.icon_bookmark)
            } else bookmark_3.setImageResource(R.drawable.icon_bookmark_border)
        }
//
//        /////////////////////////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////////////////////////////////////////////////////////////////////
//        /////////////////////////////////////////////////////////////////////////////////////////////////////
//


        var like_counter = Random.nextInt(2 until  100)
        var like_counter2 = Random.nextInt(2 until  100)
        var like_counter3 = Random.nextInt(2 until  100)


        val favorite_counter_1: TextView = root.findViewById(R.id.insta_like_counter_1)
        favorite_counter_1.text = "$like_counter likes"
        val favorite_counter_2: TextView = root.findViewById(R.id.insta_like_counter_2)
        favorite_counter_2.text = "$like_counter2 likes"
        val favorite_counter_3: TextView = root.findViewById(R.id.insta_like_counter_3)
        favorite_counter_3.text = "${like_counter3} likes"
        val favorite_1: ImageView = root.findViewById(R.id.insta_1_favorite1_id)
        val favorite_2: ImageView = root.findViewById(R.id.insta_1_favorite2_id)
        val favorite_3: ImageView = root.findViewById(R.id.insta_1_favorite3_id)

        var minus_1 = 0
        favorite_1.setOnClickListener {
            like_counter++
            minus_1++
            if (like_counter % 2 == 0) {
                favorite_counter_1.text = "${like_counter + 1 - minus_1} likes"
                favorite_1.setImageResource(R.drawable.icon_favorite)

            } else {
                favorite_counter_1.text = "${like_counter - minus_1} likes"
                favorite_1.setImageResource(R.drawable.icon_favorite_border)
            }
        }

        var minus_2 = 0
        favorite_2.setOnClickListener {
            like_counter2++
            minus_2++
            if (like_counter2 % 2 == 0) {
                favorite_counter_2.text = "${like_counter2 + 1 - minus_2} likes"
                favorite_2.setImageResource(R.drawable.icon_favorite)
            } else {
                favorite_counter_2.text = "${like_counter2 - minus_2} likes"
                favorite_2.setImageResource(R.drawable.icon_favorite_border)
            }
        }

        var minus_3 = 0
        favorite_3.setOnClickListener {
            like_counter3++
            minus_3++
            if (like_counter3 % 2 == 0) {
                favorite_counter_3.text = "${like_counter3 + 1 - minus_3} likes"
                favorite_3.setImageResource(R.drawable.icon_favorite)
            } else {
                favorite_counter_3.text = "${like_counter3 - minus_3} likes"
                favorite_3.setImageResource(R.drawable.icon_favorite_border)
            }
        }

        var doubleClick: Boolean? = false
        val post_1: ImageView = root.findViewById(R.id.insta_1_post_1)
        post_1.setImageResource(post_imgs[Random.nextInt(post_imgs.size)])
        post_1.setOnClickListener {
            if (doubleClick!!) {
                like_counter++
                if (like_counter % 2 == 0) {
                    favorite_counter_1.text = "${like_counter} likes"
                    favorite_1.setImageResource(R.drawable.icon_favorite)
                } else {
                    favorite_counter_1.text = "${like_counter - 2} likes"
                    favorite_1.setImageResource(R.drawable.icon_favorite_border)
                }
            }
            doubleClick = true
            Handler().postDelayed({ doubleClick = false }, 500)
        }

        val post_2: ImageView = root.findViewById(R.id.insta_1_post_2)
        post_2.setOnClickListener {
            if (doubleClick!!) {
                like_counter2++
                if (like_counter2 % 2 == 0) {
                    favorite_counter_2.text = "${like_counter2} likes"
                    favorite_2.setImageResource(R.drawable.icon_favorite)
                } else {
                    favorite_counter_2.text = "${like_counter2 - 1} likes"
                    favorite_2.setImageResource(R.drawable.icon_favorite_border)
                }
            }
            doubleClick = true
            Handler().postDelayed({ doubleClick = false }, 500)
        }

        val post_3: ImageView = root.findViewById(R.id.insta_1_post_3)
        post_3.setOnClickListener {
            if (doubleClick!!) {
                like_counter3++
                if (like_counter3 % 2 == 0) {
                    favorite_counter_3.text = "${like_counter3} likes"
                    favorite_3.setImageResource(R.drawable.icon_favorite)
                } else {
                    favorite_counter_3.text = "${like_counter3 - 1} likes"
                    favorite_3.setImageResource(R.drawable.icon_favorite_border)
                }
            }
            doubleClick = true
            Handler().postDelayed({ doubleClick = false }, 500)
        }


        val progressBar: ProgressBar = root.findViewById(R.id.insta_1_progressbar)
        progressBar.setOnClickListener {
            minus_1 = 0
            like_counter = 0

            minus_2 = 0
            like_counter2 = 0

            minus_3 = 0
            like_counter3 = 0

            like_counter = Random.nextInt(2 until  100)
            favorite_counter_1.text = "$like_counter likes"
            like_counter2 = Random.nextInt(2 until  100)
            favorite_counter_2.text = "$like_counter2 likes"
            like_counter3 = Random.nextInt(2 until  100)
            favorite_counter_3.text = "$like_counter3 likes"
            post_1.setImageResource(post_imgs[Random.nextInt(post_imgs.size)])
            post_2.setImageResource(post_imgs[Random.nextInt(post_imgs.size)])
            post_3.setImageResource(post_imgs[Random.nextInt(post_imgs.size)])
        }


        /////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////

        return root
    }


    fun setupFragment(fragment: Fragment) {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.bottom_navigation_container, fragment)
            .commit()
    }

    fun setupFragment5() {
        setupFragment(Fragment_5())
    }
}