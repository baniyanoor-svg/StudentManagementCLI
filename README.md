
# Student Management System (CLI Version)

## Project Overview
This is a Core Java CLI (Command Line Interface) based application developed to manage student records using CRUD operations.

The project demonstrates the implementation of Core Java concepts such as:
- Classes and Objects
- ArrayList
- Loops and Conditional Statements
- Methods
- File Handling
- BufferedReader
- Exception Handling
- Sorting and Searching
- User Input using Scanner

---

# Features

## CRUD Operations
1. Add Student
2. View Students
3. Update Student
4. Delete Student

## Additional Features
5. Search Student by ID
6. Sort Students by Name
7. File Handling using students.txt
8. Automatic Data Saving
9. Automatic Data Loading using BufferedReader

---

# Technologies Used

- Java
- VS Code
- Terminal
- File Handling
- BufferedReader
- Scanner Class

---

# Files Included

- Student.java
- StudentService.java
- StudentCLI.java
- students.txt
- StudentManagementCLI.jar

---

# Concepts Used

## Classes and Objects
Student class is used as a model class.

## ArrayList
Used to store multiple student records dynamically.

## Scanner
Used for taking user input.

## Methods
Different methods are used for CRUD operations.

## File Handling
FileWriter is used to save student data into a text file.

## BufferedReader
Used to load existing student records from file automatically.

## Sorting
Collections.sort() is used to sort students alphabetically.

## Searching
Linear search is used to find student by ID.

---

# How to Run

## Compile

```bash
javac *.java
jar cfe StudentManagementCLI.jar StudentCLI *.class
java -jar StudentManagementCLI.jar
