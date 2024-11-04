package com.example.onlineexamsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class teacherlogin extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_login);
    }

    public void Register(View view){
        Intent intent = new Intent(this, teacher_register.class);
        startActivity(intent);
    }
}