package com.example.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfileRvAdapter(var profileList: List<Profile>) :
    RecyclerView.Adapter<ProfileViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.profile_lists_items, parent, false)
        return ProfileViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        var currentProfile = profileList.get(position)
        holder.tvName.text = currentProfile.name
        holder.tvEmail.text = currentProfile.email
        holder.tvTime.text = currentProfile.time
        holder.tvTweet.text = currentProfile.tweet
        holder.tvNumber1.text = currentProfile.number1
        holder.tvNumber2.text = currentProfile.number2
        holder.tvNumber3.text = currentProfile.number3

    }

    override fun getItemCount(): Int {
        return profileList.size
    }



}

class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvTime = itemView.findViewById<TextView>(R.id.tvTime)
    var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
    var tvNumber1 = itemView.findViewById<TextView>(R.id.tvNumber1)
    var tvNumber2 = itemView.findViewById<TextView>(R.id.tvNumber2)
    var tvNumber3 = itemView.findViewById<TextView>(R.id.tvNumber3)
}