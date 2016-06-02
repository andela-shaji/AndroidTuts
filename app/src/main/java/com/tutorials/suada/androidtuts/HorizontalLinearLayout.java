package com.tutorials.suada.androidtuts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HorizontalLinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_linear_layout);
    }
    public void relativeLayout(View view) {
        Intent intent = new Intent(this, RelativeLayout.class);
        startActivity(intent);
    }
}
