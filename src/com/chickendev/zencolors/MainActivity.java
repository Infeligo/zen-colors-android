package com.chickendev.zencolors;

import android.os.Bundle;
import org.apache.cordova.Config;
import org.apache.cordova.DroidGap;


public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl(Config.getStartUrl());
    }
}
