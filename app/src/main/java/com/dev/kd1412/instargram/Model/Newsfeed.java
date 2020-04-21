package com.dev.kd1412.instargram.Model;

import java.util.List;

public class Newsfeed {
    private int imgAvt;
    private int imgContent;
    private String Username;
    private String Status;
    private String Location;

    public Newsfeed(int imgAvt, int imgContent, String username, String status, String location) {
        this.imgAvt = imgAvt;
        this.imgContent = imgContent;
        Username = username;
        Status = status;
        Location = location;
    }

    public int getImgAvt() {
        return imgAvt;
    }

    public void setImgAvt(int imgAvt) {
        this.imgAvt = imgAvt;
    }

    public int getImgContent() {
        return imgContent;
    }

    public void setImgContent(int imgContent) {
        this.imgContent = imgContent;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
