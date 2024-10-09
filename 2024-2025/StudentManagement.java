import java.util.Scanner;

public class StudentManagement
{
    public static void main(String[] args)
    {
    Student stu1 = new Student(1, "Eda");
    stu1.display();
    stu1.calculateGPA();
    stu1.display();
    }
}

class Student {
    //ATTRIBUTES
    double gpa;
    String name;
    int id;
    //CONSTRUCTOR
    public Student (int id, String name){
        this.id = id;
        this.name = name;
    }
    void calculateGPA(){
        Scanner reader = new Scanner(System.in);

        System.out.println("enter grades (3): ");
        double exam1 = reader.nextDouble();
        double exam2 = reader.nextDouble();
        double exam3 = reader.nextDouble();

        gpa = (exam1+exam2+exam3)/3;
        System.out.println("your gpa is calculated");
    }
    void display(){
        System.out.println("name: " + name + " with id: " + id + "\nGPA: " + gpa);
    }
}
