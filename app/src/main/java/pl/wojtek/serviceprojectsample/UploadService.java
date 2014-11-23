package pl.wojtek.serviceprojectsample;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;

/**
 * Created by Wojtek M on 2014-11-23.
 */
public class UploadService extends IntentService {

    public UploadService() {
        super("Upload service");
        setIntentRedelivery(true);

    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String where=intent.getStringExtra("where");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {


        }
        Notification.Builder builder=new Notification.Builder(this);
        builder.setSmallIcon(R.drawable.ic_launcher);
        builder.setContentTitle("uploaded");
        builder.setContentText("uploaded to "+where);
        NotificationManager notificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(1,builder.build());

    }
}
