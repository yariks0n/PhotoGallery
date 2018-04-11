package com.droid.ykozh.photogallery;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, PhotoGalleryActivity.class);
    }

    @Override
    protected android.support.v4.app.Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
