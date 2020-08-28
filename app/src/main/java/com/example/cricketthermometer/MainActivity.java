package com.example.cricketthermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout mainScreen;
    Button btnGo;
    TextView tvContent;
    EditText etCricketChipsNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainScreen = (LinearLayout) findViewById(R.id.mainScreen);
        btnGo = findViewById(R.id.btnGo);
        tvContent = findViewById(R.id.tvContent);
        etCricketChipsNumber = findViewById(R.id.etCricketChipsNumber);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nbCricketChips = Integer.parseInt(etCricketChipsNumber.getText().toString());
                double temperature = nbCricketChips/3.0 +4.0;
                etCricketChipsNumber.setText("");
                showTemperature(temperature);

            }
        });



    }
    private void showTemperature (double temperature)
    {
        tvContent.setText(Double.toString(temperature));
        if (temperature <15)
        {
            tvContent.setTextColor(getResources().getColor(R.color.dark));
            mainScreen.setBackgroundColor(getResources().getColor(R.color.grey));
            btnGo.setTextColor(getResources().getColor(R.color.dark));
            btnGo.setBackgroundColor(getResources().getColor(R.color.grey));
        }
        else if (temperature<20)
        {
            tvContent.setTextColor(getResources().getColor(R.color.dark));
            mainScreen.setBackgroundColor(getResources().getColor(R.color.light_red));
            btnGo.setTextColor(getResources().getColor(R.color.dark));
            btnGo.setBackgroundColor(getResources().getColor(R.color.light_red));
        }
        else if(temperature<30)
        {
            tvContent.setTextColor(getResources().getColor(R.color.grey));
            mainScreen.setBackgroundColor(getResources().getColor(R.color.orange));
            btnGo.setTextColor(getResources().getColor(R.color.grey));
            btnGo.setBackgroundColor(getResources().getColor(R.color.orange));
        }
        else if(temperature<35)
        {
            tvContent.setTextColor(getResources().getColor(R.color.grey));
            mainScreen.setBackgroundColor(getResources().getColor(R.color.red));
            btnGo.setTextColor(getResources().getColor(R.color.grey));
            btnGo.setBackgroundColor(getResources().getColor(R.color.red));
        }
        else
        {
            tvContent.setTextColor(getResources().getColor(R.color.grey));
            mainScreen.setBackgroundColor(getResources().getColor(R.color.dark_red));
            btnGo.setTextColor(getResources().getColor(R.color.grey));
            btnGo.setBackgroundColor(getResources().getColor(R.color.dark_red));
        }

    }


}