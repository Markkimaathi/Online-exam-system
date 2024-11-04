package com.example.onlineexamsystem;

public class Teacher {
    private String UserName;
    private String Email;
    private String StaffNo;
    private String Password;

    public Teacher(String userName, String email, String password, String staffno) {
        UserName = userName;
        Email = email;
        Password = password;
        StaffNo = staffno;
    }

    public Teacher(){

    }

    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }

    public void setStaffNo(String staffNo) {
        StaffNo = staffNo;
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
