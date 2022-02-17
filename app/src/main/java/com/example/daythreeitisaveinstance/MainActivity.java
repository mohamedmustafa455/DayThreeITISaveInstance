package com.example.daythreeitisaveinstance;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView showCounter;
    Button incCounter, decCounter;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCounter = findViewById(R.id.tv_counter);
        incCounter = findViewById(R.id.btn_incres_counter);
        decCounter = findViewById(R.id.btn_dec_count);


        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("count");
            showCounter.setText(String.valueOf(counter));

        }


        incCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCounter.setText(String.valueOf(++counter));
            }
        });


        decCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCounter.setText(String.valueOf(--counter));
            }
        });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("count", counter);
    }

}
