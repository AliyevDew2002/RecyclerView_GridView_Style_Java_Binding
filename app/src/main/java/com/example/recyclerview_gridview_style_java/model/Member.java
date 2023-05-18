package com.example.recyclerview_gridview_style_java.model;

public class Member {
    int profile;
    String FirstName, LestName;

    public Member(int profile, String firstName, String lestName){
        this.FirstName=firstName;
        this.LestName=lestName;
        this.profile=profile;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLestName() {
        return LestName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLestName(String lestName) {
        LestName = lestName;
    }
}
