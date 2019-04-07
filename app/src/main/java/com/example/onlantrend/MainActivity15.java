package com.example.onlantrend;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity15 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

    }

    public void goNevScrin16(View view) {
        Intent intent = new Intent(this,MainActivity16.class);
        startActivity(intent);
    }

    public void goNevScrin17(View view) {
        Intent intent = new Intent(this,MainActivity17.class);
        startActivity(intent);
    }
}
