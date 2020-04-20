package com.dev.kd1412.instargram.Model;

import java.util.List;

public class Newsfeed {
    private String imgAvt;
    private String imgContent;
    private String Username;
    private String Status;

    public Newsfeed(String imgAvt, String imgContent, String username, String status) {
        this.imgAvt = imgAvt;
        this.imgContent = imgContent;
        this.Username = username;
        this.Status = status;
    }

    public String getImgAvt() {
        return imgAvt;
    }

    public void setImgAvt(String imgAvt) {
        this.imgAvt = imgAvt;
    }

    public String getImgContent() {
        return imgContent;
    }

    public void setImgContent(String imgContent) {
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
}
