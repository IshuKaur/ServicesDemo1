package com.example.ishpreetkaur.servicesdemo1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Ishpreet Kaur on 16-12-2017.
 */

public class ServiceClass extends Service
{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(ServiceClass.this, "Service is Started", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {

        Toast.makeText(ServiceClass.this, "Service is Stopped", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
