package com.example.thanhthuy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NhanVien Teo = new NhanVien();
       // Teo.tenNhanVien = "Nguyen Van Teo";
       // Teo.tuoiNhanVien = 18;
        Teo.setTenNhanVien("Nguyen Van Be Teo");
        Teo.setTuoiNhanVien(24);
        Toast.makeText(
                MainActivity.this,
                ""+ Teo.getTuoiNhanVien(),
                Toast.LENGTH_LONG
        ).show();
    }
}
