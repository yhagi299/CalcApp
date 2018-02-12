package jp.techacademy.yasufumi.hagiwara.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_add = (Button) findViewById(R.id.button_add);
        button_add.setOnClickListener(this);

        Button button_sub = (Button) findViewById(R.id.button_sub);
        button_sub.setOnClickListener(this);

        Button button_mul = (Button) findViewById(R.id.button_mul);
        button_mul.setOnClickListener(this);

        Button button_div = (Button) findViewById(R.id.button_div);
        button_div.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED | InputType.TYPE_NUMBER_FLAG_DECIMAL);

        mEditText2 = (EditText) findViewById(R.id.editText2);
        mEditText2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED | InputType.TYPE_NUMBER_FLAG_DECIMAL);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("VALUE1", Float.parseFloat(mEditText1.getText().toString()));
        intent.putExtra("VALUE2", Float.parseFloat(mEditText2.getText().toString()));
        //Log.d("UI_PARTS", mEditText1.getText().toString());
        //Log.d("UI_PARTS", mEditText2.getText().toString());


        if (v.getId() == R.id.button_add){
            intent.putExtra("ARITH", 0);
        } else if (v.getId() == R.id.button_sub){
            intent.putExtra("ARITH", 1);
        } else if (v.getId() == R.id.button_mul){
            intent.putExtra("ARITH", 2);
        } else if (v.getId() == R.id.button_div){
            intent.putExtra("ARITH", 3);
        }

        startActivity(intent);

    }

}
