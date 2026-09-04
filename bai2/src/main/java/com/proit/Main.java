package com.proit;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("1. add");
        System.out.println("2. remove");
        System.out.println("3. find by name");
        System.out.println("Moi chon");
        int chocie = input.nextInt();
        switch(chocie)
        {
            case 1 -> add();
            case 2 -> remove();
            case 3 -> find();
            case default -> System.out.println("Chuc nang nay hien chua kha dung");;
        }
    }

    public static void add()
    {
        System.out.println("id: ");
        String id = input.next();
        System.out.println("name: ");
        String name = input.next();
        System.out.println("gpa: ");
        double gpa = input.nextDouble();

    }

    public static void remove()
    {
        System.out.println("Nhap id can xoa");
        String id = input.next();
        for (Student s: students)
        {

        }
    }
    public static void find()
    {

    }
}
