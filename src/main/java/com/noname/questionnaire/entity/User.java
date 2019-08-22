package com.noname.questionnaire.entity;


/**
 *
 * @author YBolshakova
 */
public class User {
    
    private String name;
    private String lastname;
    private int age;
    private String color;
    private boolean happy;

    public User() {
    }

    public User(String name, String lastname, int age, String color, boolean happy) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;      
        this.happy = happy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

}
