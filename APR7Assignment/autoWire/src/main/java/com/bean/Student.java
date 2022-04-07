package com.bean;

public class Student {
    private  int id;
    private  String name;
    private  Address add1;


    public Student(int id, String name, Address add) {
        this.id = id;
        this.name = name;
        this.add1 = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", add1=" + add1 +
                '}';
    }
}
