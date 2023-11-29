/*
A class is a template or blueprint that defines the data members and methods.
It serves as a blueprint for creating objects. Here's a simple example of a class:
*/

public class Student {
    String firstName;
    String lastName;
    int gradeLevel;

    // Constructor - a special method for initializing objects
    public Student(String nameFirst, String nameLast, int levelGrade){
        this.firstName = nameFirst;
        this.lastName = nameLast;
        this.gradeLevel = levelGrade;
    }

    // Method to display information about the student
    public void displayInfo() {
        System.out.println("Student Name: " + firstName);
        System.out.println("Student Lastname: " + lastName);
        System.out.println("Student Grade Level: " + gradeLevel);
    }

}
