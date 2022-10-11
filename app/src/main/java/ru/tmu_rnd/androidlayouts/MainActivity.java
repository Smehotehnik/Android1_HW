package ru.tmu_rnd.androidlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button layoutSwitchButton = findViewById(R.id.openPersonLayout);

        layoutSwitchButton.setOnClickListener(v -> {
            setContentView(R.layout.add_person_layout);
        });

    }
}