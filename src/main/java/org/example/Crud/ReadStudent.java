package org.example.Crud;

import org.example.Dao.StudentDao;
import org.example.model.Students;

import java.util.List;

public class ReadStudent {
    public static void main(String[] args) {
        List<Students> students = new StudentDao().getAllStudents();
        for (Students student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Email: " + student.getEmail());

            System.out.println("--------------");
        }
    }
}
