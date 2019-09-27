package com.brk.mvp;

public class PeopleBean {

    private String name;
    private int num;


    public PeopleBean(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "PeopleBean{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
