package org.example.Crud;


import org.example.Dao.StudentDao;
import org.example.model.Students;

import java.util.Scanner;

public class DeleteStudent {
public static void main(String[] args){
    Students student = new Students();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter ID to delete from table: ");
    int id = scanner.nextInt();

    new StudentDao().deleteStudentById(id);
    System.out.println("Successfully deleted");
}
}
