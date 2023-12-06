/*
1.Static Variables (Class Variables):
    A static variable is a class-level variable that is shared among all instances of the class.
    It is declared using the static keyword.

    Example:
*/

class Students {
    private String studentName;
    private int rollNo;
    private static String school = "ACS";
 public Students(String studentName, int rollNo){
     this.studentName = studentName;
     this.rollNo = rollNo;
 }

 void displayInfo(){
     System.out.println("name: " + studentName);
     System.out.println("roll number: " + rollNo);
     System.out.println("school name: " + school);
     System.out.println("************************");
 }

}

public class Main {
    public static void main(String[] args) {
        Students stu1 = new Students("Gergena", 124);
        Students stu2 = new Students("Aleksander", 234);
        Students stu3 = new Students("Svetoslav", 345);

        stu1.displayInfo();
        stu2.displayInfo();
        stu3.displayInfo();

        add(2,3);

    /*
2. Static Methods:
    A static method belongs to the class rather than an instance of the class.
    It can be called using the class name without creating an instance of the class.

    Example:
    */
    }
    public static void add(int n1, int n2){
        System.out.println(n1 + n2);
    }
}

