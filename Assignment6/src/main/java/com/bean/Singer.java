package com.bean;

import java.util.List;

public class Singer {
private String singerName;
private String singer_date_of_birth;
private int age;
private List<String> songList;

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSinger_date_of_birth() {
        return singer_date_of_birth;
    }

    public void setSinger_date_of_birth(String singer_date_of_birth) {
        this.singer_date_of_birth = singer_date_of_birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSongList() {
        return songList;
    }

    public void setSongList(List<String> songList) {
        this.songList = songList;
    }
    public void display(){
        System.out.println("***************************** Details *********************************");
        System.out.println("Name::"+getSingerName());
        System.out.println("Age::"+getAge());
        System.out.println("DOB::"+getSinger_date_of_birth());
        List<String> l=getSongList();
        for(String v:l){
            System.out.println(v);
        }
    }
}
