package com.example.bai3manhinh;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.SocketAddress;

public class Nhap extends AppCompatActivity {
    double a,b,c;
    EditText Soa,Sob,Soc;
    Button btnOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap);

        btnOK = (Button) findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                Bundle bundle = new Bundle();
                Soa=(EditText)findViewById(R.id.txtSoa);
                Sob=(EditText)findViewById(R.id.txtSob);
                Soc=(EditText)findViewById(R.id.txtSoc);
                a= Float.parseFloat(String.valueOf(Soa.getText()));
                b= Float.parseFloat(String.valueOf(Sob.getText()));
                c= Float.parseFloat(String.valueOf(Soc.getText()));
                bundle.putDouble("a",a);
                bundle.putDouble("b",b);
                bundle.putDouble("c",c);
                i.putExtras(bundle);
                setResult(Activity.RESULT_OK, i);
                finish();
            }
        });
    }
}