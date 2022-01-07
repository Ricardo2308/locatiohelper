package com.pendrogon.locationhelper;

import android.location.Location;

public class LocationHelper {

    public static float getDistanceInKM(double startLatitude, double startLongitude, double endLatitude, double endLongitude){
        float[] result = new float[0];
        Location.distanceBetween(startLatitude, startLongitude, endLatitude, endLatitude, result);
        return result[0]/1000;
    }
}
