package io.zetaphase.nfctester;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by xeliot on 5/3/17.
 */

public class SplashScreen extends Activity{
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, DevicesList.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}