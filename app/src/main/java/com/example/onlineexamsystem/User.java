package com.example.onlineexamsystem;

public class User {
    private String UserName;
    private String Email;
    private String Password;

    public User(String userName, String email, String password) {
        UserName = userName;
        Email = email;
        Password = password;
    }

    public User(){

    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
