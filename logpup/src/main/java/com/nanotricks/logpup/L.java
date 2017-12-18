package com.nanotricks.logpup;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by user on 12/18/2017.
 */

public class L {
    private static String TAG="LogPup";

    public static void d(String msg){
        Log.d(TAG,msg);
    }
    public static void e(String msg){
        Log.d(TAG,msg);
    }
    public static void t(Context con, String msg){
        Toast.makeText(con,msg,Toast.LENGTH_LONG).show();
    }
}
