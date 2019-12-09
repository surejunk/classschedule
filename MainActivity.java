package com.example.schedule;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }
    private void initView() {
        // 대상초기화
        Button mBtMainLogout = findViewById(R.id.bt_main_logout);
        mBtMainLogout.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.bt_main_logout) {
            Intent intent = new Intent(this, loginActivity.class);
            startActivity(intent);
            finish();
        }
    }

}
