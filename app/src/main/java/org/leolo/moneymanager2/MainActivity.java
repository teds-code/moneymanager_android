package org.leolo.moneymanager2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Activity.Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Log.i(TAG,"Application started");
        updateVisibility();
        final Button button_clearDB = (Button) findViewById(R.id.button_clearDB);

        button_clearDB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i(TAG,"Removing current DB");
                new DeleteDatabaseDialog().show(MainActivity.this);
            }
        });

        ((Button)findViewById(R.id.button_config)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Open config activity");
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
                updateVisibility();
            }
        });
    }

    private void updateVisibility(){
        SharedPreferences prefs =
                PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        if(prefs.getBoolean("debug.enable",false)){
            Log.d(TAG,"Debug mode off");
            findViewById(R.id.button_clearDB).setVisibility(View.INVISIBLE);
        }else{
            Log.d(TAG,"Debug mode On");
            findViewById(R.id.button_clearDB).setVisibility(View.VISIBLE);
        }
    }
}
