package pl.wojtek.serviceprojectsample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Wojtek M on 2014-11-23.
 */
public class MyStartServiceReciver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intentService = new Intent(context, CheesesService.class);
        context.startService(intentService);


    }
}
