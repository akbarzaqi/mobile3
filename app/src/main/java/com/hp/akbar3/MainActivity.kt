package com.hp.akbar3

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hp.akbar3.HasilActivity.Companion.DATA_JK
import com.hp.akbar3.HasilActivity.Companion.DATA_NAMA
import com.hp.akbar3.HasilActivity.Companion.DATA_SETUJU
import com.hp.akbar3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var nama = ""
    private var jk = ""
    private var cekSetuju = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnSubmit.setOnClickListener {
                nama = isinama.text.toString();
                if (rdb1.isChecked) {
                    jk = "laki"
                }
                if(rdb2.isChecked) {
                    jk = "perempuan"
                }
                cekSetuju = checkAgree.isChecked
                val intent = Intent(this@MainActivity, HasilActivity::class.java)
                    .putExtra(DATA_NAMA, nama)
                    .putExtra(DATA_JK, jk)
                    .putExtra(DATA_SETUJU, cekSetuju)

                startActivity(intent)
            }

        }

    }
}