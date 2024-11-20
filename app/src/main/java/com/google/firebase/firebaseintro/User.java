package com.google.firebase.firebaseintro;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {

    public String name;
    public String email;

    public User(){
        //default constructor
    }

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }


}
