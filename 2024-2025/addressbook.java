public class addressbook {
    public static void main(String[] args) {
        // create objects for testing.

        // call the constructor to create a new person
        Person p1 = new Person("Eda", "eda@gmail.com", "123-456-7890");
        // call p1's print method
        p1.print();
        Person p2 = new Person("Hannah", "hannah@gmail.com", "404 899-9955");
        p2.print();
    }
}

// THERE ARE 2 WAYS OF WRITING CLASSES
// 1: IN THE MAIN.JAVA
// 2: AS A SEPARATE FILE
// FOR SIMPLICITY LET'S WRITE OUR PERSON CLASS HERE IN THE MAIN.JAVA

// ONE FILE CAN ONLY HAVE ONE MAIN CLASS AND THIS IS REPRESENTED BY THE KEYWORD 'public'.

class Person // SINCE WE ALREADY HAVE A MAIN CLASS, WE DO NOT PUT THE KEYWORD 'public' HERE, INSTEAD WE START WITH 'class'
{
    // instance variables
    private String name;
    private String email;
    private String phoneNumber;

    // constructor: construct a Person copying in the data into the instance variables
    public Person(String initName, String initEmail, String initPhone) // or you can use the same name with the instance variables and put 'this.' in front of the variable
    {
        name = initName;
        email = initEmail;
        phoneNumber = initPhone;
    }

    // Print all the data for a person
    public void print() // void method bc it doesn't have to return anything.
    {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

}

