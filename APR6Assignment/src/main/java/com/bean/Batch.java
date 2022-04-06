package com.bean;
import java.util.List;

public class Batch {
    private String courseName;
    private String batchCode;
    private List<Student> students;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void display(){
        System.out.println("***************************** Course Details *********************************");
        System.out.println("Course Name::"+getCourseName());
        System.out.println("Batch Code::"+getBatchCode());
        List<Student> l= getStudents();
        for(Student s:l){
            System.out.println(s);
        }

    }

    public Batch(String courseName, String batchCode, List<Student> students) {
        this.courseName = courseName;
        this.batchCode = batchCode;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "courseName='" + courseName + '\'' +
                ", batchCode='" + batchCode + '\'' +
                ", students=" + students +
                '}';
    }
}
