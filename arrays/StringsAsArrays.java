import java.util.Scanner;

public class StringsAsArrays {

    public static void main(String[] args) {
        // Create a StringBuilder object
        // using StringBuilder() constructor
        StringBuilder str = new StringBuilder();
 
        str.append("GFG");
 
        // print string
        System.out.println("String = " + str.toString());
 
        // create a StringBuilder object
        // using StringBuilder(CharSequence) constructor
        StringBuilder str1 = new StringBuilder("AAAABBBCCCC");
 
        // print string
        System.out.println("String1 = " + str1.toString());
 
        // create a StringBuilder object
        // using StringBuilder(capacity) constructor
        StringBuilder str2 = new StringBuilder(10);
 
        // print string
        System.out.println("String2 capacity = " + str2.capacity());
 
        // create a StringBuilder object
        // using StringBuilder(String) constructor
        StringBuilder str3  = new StringBuilder(str1.toString());
 
        // print string
        System.out.println("String3 = " + str3.toString());
       
        
        Scanner read = new Scanner(System.in);
        System.out.println("enter size");
        int size = read.nextInt();
        StringBuilder str4 = new StringBuilder();
        for (int i = 0; i< size; i++)
        {
            System.out.println("enter letter");
            char letter = read.next().charAt(0);
            str4.append(letter);
        }
        System.out.println("String4 = " + str4.toString());
    }
}
