package com.stackroute.services;

import org.springframework.stereotype.Component;


@Component
public class User {
    private String user;
    public User() {
        this.user="Aishwarya";
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
}
