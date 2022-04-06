package com.bean;

public class Student {
private String sName;
private String qualification;
private float aggregatePercent;

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public float getAggregatePercent() {
        return aggregatePercent;
    }

    public void setAggregatePercent(int aggregatePercent) {
        this.aggregatePercent = aggregatePercent;
    }
    public void display() {
        System.out.println("***************************** Student Details *********************************");
        System.out.println("Student Name::" + getsName());
        System.out.println("Qualification::" + getQualification());
        System.out.println("Aggregate Percentage::" + getAggregatePercent());
    }

    public Student(String sName, String qualification, float aggregatePercent) {
        this.sName = sName;
        this.qualification = qualification;
        this.aggregatePercent = aggregatePercent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", qualification='" + qualification + '\'' +
                ", aggregatePercent=" + aggregatePercent +
                '}';
    }
}
