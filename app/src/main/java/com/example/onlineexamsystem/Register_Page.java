package com.example.onlineexamsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register_Page extends AppCompatActivity {

    EditText EditTextUserName, EditTextTel, EditTextPassword, EditTextConfirmPassword;

    private DBHelper dbHelper;
    Button ButtonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        dbHelper = new DBHelper(this);
        dbHelper.OpenDB();

        EditTextUserName = findViewById(R.id.appCompatEditText);
        EditTextTel = findViewById(R.id.appCompatEditText1);
        EditTextPassword = findViewById(R.id.appCompatEditText3);
        EditTextConfirmPassword = findViewById(R.id.appCompatEditText4);
        ButtonRegister = findViewById(R.id.appCompatButton);

        ButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTextUserName.getText().toString().isEmpty() ||
                        EditTextTel.getText().toString().isEmpty() ||
                        EditTextPassword.getText().toString().isEmpty() ||
                        EditTextConfirmPassword.getText().toString().isEmpty()) {

                    Toast.makeText(Register_Page.this, "Fields can't be blank", Toast.LENGTH_SHORT).show();
                }
                else if (!EditTextPassword.getText().toString().equals(EditTextConfirmPassword.getText().toString())) {
                    Toast.makeText(Register_Page.this, "Password and Confirm Password should match", Toast.LENGTH_SHORT).show();
                }
                else {
                    User user = new User(EditTextUserName.getText().toString(),
                            EditTextTel.getText().toString(),
                            EditTextPassword.getText().toString());

                    if (dbHelper.RegisterUser(user)) {
                        Toast.makeText(Register_Page.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Register_Page.this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Register_Page.this, "User Registration Failed!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void Login(View view){
        Intent intent = new Intent(Register_Page.this, MainActivity.class);
        startActivity(intent);
    }
}
