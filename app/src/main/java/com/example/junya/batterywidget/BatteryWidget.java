package com.example.junya.batterywidget;

import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by Junya on 15/05/05.
 */
public class BatteryWidget extends AppWidgetProvider{
    @Override
    public void onUpdate(Context c,AppWidgetManager awm,int[] awi){
        Intent in = new Intent(c, WidgetService.class);
        c.startService(in);
    }

    public static class WidgetService extends Service{
        @Override
        public void onStart(Intent in, int si){

        }

        @Override
        public IBinder onBind(Intent intent) {
            return null;
        }
    }
}
