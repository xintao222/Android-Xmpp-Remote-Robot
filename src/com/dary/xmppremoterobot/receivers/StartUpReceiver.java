
package com.dary.xmppremoterobot.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.dary.xmppremoterobot.service.MainService;
import com.dary.xmppremoterobot.tools.Tools;

public class StartUpReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        SharedPreferences mPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        boolean isStartAtBoot = mPrefs.getBoolean("isStartAtBoot", true);
        if (isStartAtBoot) {
            Tools.doLogJustPrint("StartUp Service");
            Intent startserviceintent = new Intent(context, MainService.class);
            context.startService(startserviceintent);
        }
    }
}
