# JDBC CRUD App 🛠️

A **Java Console-based CRUD application** using **JDBC + MySQL**, built to demonstrate foundational backend development skills. This app performs Create, Read, Update, and Delete operations on a `students` table in a MySQL database.

---

## 📌 Tech Stack

- **Java 17+**
- **JDBC (Java Database Connectivity)**
- **MySQL**
- **IntelliJ IDEA**
- **Maven** (or manual `.jar` JDBC driver setup)
- **Git & GitHub**

---

## 📁 Project Structure

MiniCrudApp/
│
├── src/
│ └── main/
│ └── java/
│ └── org/
│ └── example/
│ ├── model/ # Student model class
│ ├── Connection/ # Database connection utility
│ ├── Dao/ # DAO (Data Access Object) class
│ ├── Crud/ # CRUD operation classes (Create, Read, Update, Delete)
│ └── Main.java # Entry point (optional)
│
├── .gitignore
├── pom.xml (if using Maven)
└── README.md

yaml
Copy
Edit

---

## 🎯 Features

- ✅ Add a new student
- ✅ View all students
- ✅ Update student details by ID
- ✅ Delete student by ID
- ✅ Menu-driven & modular structure
- ✅ Uses **PreparedStatement** to prevent **SQL Injection**
- ✅ Database connection is abstracted for cleaner code

---

## 🧠 How It Works

1. Database connection is handled by `DbConnection.java`.
2. `StudentDao.java` handles all database queries.
3. Each CRUD operation has a separate class under `Crud/`.
4. Run each class from the console using `main()`.

---

## 🛠️ Database Setup

Before running the project, make sure to:

1. Create the MySQL database:
```sql
CREATE DATABASE jdbc;
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    email VARCHAR(100)
);
 Update your database credentials in:
java
Copy
Edit
// DbConnection.java
private static final String URL = "jdbc:mysql://localhost:3306/jdbc";
private static final String USER = "root";
private static final String PASSWORD = "your_password";
🚀 Getting Started
bash
Copy
Edit
# Clone the repository
git clone https://github.com/Arpan-das-dev/Jdbc-crud-app.git

# Open in IntelliJ IDEA
# Update DB credentials in DbConnection.java
# Run any class from the Crud/ folder (e.g., CreateStudent.java)

📃 License
This project is licensed under the MIT License.

)

