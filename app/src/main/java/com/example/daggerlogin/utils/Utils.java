package com.example.daggerlogin.utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class Utils {
    public static void showToastMessage(Context context, String message){
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }
}
