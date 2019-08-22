package com.noname.questionnaire.entity;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.lastname);
        hash = 47 * hash + this.age;
        hash = 47 * hash + Objects.hashCode(this.color);
        hash = 47 * hash + (this.happy ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.happy != other.happy) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", lastname=" + lastname + ", age=" + age + ", color=" + color + ", happy=" + happy + '}';
    }
    
    
    

}
