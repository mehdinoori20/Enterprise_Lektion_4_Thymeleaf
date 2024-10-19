package com.mehdi.Enterprise_Lektion_4_Thymeleaf;

public class User {

    private String Username;
    private String password;

    public User(String username, String password) {
        this.Username= username;
        this.password= password;

    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
