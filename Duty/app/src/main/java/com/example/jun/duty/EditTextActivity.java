package com.example.jun.duty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EditTextActivity extends AppCompatActivity {

    @BindView(R.id.Biasa)
    EditText Biasa;
    @BindView(R.id.Angka)
    EditText Angka;
    @BindView(R.id.Telpon)
    EditText Telpon;
    @BindView(R.id.Email)
    EditText Email;
    @BindView(R.id.PassT)
    EditText PassT;
    @BindView(R.id.PassN)
    EditText PassN;
    @BindView(R.id.Uri)
    EditText Uri;
    @BindView(R.id.tampil)
    Button tampil;
    @BindView(R.id.text)
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tampil)
    public void onViewClicked() {
        String biasa = Biasa.getText().toString();
        String angka = Angka.getText().toString();
        String telpon = Telpon.getText().toString();
        String email = Email.getText().toString();
        String passT= PassT.getText().toString();
        String passN= PassN.getText().toString();
        String uri= Uri.getText().toString();

        if (biasa.isEmpty()){

        }

        text.setText("Isi: " + biasa + " " + angka + " " +telpon+ " " + email+" "+uri+" ");
    }
}
