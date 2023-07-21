package com.cwg_sample.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.cwg_sample.denlibrary.DenLibraryClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView lbl = findViewById(R.id.lbl);

        DenLibraryClass dlc = new DenLibraryClass();
        lbl.setText("Version: " + dlc.getVersion() + " / " + dlc.getDescription());
    }
}