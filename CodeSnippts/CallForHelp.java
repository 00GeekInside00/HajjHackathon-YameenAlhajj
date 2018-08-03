package com.hajj.al.yamen;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.Manifest;

import android.view.View;


public class CallForHelp extends AppCompatActivity {
    int MY_PERMISSIONS_REQUEST_CALL_PHONE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callforhelp);

        MY_PERMISSIONS_REQUEST_CALL_PHONE=1;

    }
    public void CallLeader(View v) {
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.CALL_PHONE},
                MY_PERMISSIONS_REQUEST_CALL_PHONE);
        Intent CallIntent= new Intent();
        CallIntent.setAction(Intent.ACTION_CALL);
        CallIntent.setData(Uri.parse("tel:0554550916"));
        startActivity(CallIntent);


    }
    public void CallMedic(View view) {
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.CALL_PHONE},
                MY_PERMISSIONS_REQUEST_CALL_PHONE);
        Intent CallIntent= new Intent();
        CallIntent.setAction(Intent.ACTION_CALL);
        CallIntent.setData(Uri.parse("tel:0507635894"));
        startActivity(CallIntent);


    }
    public void CallPolice(View view) {
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.CALL_PHONE},
                MY_PERMISSIONS_REQUEST_CALL_PHONE);
        Intent CallIntent= new Intent();
        CallIntent.setAction(Intent.ACTION_CALL);
        CallIntent.setData(Uri.parse("tel:0554936485"));
        startActivity(CallIntent);


    }
}
