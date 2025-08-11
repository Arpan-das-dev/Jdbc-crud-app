package org.example.Dao;

import org.example.Connection.DbConnection;
import org.example.model.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
// create 
    public void addStudent(Students students) {
        try {
            Connection conn = DbConnection.getConnection();
            String sql = "INSERT INTO STUDENTS (name,age,email) values(?,?,?);";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, students.getName());
            preparedStatement.setInt(2, students.getAge());
            preparedStatement.setString(3, students.getEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //Read

    public List<Students> getAllStudents() {
        List<Students> studentsList = new ArrayList<>();
        try {
            Connection conn = DbConnection.getConnection();
            String sql = "SELECT * FROM students;";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Students student = new Students();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAge(resultSet.getInt("age"));
                student.setEmail(resultSet.getString("email"));
                studentsList.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentsList;
    }
    

    public int updateStudents(Students students) {
        String sql = "UPDATE students SET name = ?, age = ?, email = ? WHERE id = ?";
        try (Connection connection = DbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, students.getName());
            preparedStatement.setInt(2, students.getAge());
            preparedStatement.setString(3, students.getEmail());
            preparedStatement.setInt(4, students.getId());

            return preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0; // Return 0 if update fails
    }

    public void deleteStudentById(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection connection = DbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("✅ Student deleted successfully.");
            } else {
                System.out.println("⚠️ No student found with ID: " + id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
