package zuu.com.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.LinearLayoutManager
import zuu.com.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTwitter()

    }

    fun displayTwitter() {
        var twitter =  Twitter("Jane", "jane@coder", "“Computers are fast; programmers keep it slow.”  ")
        var twitter1 = Twitter("Paul", "@paul", "“It compiles; ship it.” ")
        var twitter2 = Twitter("Nora", "@greatgirl", "“It works on my machine.”")
        var twitter3 = Twitter("Kadi", "kadi@the coder", "Voodoo Programming")
        var twitter4 = Twitter("Nyambura", "@Nyambura", "“There are two ways to write error-free programs; only the third works.”")
        var twitter5 = Twitter("John", "@johnme", "“Remember the past”")
        var twitter6 = Twitter("Peter", "peter@ada", " code has zero effects and defects.” ")
        var twitter7 = Twitter("James", "james@akira", "“There are two ways to write error-free programs; only the third works.”")
        var twitterList = listOf(twitter, twitter1, twitter2, twitter3, twitter4, twitter5, twitter6, twitter7)

        var TwitterAdapter = TwitterAdapter(twitterList)
        binding.rvTwitter.layoutManager = LinearLayoutManager(this)
        binding.rvTwitter.adapter = TwitterAdapter

    }
}


