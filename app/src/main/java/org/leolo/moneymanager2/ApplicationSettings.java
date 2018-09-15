package org.leolo.moneymanager2;

import android.database.sqlite.SQLiteDatabase;

public class ApplicationSettings {
    private static final ApplicationSettings ourInstance = new ApplicationSettings();

    public static ApplicationSettings getInstance() {
        return ourInstance;
    }

    private ApplicationSettings() {
        SQLiteDatabase db = DatabaseManager.getInstance().getDatabase();
    }
}
