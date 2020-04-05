package com.akb.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val intent = Intent(this, KodeLogin::class.java)
            startActivity(intent)
        }
    }
}

/*
Tanggal Pengerjaan : 3 April 2020
Deskripsi Pengerjaan : Membuat project awal dengan membuat MainActivity dan activity_main.

Tanggal Pengerjaan : 4 April 2020
Deskripsi Pengerjaan : Membuat kelas KodeLogin,Biodata,BeresOke dan layout activity_kode_login,activity,_biodata,
activity_beres_oke. Serta membuat validasi untuk Edittext input1(kode keluarga), dan validasi nama dan umur. dan
membuat hasil untuk nama serta kata-katanya untuk hasil di activity_beres_oke. Dan mulai mengupload ke github.

Tanggal Pengerjaan : 5 April 2020
Deskripsi Pengerjaan : Memperbaiki inputan di edittext input1(kode keluarga) agar huruf kapital semua.

NIM : 10117149
NAMA : M NIZAR MIFTAHUL ULYA
KELAS : IF4
*/
