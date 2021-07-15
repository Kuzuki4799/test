package com.shockwave.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn4k;
    private Button btnHd;
    private Button btnCool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn4k = findViewById(R.id.btn4k);
        btnHd = findViewById(R.id.btnHd);
        btnCool = findViewById(R.id.btnCool);

        btn4k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handlerIntentWebView("https://www.dota2.com/home");
            }
        });

        btnHd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handlerIntentWebView("https://lienminh.garena.vn/");
            }
        });

        btnCool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handlerIntentWebView("https://pubgm.zing.vn/");
            }
        });
    }

    private void handlerIntentWebView(String url) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this, WebActivity.class);
        bundle.putString(ParamUtils.URL, url);
        intent.putExtra(ParamUtils.BUNDLE_KEY, bundle);
        startActivity(intent);
    }
}