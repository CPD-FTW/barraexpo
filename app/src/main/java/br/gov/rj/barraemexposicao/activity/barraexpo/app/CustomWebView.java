package br.gov.rj.barraemexposicao.activity.barraexpo.app;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by felipe on 21/05/14.
 */
public class CustomWebView extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url){
        if (Uri.parse(url).getHost().equals("http://www.kweekdesign.com.br")){
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, url);
    }
}
