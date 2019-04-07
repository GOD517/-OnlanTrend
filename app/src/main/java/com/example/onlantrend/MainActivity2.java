package com.example.onlantrend;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    public void goNevScrin3(View view) {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void goNevScrin15(View view) {
        Intent intent = new Intent(this,MainActivity15.class);
        startActivity(intent);
    }
}
