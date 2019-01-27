package com.al.test;

import android.util.Log;

import com.al.model.Subject;

public class SchoolTest {
    public static final String TAG = "SchoolTest";


    public void testInfo() {
        Subject sub1 = new Subject("myalname", "456", 56);
        Log.d(TAG, "===================== got");
        sub1.outputInfo();
    }
}
