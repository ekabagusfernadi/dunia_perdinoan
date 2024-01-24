package com.example.duniaperdinoan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailDinoActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_dino)

        supportActionBar?.title = intent.getStringExtra(EXTRA_NAME)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val tvDinoName: TextView = findViewById(R.id.tv_dino_name)
        val tvDinoDetail: TextView = findViewById(R.id.tv_dino_detail)
        val tvDinoPhoto: ImageView = findViewById(R.id.iv_dino_photo)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        tvDinoPhoto.setImageResource(photo)
        tvDinoName.text = name
        tvDinoDetail.text = detail

        val btnShareIntent: Button = findViewById(R.id.action_share)
        btnShareIntent.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.action_share -> {
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "Share ${intent.getStringExtra(EXTRA_NAME)}.")
                    type = "text/plain"
                }
                val shareIntent = Intent.createChooser(sendIntent, null)
                startActivity(shareIntent)
            }
        }
    }
}