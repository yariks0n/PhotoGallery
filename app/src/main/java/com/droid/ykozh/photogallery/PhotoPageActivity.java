package com.droid.ykozh.photogallery;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.webkit.WebView;

public class PhotoPageActivity extends SingleFragmentActivity {

    private PhotoPageFragment pi;

    public static Intent newIntent(Context context, Uri photoPageUri) {
        Intent i = new Intent(context, PhotoPageActivity.class);
        i.setData(photoPageUri);
        return i;
    }

    @Override
    protected Fragment createFragment() {
        pi = PhotoPageFragment.newInstance(getIntent().getData());
        return pi;
    }

    @Override
    public void onBackPressed() {
        if(pi.getWebView().canGoBack()){
            pi.getWebView().goBack();
        }else{
            super.onBackPressed();
        }
    }

}
