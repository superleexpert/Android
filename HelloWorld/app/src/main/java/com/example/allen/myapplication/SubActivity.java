package com.example.allen.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SubActivity extends AppCompatActivity {
    public static final String TAG = "SubActivity";

    public void outputInfo() {
        Log.d(TAG, "outputInfo: got sub activity!");

        Cat cat = new Cat("xiaobai");
        cat.setName("xiaobai");
        cat.run();
        cat.eat();

        Cat cat2 = new Cat("hh", 2, 100, "China");
        Cat.price = 3000;
        Log.d(TAG, "outputInfo: " + cat2);
    }
}

class Cat {
    public static final String TAG = "Cat";

    private String name;
    int month;
    double weight;
    String species;
    static int price;

    public void setName(String name) {
        this.name = name;
    }

    private String getName() {
        return "我的名字是：" + this.name;
    }

    public Cat() {
        Log.d(TAG, "Cat: 无参构造方法");
    }

    public Cat(String name) {
        Log.d(TAG, "Cat: 无参构造方法");
    }

    public Cat(String name,int month, double weight, String species) {
        this.name = name;
        this.month = month;
        this.weight = weight;
        this.species = species;
        Log.d(TAG, "Cat: 带参构造方法");
    }

    public void run() {
        Log.d(TAG, "run: quick快跑");
    }

    public void eat() {
        Log.d(TAG, "eat: fish");
    }
}