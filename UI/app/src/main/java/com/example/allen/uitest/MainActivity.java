package com.example.allen.uitest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private int sum = 0;
    private  ButtonListener buttonListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView01);
        System.out.println("收到了textView01:" + textView);

        button = (Button)findViewById(R.id.button01);
        buttonListener = new  ButtonListener();
        button.setOnClickListener(buttonListener);


        Button button2 = (Button)findViewById(R.id.button02);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, OtherActivity.class);
                startActivity(intent);
            }
        });
    }

    class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            sum ++;
            System.out.println("当前点击次数:" + sum);
            textView.setText("当前点击次数:" + sum);
        }

    }
}
