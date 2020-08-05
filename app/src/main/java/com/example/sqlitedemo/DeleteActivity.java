package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteActivity extends AppCompatActivity {

    EditText et_mobile;
    Button btn_delete;
    DataBaseHelper dataBaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        et_mobile = findViewById(R.id.et_mobile);
        btn_delete = findViewById(R.id.btn_delete);
        dataBaseHelper = new DataBaseHelper(this);

btn_delete.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        dataBaseHelper.deleteData(et_mobile.getText().toString());
        Toast.makeText(DeleteActivity.this,"Deleted",Toast.LENGTH_SHORT).show();
    }
});

    }
}
