package com.tca.sprinjdbc1.Model;

public class Student {

    private String name;
    private  Double per;
    private String city;
    private int rno ;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public Double getPer() {
        return per;
    }

    public void setPer(Double per) {
        this.per = per;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", per=" + per +
                ", city='" + city + '\'' +
                ", rno=" + rno +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Student(String name, Double per, String city,int rno) {
        this.name = name;
        this.per=per;
        this.city=city;
        this.rno=rno;
    }


}
