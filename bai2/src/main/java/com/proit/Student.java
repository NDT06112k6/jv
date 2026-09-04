package com.proit;

public class Student{

    private String id;
    private String name;
    private double gpa;
    public Student(String id, String name, double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id)
    {
        this.id = id;
    }

    public String getName(){ return this.name; }
    public void setName(String name){this.name = name;}
    public double getGpa(){ return this.gpa; }
    public void setGpa(double gpa){this.gpa = gpa;}
}
