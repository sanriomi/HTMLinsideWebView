package id.ac.teknokrat.htmlinsidewebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import kotlin.jvm.internal.Intrinsics;

public class MainActivity extends AppCompatActivity {
    WebView mWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebview = (WebView) findViewById(R.id.webview);
        WebSettings sett = mWebview.getSettings();
        Intrinsics.checkNotNullExpressionValue(sett, "myWebView.settings");
        sett.getJavaScriptEnabled();
        WebSettings setts = mWebview.getSettings();
        Intrinsics.checkNotNullExpressionValue(setts, "myWebView.settings");
        setts.getAllowUniversalAccessFromFileURLs(true);
        mWebview.loadUrl("file:///android_asset/index.html");

    }
}