package com.example.avilashdas.servicesdemoapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

//Created by Avilash.Das on 14-Dec-17.

public class NewService extends Service {

    private  MediaPlayer media;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;     //  don’t want to allow binding, then it should return null.
    }
    /*This method is called, when another component wants to bind with the service by calling bindService().
    In your implementation of this method, you must provide an interface that clients use to communicate with the service,
    by returning an IBinder. */

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        media = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        media.setLooping(true);
        media.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        media.stop();

    }
}
