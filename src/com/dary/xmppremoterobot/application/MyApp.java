
package com.dary.xmppremoterobot.application;

import android.app.Application;
import android.content.Context;

import com.dary.xmppremoterobot.tools.CrashHandler;
import com.dary.xmppremoterobot.ui.MainActivity;

public class MyApp extends Application {

    private static Context mContext;
    private int status;
    private boolean isShouldRunning;

    @Override
    public void onCreate() {
        super.onCreate();
        isShouldRunning = false;
        status = MainActivity.NOT_LOGGED_IN;
        mContext = getApplicationContext();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }

    public static Context getContext() {
        return mContext;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int s) {
        this.status = s;
    }

    public boolean getIsShouldRunning() {
        return isShouldRunning;
    }

    public void setIsShouldRunning(boolean isShouldRunning) {
        this.isShouldRunning = isShouldRunning;
    }
}
