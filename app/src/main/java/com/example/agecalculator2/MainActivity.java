package com.example.agecalculator2;
import java.time.LocalDateTime;

import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private Button Get;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.etNum1);
        Get = (Button) findViewById(R.id.Get);
        result = (TextView)findViewById(R.id.textView);

        Get.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int year = Calendar.getInstance().get(Calendar.YEAR);

                int Get = year-number1;
                result.setText("YOUR ARE: "  + String.valueOf(Get) + "  YEARS OLD");

            }
        });

    }
}