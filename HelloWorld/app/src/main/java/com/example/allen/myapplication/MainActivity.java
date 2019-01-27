package com.example.allen.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.al.test.SchoolTest;
import com.animal.Dog;
import com.design.InstanceTest;
//import com.example.allen.myapplication.SubActivity;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        javaTest();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void javaTest() {
        Log.d(TAG, "javaTest: i am java test~");
        int i = 2019;
        Log.d(TAG, "javaTest i is:" + i);

        int[] intArray;
        String[] stringArray;
        intArray = new int[5];
        stringArray = new String[10];
        float[] floatArray = new float[4];

        SubActivity subActivity = new SubActivity();
        subActivity.outputInfo();

        SchoolTest test = new SchoolTest();
        test.testInfo();

        Dog dog = new Dog();
        dog.eat();

        Object obj = new Object();

        // ????
        InstanceTest one = InstanceTest.getInstance();
        InstanceTest two = InstanceTest.getInstance();
        Log.d(TAG, "javaTest: one and two:" + one + "|||" + two);
    }

    {
        Log.d(TAG, "instance initializer: ?????");
    }

    static  {
        Log.d(TAG, "static initializer: asd");
    }
}
