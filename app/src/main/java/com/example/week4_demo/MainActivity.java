package com.example.week4_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String KEY1 ="MYKEY" ;
    private TextView mTv1;
    private TextView mTv2;
    private EditText mEt1;
    private Button   mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTv1= (TextView)findViewById(R.id.tv1);
        mTv2= (TextView)findViewById(R.id.tv2);
        mEt1= (EditText) findViewById(R.id.et1);
        mBtn= (Button)findViewById(R.id.btn1);

    }

    public void processClick(View view) {
        mTv1.setText(   mEt1.getText().toString()      );
    }

    public void moveToUI2(View view) {

        Intent myIntent= new Intent(this, MainActivity2.class);
        myIntent.putExtra(KEY1,mEt1.getText().toString());
        startActivity(myIntent);
    }

    public void goToAddress(View view) {
        String address="geo:0,0?q=Farmingdale+State+College+New York+USA";
        Intent newInt= new Intent(Intent.ACTION_VIEW);
        newInt.setData(Uri.parse(address));
        startActivity(newInt);
    }

    public void startPhone(View view) {
        Intent newInt= new Intent(Intent.ACTION_VIEW);
        newInt.setData(Uri.parse("tel:9344202000"));
        startActivity(newInt);
    }
}