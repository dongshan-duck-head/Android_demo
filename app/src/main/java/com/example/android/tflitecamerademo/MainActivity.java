package com.example.android.tflitecamerademo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView wv = (WebView)findViewById(R.id.form);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSft6o4H995s9UtPHOPM3slwMfmHZNdyF-P-WV4BBGBEWd2Lhw/viewform");


    }
}
