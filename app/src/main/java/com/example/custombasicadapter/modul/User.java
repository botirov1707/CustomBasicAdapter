package com.example.custombasicadapter.modul;

import java.io.Serializable;

public class User implements Serializable {

    int profile;
    String fullName;
    String job;

    public int getProfile() {
        return profile;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJob() {
        return job;
    }

    public User(int profile, String fullName, String job) {
        this.profile = profile;
        this.fullName = fullName;
        this.job = job;
    }
}
