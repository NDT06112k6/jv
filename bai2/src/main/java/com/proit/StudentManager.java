package com.proit;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StudentManager {
    ArrayList<Student> students ;

    public StudentManager(ArrayList<Student> students)
    {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudents(Student s)
    {
        if(students.equals(null))
        {
            System.out.println("Danh sach rong!");
        }
        String ma = students.stream().findFirst().get().getId();
        if(s.getId().equals(ma))
        {
            System.out.println("Id nay da ton tai!");
        }else
        {
            students.add(s);
            System.out.println("da them");
        }
    }

    public void removeStudents(String id)
    {
        if(students.equals(null))
        {
            System.out.println("Danh sach rong!");
        }
        String ma = students.stream().findFirst().get().getId();
        if (ma.equals(id))
        {
            students.remove(students.indexOf(id));
        }else
        {
            System.out.println("Khong tim thay id");
        }
    }

    public void findStudentByName(String name)
    {
        if(students.equals(null))
        {
            System.out.println("Danh sach rong!");
        }

        String ten = students.stream().findFirst().get().getName();

        for(Student s: students)
        {
            if(s.getName().equals(ten))
            {
                System.out.println(name);
            }
        }
    }
}
