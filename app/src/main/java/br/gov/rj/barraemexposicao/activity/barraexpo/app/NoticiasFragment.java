package br.gov.rj.barraemexposicao.activity.barraexpo.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by felipe on 22/05/14.
 */
public class NoticiasFragment extends Fragment{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View viewroot = inflater.inflate(R.layout.modelo_webview, container, false);

        WebView webView = (WebView) viewroot.findViewById(R.id.webview_modelo);
        webView.setWebViewClient(new CustomWebView());
        webView.loadUrl("http://www.kweekdesign.com.br/test/barraexpo/noticias.php");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return viewroot;
    }
}
