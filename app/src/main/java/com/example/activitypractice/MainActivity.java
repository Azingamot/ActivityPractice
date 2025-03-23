package com.example.activitypractice;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button1 = findViewById(R.id.basicButton);
        Button button2 = findViewById(R.id.dialogButton);

        button1.setOnClickListener((View v) ->
        {
            Intent i = new Intent(this, BasicActivity.class);
            startActivity(i);
        });

        button2.setOnClickListener((View v) ->
        {
            Intent i = new Intent(this, DialogActivity.class);
            startActivity(i);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Tag", "onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Tag", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Tag", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Tag", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Tag", "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Tag", "onResume");
    }
}