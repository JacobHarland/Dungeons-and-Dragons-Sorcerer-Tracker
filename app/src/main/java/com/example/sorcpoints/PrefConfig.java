package com.example.sorcpoints;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefConfig {

    private static final String MY_PREFERENCE_NAME = "com.example.sorcpoints";
    private static final String PREF_TOTAL_KEY = "pref_total_key";
    private static final String PREF_SORC_LEVEL = "pref_sorc_level";

    public static void saveTotalInPref(Context context, String total) {
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(PREF_TOTAL_KEY, total);
        editor.apply();
    }

    public static void saveSorcLevelPref(Context context, int sorcLevel) {
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(PREF_SORC_LEVEL, sorcLevel);
        editor.apply();
    }

    public static int loadSorcLevelFromPref(Context context) {
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        return pref.getInt(PREF_SORC_LEVEL, 0);
    }

    public static String loadTextViewFromPref(Context context) {
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        return pref.getString(PREF_TOTAL_KEY, "");
    }

}