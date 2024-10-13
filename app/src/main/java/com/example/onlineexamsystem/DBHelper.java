package com.example.onlineexamsystem;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper {

    private Context con;
    private SQLiteOpenHelper db;

    public DBHelper(Context con) {this.con = con;}

    public DBHelper OpenDB() {
        DBConnector dbCon = new DBConnector(con);
        db = dbCon.getWritableDatabase();
        return this;
    }

    public boolean RegisterUser(User user){

    }
}
