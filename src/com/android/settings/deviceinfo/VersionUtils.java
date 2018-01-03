
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getdotOSVersion(){
        return SystemProperties.get("ro.dot.display.version","");
    }
}