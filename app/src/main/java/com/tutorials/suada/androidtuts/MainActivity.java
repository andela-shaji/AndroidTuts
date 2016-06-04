package com.tutorials.suada.androidtuts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hLinearLayout(View view) {
        Intent intent = new Intent(this, HorizontalLinearLayout.class);
        startActivity(intent);
    }

    public void tableLayout(View view) {
        Intent tblIntent = new Intent(this, TableLayout.class);
        startActivity(tblIntent);
    }
    public void relativeLayout(View view) {
        Intent intent = new Intent(this, RelativeLayout.class);
        startActivity(intent);
    }
    public void vLinearLayout(View view) {
        Intent intent = new Intent(this, VerticalLinearLayout.class);
        startActivity(intent);
    }
    public void frameLayout(View view) {
        Intent intent = new Intent(this, FrameLayout.class);
        startActivity(intent);
    }
    public void scrollviewLayout(View view) {
        Intent intent = new Intent(this, ScrollViewActivity.class);
        startActivity(intent);
    }


}
