package org.example.Crud;

import org.example.Dao.StudentDao;
import org.example.model.Students;

import javax.sound.midi.SysexMessage;
import java.util.List;
import java.util.Scanner;

public class UpdateStudent {
public static void main (String[] args){
    Students student = new Students();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your ID to Update: ");
    student.setId(scanner.nextInt());
    scanner.nextLine();

    System.out.println("Enter new Name: ");
    student.setName(scanner.nextLine());

    System.out.println("Enter new Age: ");
    student.setAge(scanner.nextInt());
    scanner.nextLine();

    System.out.println("Enter new email: ");
    student.setEmail(scanner.nextLine());

    new StudentDao().updateStudents(student);
    System.out.println("✅ Student updated.");
}
}
