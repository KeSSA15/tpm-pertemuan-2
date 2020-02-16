package com.example.kalkulatorluas;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class Intent2Activity extends AppCompatActivity {
    private Button btnHasil;
    private TextView tvHasil;
    private EditText etAlas, etTinggi;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);

        btnHasil = findViewById(R.id.btn_hasilj);
        tvHasil = findViewById(R.id.tv_hasilj);
        etAlas = findViewById(R.id.et_alasj);
        etTinggi = findViewById(R.id.et_tinggij);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sAlas = etAlas.getText().toString();
                    String sTinggi = etTinggi.getText().toString();

                    double alas = Double.parseDouble(sAlas);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasilj = alas * tinggi;

                    String sHasil = String.valueOf(hasilj);
                    tvHasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
