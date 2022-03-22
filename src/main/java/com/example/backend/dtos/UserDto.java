package com.example.backend.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class UserDto implements Serializable {

    private int id_user;

    private String name_user;

    private int age_user;

    private String profile_user;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public int getAge_user() {
        return age_user;
    }

    public void setAge_user(int age_user) {
        this.age_user = age_user;
    }

    public String getProfile_user() {
        return profile_user;
    }

    public void setProfile_user(String profile_user) {
        this.profile_user = profile_user;
    }
}
