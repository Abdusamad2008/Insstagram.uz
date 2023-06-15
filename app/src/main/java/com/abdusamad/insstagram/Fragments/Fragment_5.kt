    package com.abdusamad.insstagram.Fragments

    import android.annotation.SuppressLint
    import android.content.Context
    import android.content.Intent
    import android.os.Bundle
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.LinearLayout
    import android.widget.TextView
    import android.widget.Toast
    import androidx.fragment.app.Fragment
    import com.abdusamad.insstagram.EditProfileActivity
    import com.abdusamad.insstagram.R
    import com.abdusamad.insstagram.ShareProfile

    class Fragment_5 : Fragment() {
        @SuppressLint("MissingInflatedId")
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val root = inflater.inflate(R.layout.insta_layout_5, container, false)
            val post_text:TextView = root.findViewById(R.id.insta_5_posts)
            val reels_text:TextView = root.findViewById(R.id.insta_5_reels)
            val tags_text:TextView = root.findViewById(R.id.insta_5_tags)
            val text:TextView = root.findViewById(R.id.insta_5_text)
            val share_profile:TextView = root.findViewById(R.id.insta_5_share_profile)
            val edit_profile:TextView = root.findViewById(R.id.insta_5_edit_profile)

            share_profile.setOnClickListener {
                startActivity(Intent(requireActivity(), ShareProfile::class.java))
            }

            edit_profile.setOnClickListener {
                startActivity(Intent(requireActivity(), EditProfileActivity::class.java))
            }

            post_text.setOnClickListener{
                text.text = "No Posts"
            }

            reels_text.setOnClickListener{
                text.text = "No Reels"
            }

            tags_text.setOnClickListener{
                text.text = "No Tags"
            }


            return root
        }

    }