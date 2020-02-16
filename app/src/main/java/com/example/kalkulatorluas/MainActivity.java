package com.example.kalkulatorluas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnintent1, btnintent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnintent1=(Button)findViewById(R.id.btnIntent1);
        btnintent2=(Button)findViewById(R.id.btnIntent2);

        btnintent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,Intent1Activity.class);
                startActivity(intent1);
            }
        });
        btnintent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,Intent2Activity.class);
                startActivity(intent2);
            }
        });
    }
}
