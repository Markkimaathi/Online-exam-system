package com.example.onlineexamsystem;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBConnector  extends SQLiteOpenHelper {

    public DBConnector(Context context) {super(context,"DB",null,1);}

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table cleanerInfo(UserName VARCHAR UNIQUE, Tel VARCHAR, Address VARCHAR, Password VARCHAR)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
