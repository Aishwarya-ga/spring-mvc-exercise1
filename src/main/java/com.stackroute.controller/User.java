package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

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
