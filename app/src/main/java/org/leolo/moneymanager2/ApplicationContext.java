package org.leolo.moneymanager2;

import android.app.Application;
import android.content.Context;

public class ApplicationContext  extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        ApplicationContext.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return ApplicationContext.context;
    }
}
