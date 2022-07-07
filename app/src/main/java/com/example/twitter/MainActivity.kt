package com.example.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayProfile()


    }
    fun displayProfile(){
        var profile= Profile("ali","ali@gmail","12:33AM","I love Kenya","22","506","01")
        var profile1= Profile("sam","sam@gmail","2:30AM","I love Kenya","900","5","303")
        var profile2= Profile("ali","ali@gmail","9:01PM","I love chicken","2200","53","133")
        var profile3= Profile("ali","ali@gmail","5:00AM","I want to go out","222","06","233")
        var profile4= Profile("ali","ali@gmail","9:11PM","I love travelling","122","586","333")

        var profileList = listOf(profile, profile1, profile2, profile3, profile4)
        var profileAdapter = ProfileRvAdapter(profileList)
        binding.rvProfile.layoutManager = LinearLayoutManager( this)
        binding.rvProfile.adapter = profileAdapter

    }
}