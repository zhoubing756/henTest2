package com.youdu.application;

import android.app.Application;
/*

 */
public class ImoocApplication extends Application {
    private static ImoocApplication mApplication = null;
    public static ImoocApplication getInstance() {
        return mApplication;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;

    }
}
