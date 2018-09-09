package org.leolo.moneymanager2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;

public class DeleteDatabaseDialog {

    public static final String TAG = "Function.deleteDB";


    public void show(Activity activity) {
        Log.d(TAG,"show() called");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setMessage(R.string.str_msg_deleteDB)
            .setPositiveButton(R.string.str_general_confirm, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    Log.i(TAG,"User confirmed to remove DB");
                    // Delete the database and close the application

                    System.exit(0);
                }
            }).setNegativeButton(R.string.str_general_cancel,new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //Do nothing.
                }
        });
        // Create the AlertDialog object and return it
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}