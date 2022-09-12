package com.sigma.flutterapptest

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnLaunch).setOnClickListener {
            startActivity(
//                FlutterActivity.createDefaultIntent(this)
//                FlutterActivity.withNewEngine("my_engine_id").initialRoute("/my_route").build(this)
                FlutterActivity.withCachedEngine("my_engine_id").build(this)
            )
        }
    }
}