package gooner.demo.training_deep_link

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = intent?.data.let {
            Log.d("Data11", " " + it?.getQueryParameter("id"))
            Log.d("Data11", " " + it?.getQueryParameter("name"))
            Log.d("Data11", " " + it?.getPathSegments())

        }

//        val appLinkIntent = intent
//        val appLinkAction = appLinkIntent.action
//        val appLinkData = appLinkIntent.data
    }
}
