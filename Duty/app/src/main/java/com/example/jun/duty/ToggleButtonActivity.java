package com.example.jun.duty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {

    ToggleButton tb1, tb2;
    TextView TV1, TV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        tb1 = (ToggleButton) findViewById(R.id.tb1);
        tb2 = (ToggleButton) findViewById(R.id.tb2);

        TV1 = (TextView) findViewById(R.id.TV1);
        TV2 = (TextView) findViewById(R.id.TV2);

        tb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean centang) {

                if (centang) {
                    TV1.setText("Toggle Button is ON");
                } else {
                    TV1.setText("Toggle Button is Off");
                }
            }
        });

        tb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    TV2.setText("Toggle Button is ON");
                } else {
                    TV2.setText("Toggle Button is off");
                }
            }
        });

        if (tb1.isChecked()) {
            TV1.setText("Toogle Button is ON");
        } else {
            TV1.setText("Toogle Button is off");
        }

        if (tb2.isChecked()) {
            TV2.setText("Toggle Button is ON");
        } else {
            TV2.setText("Toggle Button is Off");

        }
    }
}

