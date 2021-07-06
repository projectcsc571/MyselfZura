package com.example.myself;

import java.io.Serializable;

public class Myself implements Serializable {

    String fullName,gender,maritalStatus,home,studentid,diploma;
    String[] hobby;
    int age,height;
    DOB me;


    public Myself()
    {}

    public Myself(String n,int age, String gender,String maritalStatus, int height,int d,String month,String year, String home, String id, String diploma, String[] hobby)
    {

        this.fullName = n;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.height = height;
        this.me = new DOB(d,month,year);
        this.home = home;
        this.studentid = id;
        this.diploma = diploma;
        this.hobby = hobby;
        for(int i=0; i< 3; i++)
        {
            this.hobby[i] = hobby[i];
        }

    }
}
