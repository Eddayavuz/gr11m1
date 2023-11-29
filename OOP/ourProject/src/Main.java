public class Main {
    public static void main(String[] args) {
// An object is an instance of a class.
// You create objects based on the blueprint provided by the class.
// Here's how you can create objects of the Student class:
        Student stu1 = new Student("Ada", "Lovelace", 11);
        Student stu2 = new Student("Alan", "Turing", 12);
        // Access the methods of the objects
        stu1.displayInfo();
        System.out.println("--------------");
        stu2.displayInfo();
    }
}