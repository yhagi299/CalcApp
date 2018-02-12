package jp.techacademy.yasufumi.hagiwara.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Float value1 = intent.getFloatExtra("VALUE1", 0);
        Float value2 = intent.getFloatExtra("VALUE2", 0);

        //Log.d("UI_PARTS", String.valueOf(value1));
        //Log.d("UI_PARTS", String.valueOf(value2));

        int arith = intent.getIntExtra("ARITH", 0);
        //Log.d("UI_PARTS", String.valueOf(arith));

        TextView textView = (TextView) findViewById(R.id.textView);

        if (arith == 0){
            textView.setText(String.valueOf(value1+value2));
        } else if (arith == 1){
            textView.setText(String.valueOf(value1-value2));
        } else if (arith == 2){
            textView.setText(String.valueOf(value1*value2));
        } else if (arith == 3){
            textView.setText(String.valueOf(value1/value2));
        }


    }
}
