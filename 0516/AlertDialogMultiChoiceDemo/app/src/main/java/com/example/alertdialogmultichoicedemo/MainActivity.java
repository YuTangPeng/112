package com.example.alertdialogmultichoicedemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    implements DialogInterface.OnClickListener

    {


        private String[] items = {"Samsung", "OPPO", "Apple", "ASUS"};

        private boolean[] itemChecked = new boolean[4];

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSelect = (Button) findViewById(R.id.btnSelect);
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog build = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("請勾選選項?")
                        .setPositiveButton("確定", null)
                        .setNegativeButton("取消", null)
                        .setMultiChoiceItems(MainActivity.items, itemsChecked, null)
                        .show();
            }
        });
    }
    @Override
            public void onClick(DialogInterface dialog,int which){
            String msg ="";
            switch (which){
                case DialogInterface.BUTTON_POSITIVE::
                        for(int index =0;index)
            }
        }
    }
}