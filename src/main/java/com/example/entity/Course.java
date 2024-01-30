package com.example.entity;

//Spring Data JPAとの差分として、アノテーションで定義していたテーブルのカラムとEntityのフィールドの紐づけがない

public class Course {
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}