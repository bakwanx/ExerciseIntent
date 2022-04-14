package com.example.exerciseintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.exerciseintent.MainActivity.Companion.EXTRA_PERSON
import com.example.exerciseintent.databinding.ActivityDetailBinding
import com.example.exerciseintent.model.Person

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent.getSerializableExtra(EXTRA_PERSON) as Person

        binding.tvName.text = intent.nama
        binding.tvAge.text = intent.umur.toString()
        binding.tvEmail.text = intent.email
        binding.tvDomicile.text = intent.domisili

        binding.tvStatus.text =
            if (intent.statusMenikah) "Menikah" else "Belum Menikah"
    }
}