package org.leolo.moneymanager2;

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

        final Button button_clearDB = (Button) findViewById(R.id.button_clearDB);
        button_clearDB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i(TAG,"Removing current DB");
                new DeleteDatabaseDialog().show(MainActivity.this);
            }
        });

    }
}
