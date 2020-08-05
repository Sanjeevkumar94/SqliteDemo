package com.example.sqlitedemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLDataException;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final  String DATABASE_NAME="contacts.db";
    private  static final String TABLE_NAME ="contact";


    public DataBaseHelper(@Nullable Context context) {
        // it will create database when you will create object.
        super(context, DATABASE_NAME, null, 1);

        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_NAME+" (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,MOBILE_NUMBER INTEGER,EMAIL TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("drop table " + TABLE_NAME);
    onCreate(db);
    }



    public boolean insertData(String name, int mobile_number,String email){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("NAME",name);
        contentValues.put("MOBILE_NUMBER",mobile_number);
        contentValues.put("EMAIL",email);
       long result =  sqLiteDatabase.insert(TABLE_NAME,null,contentValues);

       if(result==-1)
           return  false;
           else
               return  true;
    }
}
