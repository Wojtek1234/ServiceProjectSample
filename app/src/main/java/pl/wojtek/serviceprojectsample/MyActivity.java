package pl.wojtek.serviceprojectsample;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Calendar;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void clickButton(View view) {
     /*   Intent intent =new Intent(this,UploadService.class);
        intent.putExtra("where","Suped Duper");
        startService(intent);*/
        AlarmManager alarmManager=(AlarmManager)getSystemService(ALARM_SERVICE);
        Intent intent1 = new Intent(this, MyStartServiceReciver.class);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
        alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, Calendar.getInstance().getTimeInMillis(),1000*5,broadcast);

    }
}
