package com.example.onlantrend;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }
    public void goNevScrin4(View view) {
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }

    public void goNevScrin5(View view) {
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
}
