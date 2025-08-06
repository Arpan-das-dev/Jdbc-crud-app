package org.example.Crud;

import org.example.Dao.StudentDao;
import org.example.model.Students;

import java.util.Scanner;

public class CreateStudent {
    public static void main (String[] args){
        Students student = new Students();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students want to add? ");
        System.out.println("Enter Int value: ");
        int studentCount = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter name: ");
            student.setName(sc.nextLine());

            System.out.println("Enter age:");
            student.setAge(sc.nextInt());
            sc.nextLine();

            System.out.println("Enter your email: ");
            student.setEmail(sc.nextLine());

            new StudentDao().addStudent(student);
            System.out.println("✅ new student added ");

        }
    }
}
