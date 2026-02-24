JavaJDBCStudentApp

Description:
JavaJDBCStudentApp is a console-based Student Management System built in Java using JDBC for MySQL database connectivity.
It allows users to perform CRUD operations (Create, Read, Update, Delete) on student records, including name, age, and course details.

Features:
Add new student records
View all students
Update student details (name, age, or course)
Delete student records
Uses MySQL database to store student information
Console-based menu for easy navigation

Technologies Used:
Java (JDK 8 or above)
JDBC
MySQL
Console-based user interface

Set up MySQL database:
Create a database, e.g., student_db
Create a student table:
CREATE TABLE student (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50),
age INT,
course VARCHAR(50)
);
