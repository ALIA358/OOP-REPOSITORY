/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aggregation;

/*Task 1:
Consider a scenario of Aggregation where a College has multiple Students, but
each Student can exist independently of the College.
• Create a College class that contains a list of Student objects.
• Create a Student class with attributes like studentId and name.
• Establish an aggregation relationship, ensuring that deleting a College does
not delete the associated Student objects.
• In the main method, create multiple Student objects, associate them with a
College, and display the details.

 */
import java.util.ArrayList;
import java.util.List;


class Student {
    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}


class College {
    private String collegeName;
    private List<Student> students; 

    public College(String collegeName) {
        this.collegeName = collegeName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayCollege() {
        System.out.println("College: " + collegeName);
        System.out.println("Students:");
        for (Student s : students) {
            s.displayStudent();
        }
    }
}

// Main class
public class AggregationExample {
    public static void main(String[] args) {
        // Creating Student objects
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");
        Student s3 = new Student(103, "Charlie");

        
        College college = new College("Tech University");

        
        college.addStudent(s1);
        college.addStudent(s2);
        college.addStudent(s3);

        
        college.displayCollege();

        
        college = null;
        System.out.println("\nCollege object deleted, but students still exist:");
        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();
    }
}
