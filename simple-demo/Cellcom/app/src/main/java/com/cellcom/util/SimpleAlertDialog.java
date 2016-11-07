package com.cellcom.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;

/**
 * 简单的提示框
 */
public class SimpleAlertDialog {

    public static AlertDialog alert(final Activity activity, String title, String message) {
        return new AlertDialog.Builder(activity).setTitle(title).setMessage(message).
                setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d(activity.getClass().getSimpleName(), "");
                    }
                }).show();
    }
}
