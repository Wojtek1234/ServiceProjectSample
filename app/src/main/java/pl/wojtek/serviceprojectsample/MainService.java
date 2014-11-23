package pl.wojtek.serviceprojectsample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by Wojtek M on 2014-11-23.
 */
public class MainService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
