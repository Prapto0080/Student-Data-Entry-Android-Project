package com.example.lab_project;

public class FirebaseData {
    String name,id,gender,email,sec;

    public FirebaseData(String name, String id, String gender, String email, String sec) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.email = email;
        this.sec = sec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }
}
