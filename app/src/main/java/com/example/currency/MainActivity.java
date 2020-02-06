package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        TextView text = (TextView) findViewById(R.id.editText);
        Intent intent = new Intent(this, Main2Activity.class);
        int dollars = -1;
        try {
            dollars = Integer.parseInt(text.getText().toString());
        }catch(Exception e){
            Toast.makeText(MainActivity.this, "Invalid number", Toast.LENGTH_LONG).show();
        }
        if (dollars < 0 || dollars > 100000){
            Toast.makeText(MainActivity.this, "Invalid number", Toast.LENGTH_LONG).show();
        }else{
            double pounds = dollars * 0.77;
            intent.putExtra("dollars", pounds);
            startActivity(intent);
        }

    }
}
