package com.reflex.customunityandroid;

import android.os.Bundle;
import android.util.Log;

import com.unity3d.player.UnityPlayerActivity;

/**
 * @author george.radu on 2019-08-21.
 */
public class AndroidUnityPlayerActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override
    public void onBackPressed() {
        // instead of calling UnityPlayerActivity.onBackPressed() we just ignore the back button event
        // super.onBackPressed();
    }

    public static void sendMessageToAndroid(String message) {
        Log.d("UNITY_DEBUGGING", "sendMessageToAndroid: " + message);
    }

}
