package com.example.jun.duty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RadioButtonActivity extends AppCompatActivity implements android.widget.RadioGroup.OnCheckedChangeListener {

    @BindView(R.id.Durian)
    RadioButton Durian;
    @BindView(R.id.Cubadak)
    RadioButton Cubadak;
    @BindView(R.id.Anggur)
    RadioButton Anggur;
    @BindView(R.id.Strawberry)
    RadioButton Strawberry;
    @BindView(R.id.Mangga)
    RadioButton Mangga;
    @BindView(R.id.RadioGroup)
    android.widget.RadioGroup RadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        ButterKnife.bind(this);

        RadioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int Dipilih) {
        if (Dipilih == R.id.Durian) {
            Toast.makeText(this, "Taragak Makan Durian", Toast.LENGTH_SHORT).show();
        }

        if (Dipilih == R.id.Cubadak) {
            Toast.makeText(this, "Taragak Makan Cubadak", Toast.LENGTH_SHORT).show();
        }

        if (Dipilih == R.id.Anggur) {
            Toast.makeText(this, "Taragak Makan Anggur", Toast.LENGTH_SHORT).show();
        }
        if (Dipilih == R.id.Strawberry) {
            Toast.makeText(this, "Taragak Makan Strawberry", Toast.LENGTH_SHORT).show();
        }
        if (Dipilih == R.id.Mangga) {
            Toast.makeText(this, "Taragak Makan Mangga", Toast.LENGTH_SHORT).show();
        }

    }
}
