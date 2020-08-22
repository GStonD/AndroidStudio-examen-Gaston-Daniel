package com.example.myapplication;

import android.widget.ImageView;

import java.io.Serializable;

public class Post implements Serializable {
    private int userId;
    private int id;
    private String name;
    private String body;
    private int image;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public int getfoto(){return image;}
    public void setfoto(int foto ){ this.image = foto; }

}
