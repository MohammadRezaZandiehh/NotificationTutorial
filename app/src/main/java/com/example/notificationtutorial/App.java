package com.example.notificationtutorial;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;

public class App extends Application {

    //har codi k bekhaym  avale ejraye application ejra beshe dakhele in class gharar midim


    @Override
    public void onCreate() {
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            NotificationChannel notificationChannel = new NotificationChannel("myapp", "defult channel", NotificationManager.IMPORTANCE_HIGH);
            notificationChannel.setDescription("this notification channel used for test");
            if (notificationManager != null)
            notificationManager.createNotificationChannel(notificationChannel);

        }

    }
}
