package org.leolo.moneymanager2;

import android.database.sqlite.SQLiteDatabase;

import java.io.File;

public class DatabaseManager {
    private static final DatabaseManager ourInstance = new DatabaseManager();

    public static final String DB_NAME = "main.db";

    public static DatabaseManager getInstance() {
        return ourInstance;
    }

    private DatabaseManager() {
    }

    public void deleteDB(){
        File f = new File(ApplicationContext.getAppContext().getFilesDir(), DB_NAME);
        f.deleteOnExit();
    }

    public boolean isDBExists(){
        File f = new File(ApplicationContext.getAppContext().getFilesDir(), DB_NAME);
        return f.exists() && f.canRead() && f.canWrite();
    }

    public SQLiteDatabase getDatabase(){
        return new DatabaseHelper(ApplicationContext.getAppContext(), DB_NAME, null, 1).getWritableDatabase();
    }
}
