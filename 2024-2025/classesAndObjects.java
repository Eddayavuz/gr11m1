//CLASS
class Car{
String color;
int doors;
String brand;

//Constructor
public Car (String color, int doors, String brand){
    this.color = color;
    this.brand = brand;
    this.doors = doors;
}

void displayBrand(){
    System.out.println("the brand of this car is : " + brand);
    }
}

class Student{
    String name;
    int age;
    String section;
    double GPA;

    // CONSTRUCTOR
    public Student(String name, int age, String section, double GPA){
        this.name = name;
        this.age = age;
        this.section = section;
        this.GPA = GPA;
    }

    void getGPA(){
        System.out.println("Student called " + name + " has " + GPA + " GPA ");
    }
}

class bank{
    String accountHolder;
    double balance;

    public bank (String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    double deposit(double money){
        return balance += money;
    }

    double withdraw(double money){
        return balance -= money;
    }

    void displayCurrentStatus(){
        System.out.println("Account with the name " + accountHolder + " has " + balance + ".");
    }

}

public class classesAndObjects
{
    public static void main(String[] args)
    {
        //OBJECT
        Car myCar = new Car("white", 5, "honda");
        myCar.displayBrand();

        //OBJECT
        Student stu1 = new Student("Bella", 17, "11/5", 4.0);
        stu1.getGPA();

        // OBJECT

        bank customer = new bank("Eda", 100.0);
        customer.displayCurrentStatus();
        customer.deposit(50);
        customer.displayCurrentStatus();


    }
}

