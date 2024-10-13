package com.example.onlineexamsystem;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

public class DBHelper {

    private Context con;
    private SQLiteDatabase db;

    public DBHelper(Context con) {this.con = con;}

    public DBHelper OpenDB() {
        DBConnector dbCon = new DBConnector(con);
        db = dbCon.getWritableDatabase();
        return this;
    }

    public boolean RegisterUser(User user){
        try {
            ContentValues cv = new ContentValues();
            cv.put("UserName", user.getUserName());
            cv.put("Email", user.getEmail());
            cv.put("Password", user.getPassword());

            db.insert("userinfo", null, cv);
            return true;

        } catch (Exception e) {
            Toast.makeText(con, e.getMessage(),Toast.LENGTH_LONG).show();
            return false;
        }
    }
}
