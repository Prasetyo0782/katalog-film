package com.asetyoo.pesutmovie;

import android.app.Application;
import android.content.Context;

import com.asetyoo.pesutmovie.Helper.LocalHelper;

public class MainAplication extends Application {

    //press Ctrl+o

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocalHelper.onAttach(base,"en"));
    }
}
