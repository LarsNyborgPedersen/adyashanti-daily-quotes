package com.example.larsnyborgpedersen.adyashantidailyquotes;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

public  class NotificationClass extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        Intent repeating_intent = new Intent(context, Repeating_Activity.class);
        repeating_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pendingIntent = PendingIntent.getActivity(context, 100, repeating_intent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "ID")
                .setContentIntent(pendingIntent)
                .setSmallIcon(R.drawable.adyashanti123)
                .setContentTitle("Adyashanti")
                .setContentText("Dette er et quote fra Adyashanti")
                .setAutoCancel(true);

        notificationManager.notify(100, builder.build());
    }
}
