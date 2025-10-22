package com.hp.akbar3

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hp.akbar3.databinding.ActivityHasilBinding

class HasilActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHasilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHasilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra(DATA_NAMA)
        val jk = intent.getStringExtra(DATA_JK)
        val setuju = intent.getBooleanExtra(DATA_SETUJU, false)

        binding.apply {
            tampilNama.text = nama
            tampilJenisKelamin.text = jk
            if(jk == "laki") {
                tampilJenisKelamin.setBackgroundColor(Color.YELLOW)
            }
            if(jk == "perempuan") {
                tampilJenisKelamin.setBackgroundColor(Color.MAGENTA)
            }
            if(setuju) {
                tampilSetuju.setText("Data sesuai")
            }else {
                tampilSetuju.setText("data belum sesuai")
            }
        }
    }

    companion object {
        const val DATA_NAMA = "data_nama"
        const val DATA_JK = "data_jk"
        const val DATA_SETUJU = "data_setuju"
    }
}