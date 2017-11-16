package com.geeconsystems.globalhr.model;


public class login {
    String user,pass,view;

    public login(String user, String pass, String view) {
        this.user = user;
        this.pass = pass;
        this.view = view;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }



}
