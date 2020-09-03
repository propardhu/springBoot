package com.pardhu.api.resources;

public class RoughData {
    private String name;
    private int age;
    private String Comment;

    public RoughData(String name, int age, String Comment) {
        this.name = name;
        this.age = age;
        this.Comment = Comment;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getComment() {
        return this.Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }
    
}
