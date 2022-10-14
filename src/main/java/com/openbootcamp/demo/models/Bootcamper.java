package com.openbootcamp.demo.models;

public class Bootcamper {
    private String name;
    private int age;

    public Bootcamper() {
    }

    public Bootcamper(String name, int age) {
        this.name = name;
    }

    /* getters */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /* setters */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
