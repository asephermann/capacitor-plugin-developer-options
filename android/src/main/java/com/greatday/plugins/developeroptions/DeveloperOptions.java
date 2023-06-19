package com.greatday.plugins.developeroptions;

import android.util.Log;

public class DeveloperOptions {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
