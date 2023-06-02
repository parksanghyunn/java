package com.koreait;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;  //웹 뷰 선언
    private WebSettings myWebSetting;   //웹 세틴

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = (WebView)findViewById(R.id.webView);

        myWebView.setWebChromeClient(new WebChromeClient());    //자바스크립트 alert창 활성화
        myWebView.setWebViewClient(new WebViewClient());    //새창이 안뜨게 설정
        myWebSetting = myWebView.getSettings();     //지정한 웹 뷰의 세부 세팅 값 가져오기
        myWebSetting.setJavaScriptEnabled(true);    //웹페이지 자바스크리ㅂ트 허용여부
        myWebSetting.setSupportMultipleWindows(false);  //새창 띄우기 허용 여부
        myWebSetting.setJavaScriptCanOpenWindowsAutomatically(false);   //자바스크립트 새창 허용
        myWebSetting.setUseWideViewPort(true);  //화면 사이즈 맞추기 허용 요부
        myWebSetting.setSupportZoom(false); //줌 허용 여부
        myWebSetting.setLoadWithOverviewMode(true); //메타 태그 설정 여부
        myWebSetting.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);   //컨텐트 사이즈 맞추기
        myWebSetting.setCacheMode(WebSettings.LOAD_NO_CACHE);   //브라우저 캐시허용여부
        myWebSetting.setDomStorageEnabled(true);    //로컬 저장소 허용 여부

        myWebView.loadUrl("http://comypet.tk");
    }
}