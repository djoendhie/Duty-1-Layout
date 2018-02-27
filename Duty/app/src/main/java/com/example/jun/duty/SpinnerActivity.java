package com.example.jun.duty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner spinner0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner0 =(Spinner)findViewById(R.id.spinner);

        spinner0.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    private class CustomOnItemSelectedListener
            implements android.widget.AdapterView.OnItemSelectedListener {

        String firstItem = String.valueOf(spinner0.getSelectedItem());

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

            Toast.makeText(parent.getContext(), "chose" + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();

            if (firstItem.equals(String.valueOf(spinner0.getSelectedItem()))){

                //TODO pas item ya dipilih
                Toast.makeText(parent.getContext(), "pilih : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
            }

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }
}
