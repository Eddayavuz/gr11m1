import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        int number = 0;
        Scanner myReader = new Scanner(System.in);
        System.out.print("enter the file name to be created on your desktop: ");
        String fileName = "/Users/eda/Desktop/" + myReader.nextLine();
        while (true){
            System.out.print("enter the number. if you wish to quit, type done: ");
            String input = myReader.nextLine();
            if(input.equals("done")){
                break;
            }else {
                writeToFile(fileName, input);
            }
            }
        }

        public static void writeToFile(String fileName, String input){
            // 1. Create an object with the class of your choice (FileWriter or PrintWriter)
	    // 2. using the object, call the method that will print the input into the file. 
        }

}