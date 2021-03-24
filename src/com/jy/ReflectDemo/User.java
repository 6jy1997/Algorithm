package com.jy.ReflectDemo;

/**
 * @description:
 * @author: Andy
 * @time: 2021/3/22 18:56
 */
public class User {

    private String name;
    private int id;

    public User(){

    }

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void add(String name, int a){
        System.out.println("Add");
    }
}
