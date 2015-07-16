package com.dermandar.panoramal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by tzury on 16/07/15.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intentViewer = new Intent(this, ViewerActivity.class);
        intentViewer.putExtra("PanoramaName", "20150716_162848");
        startActivity(intentViewer);

        finish();
    }


}
