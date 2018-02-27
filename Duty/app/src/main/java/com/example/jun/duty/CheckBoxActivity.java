package com.example.jun.duty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CheckBoxActivity extends AppCompatActivity {

    @BindView(R.id.cb1)
    CheckBox cb1;
    @BindView(R.id.cb2)
    CheckBox cb2;
    @BindView(R.id.cb3)
    CheckBox cb3;
    @BindView(R.id.cb4)
    CheckBox cb4;
    @BindView(R.id.cb5)
    CheckBox cb5;
    @BindView(R.id.cb6)
    CheckBox cb6;
    @BindView(R.id.cb7)
    CheckBox cb7;
    @BindView(R.id.cb8)
    CheckBox cb8;
    @BindView(R.id.btn1)
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn1)
    public void onViewClicked() {
        String a = "";
        if (cb1.isChecked()){
            a+="Sakampuang wak mah \n";
        }
        if (cb2.isChecked()){
            a+="oppss... dakek kampuang wak mah \n";
        }
        if (cb3.isChecked()){
            a+="Kok naiak travel bara onkos kasitu da? \n";
        }
        if (cb4.isChecked()){
            a+="Sakampuang jo sanak wak mah";
        }
        if (cb5.isChecked()){
            a+="Dima tu bang dakek Pantai ndak?";
        }
        if (cb6.isChecked()){
            a+="Lamak sate d situ raso e ndak bg?";
        }
        if (cb7.isChecked()){
            a+="Jauah dari Payakumbuah ndak?";
        }
        if (cb8.isChecked()){
            a+="Dingin situ ndak bang?";
        }

        Toast.makeText(this, " \n" + a, Toast.LENGTH_SHORT).show();
    }
}
