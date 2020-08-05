package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertActivity extends AppCompatActivity {

    EditText et_name,et_mobile,et_email;
    Button btn_save;
    DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        et_name = findViewById(R.id.et_name);
        et_mobile = findViewById(R.id.et_mobile);
        et_email = findViewById(R.id.et_email);
        btn_save = findViewById(R.id.btn_save);
        dataBaseHelper = new DataBaseHelper(this);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               boolean result = dataBaseHelper.insertData(et_name.getText().toString(),Integer.parseInt(et_mobile.getText().toString()),et_email.getText().toString());

               if(result){
                   Toast.makeText(InsertActivity.this,"Data Saved",Toast.LENGTH_SHORT).show();
               }

            }
        });
    }

}
