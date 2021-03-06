package com.akb.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kode_login.*

class KodeLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kode_login)

        button2.setOnClickListener {
            val kode :String = input1.text.toString()

            if(kode.isEmpty())
            {
                Toast.makeText(this,"Kolom Kode Tidak Boleh Dikosongkan",Toast.LENGTH_SHORT ).show()
                return@setOnClickListener
            }

            if(kode.length != 6)
            {
                Toast.makeText(this,"Kolom Kode Harus Berisi 6 Huruf atau Angka",Toast.LENGTH_SHORT ).show()
                return@setOnClickListener
            }

            val intent = Intent(this, Biodata::class.java)
            startActivity(intent)
        }
    }
}