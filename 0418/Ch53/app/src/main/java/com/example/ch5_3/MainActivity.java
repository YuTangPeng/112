package com.example.ch5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener {

    private  float original_size=10;
    private TextView txvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView txvOutput=(TextView) findViewById(R.id.txvOutput);
        //txvOutput.setTextSize(original_size);
        txvOutput=(TextView)findViewById(R.id.txvOutput);
        txvOutput.setTextSize(TypedValue.COMPLEX_UNIT_PX,original_size);
        Button btnEnlarge=(Button) findViewById(R.id.btnEnlarge);
        btnEnlarge.setOnClickListener(this);
        btnEnlarge.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v){
        float size=txvOutput.getTextSize();
        Log.V("SIZE","size=" + px2sp(this,size));
        txvOutput.setTextSize(px2sp(this,size)+5);
    }
    @Override
    public boolean onLongClick(View v){
        txvOutput.setTextSize(TypedValue.COMPLEX_UNIT_PX,original_size);
        return false;
    }

    public static int px2sp(Context context,float pxValue){
        final float fonScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int)(pxValue / +0.5f);
    }
}