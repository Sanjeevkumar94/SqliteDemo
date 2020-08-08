package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivty extends AppCompatActivity {
    EditText etName,etEmail,etNumber;
    DataBaseHelper dataBaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_activty);
        etName = findViewById(R.id.et_name);
        etEmail = findViewById(R.id.et_email);
        etNumber = findViewById(R.id.et_mobile);
        dataBaseHelper = new DataBaseHelper(this);


        findViewById(R.id.btn_update).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataBaseHelper.updateData(etNumber.getText().toString(),etName.getText().toString(),etEmail.getText().toString());
                Toast.makeText(UpdateActivty.this,"Update SuucessFully",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
