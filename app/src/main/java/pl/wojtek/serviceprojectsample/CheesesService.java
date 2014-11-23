package pl.wojtek.serviceprojectsample;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import hugo.weaving.DebugLog;

/**
 * Created by Wojtek M on 2014-11-23.
 */
public class CheesesService extends Service {


    private String[] cheese = CheeseClass.CHEESES;


    private List<String> stringList = new ArrayList<String>();
    private Random randrom = new Random();
    private final IBinder iBinder=new MyBinder();

    @Override
    @DebugLog
    public int onStartCommand(Intent intent, int flags, int startId) {

        stringList.add(cheese[randrom.nextInt(cheese.length)]);

        return START_NOT_STICKY;
    }

    class MyBinder extends Binder {
        CheesesService getService(){
            return CheesesService.this;
        }
    }


    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }


    public List<String> getStringList() {
        return stringList;
    }
}
