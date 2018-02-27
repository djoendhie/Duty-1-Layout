package com.example.jun.duty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LinearActivity extends AppCompatActivity {

    @BindView(R.id.actSpinner)
    Button actSpinner;
    @BindView(R.id.actRadio)
    Button actRadio;
    @BindView(R.id.actCheck)
    Button actCheck;
    @BindView(R.id.actToogle)
    Button actToogle;
    @BindView(R.id.actEdittext)
    Button actEdittext;
    @BindView(R.id.actAlert)
    Button actAlert;
    @BindView(R.id.actCustom)
    Button actCustom;
    @BindView(R.id.actDate)
    Button actDate;
    @BindView(R.id.actTime)
    Button actTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.actSpinner)
    public void onActSpinnerClicked() {
        Intent spiner = new Intent(LinearActivity.this, SpinnerActivity.class);
        startActivity(spiner);
    }

    @OnClick(R.id.actRadio)
    public void onActRadioClicked() {
        Intent radio = new Intent(LinearActivity.this, RadioButtonActivity.class);
        startActivity(radio);
    }

    @OnClick(R.id.actCheck)
    public void onActCheckClicked() {

        Intent bos = new Intent(LinearActivity.this, CheckBoxActivity.class);
        startActivity(bos);
    }

    @OnClick(R.id.actToogle)
    public void onActToogleClicked() {
        Intent tg = new Intent(LinearActivity.this, ToggleButtonActivity.class);
        startActivity(tg);
    }

    @OnClick(R.id.actEdittext)
    public void onActEdittextClicked() {
        Intent et = new Intent(LinearActivity.this, EditTextActivity.class);
        startActivity(et);
    }

    @OnClick(R.id.actAlert)
    public void onActAlertClicked() {
    }

    @OnClick(R.id.actCustom)
    public void onActCustomClicked() {
    }

    @OnClick(R.id.actDate)
    public void onActDateClicked() {
        Intent dt = new Intent(LinearActivity.this, DateActivity.class);
        startActivity(dt);
    }

    @OnClick(R.id.actTime)
    public void onActTimeClicked() {
    }
}
