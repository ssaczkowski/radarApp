package com.ses.pc.radarapp;

/**
 * Created by pc on 02/01/2017.
 */
public class UserSimple {

    String name;
    String email;
    int age;
    boolean isDeveloper;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDeveloper(boolean developer) {
        isDeveloper = developer;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public boolean isDeveloper() {
        return isDeveloper;
    }
}
