package com.cellcom.util;

import android.app.Activity;
import android.widget.Toast;

/**
 * Toast.LENGTH_SHORT 2s
 * <p/>
 * Toast.LENGTH_LONG  3.5s
 */
public class SimpleToast {
    public static void show(Activity activity, String msg) {
        Toast toast = Toast.makeText(activity, msg, Toast.LENGTH_SHORT);
        toast.show();
    }

    public static void showLong(Activity activity, String msg) {
        Toast toast = Toast.makeText(activity, msg, Toast.LENGTH_LONG);
        toast.show();
    }
}
