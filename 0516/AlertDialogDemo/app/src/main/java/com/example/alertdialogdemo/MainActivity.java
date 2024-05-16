package com.example.alertdialogdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAbout =(Button) findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(v ->{
            new  AlertDialog.Builder(this)
                    .setTitle("關於本書")
                    .setMessage("Android程式設計與運用\n作者:陳會安\n教師:恰克虎")
                    .setCancelable(true)
                    .setPositiveButton("確定",null)
                    .show();
        });

        Button btnEnd =(Button) findViewById(R.id.btnEnd);
        btnEnd.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("確認")
                        .setMessage("確認結束本程式?")
                        .setPositiveButton("確定",MainActivity.this)
                        .setNegativeButton("取消",MainActivity.this)
                        .show();
            }
        });

    }

    @Override
    public void onClick(DialogInterface dialog, int whith){
        switch (whith){
        case DialogInterface.BUTTON_POSITIVE:
            finish();
            break;
        case DialogInterface.BUTTON_NEGATIVE:
        Toast.makeText(this,"按下取消鈕!"Toast.LENGTH_SHORT).show();
        }
    }
    @Override


}