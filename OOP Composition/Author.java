package com.company;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name,String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String toString(){
        return name + "("+ gender +") at" + email;
    }
}
