package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

public class SerachContactActivity extends AppCompatActivity {
    EditText et_name,et_mobile,et_email;
    Button btn_search;
    DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serach_contact);
        et_name = findViewById(R.id.et_name);
        et_mobile = findViewById(R.id.et_mobile);
        et_email = findViewById(R.id.et_email);
        btn_search = findViewById(R.id.btn_search);
        dataBaseHelper = new DataBaseHelper(this);

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor =dataBaseHelper.getdata(et_mobile.getText().toString());
                while (cursor.moveToNext()){
                    et_name.setText(cursor.getString(1));
                    et_email.setText(cursor.getString(3));
                }
            }
        });
    }
}
