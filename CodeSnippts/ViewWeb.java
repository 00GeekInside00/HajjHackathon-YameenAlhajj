package com.hajj.al.yamen;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ViewWeb extends Activity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_web);
        WebView wb = new WebView(this);
        wb.loadUrl("file:///android_asset/Table.html");
        setContentView(wb);
    }
}