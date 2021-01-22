package com.example.bai3manhinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KetQua extends AppCompatActivity {
    Button btnOK;
    EditText KetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);
        Bundle bundle = new Bundle();
        Intent intent =getIntent();
        //bundle=getE
        KetQua = (EditText)findViewById(R.id.txtKetQuaHienThi);


    }
}