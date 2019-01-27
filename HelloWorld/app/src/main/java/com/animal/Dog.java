package com.animal;

import android.util.Log;

public class Dog extends Animal implements IPhoto {
    public static final String TAG = "Animal";

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void photo() {
        Log.d(TAG, "photo: got dog interface");
    }
}
