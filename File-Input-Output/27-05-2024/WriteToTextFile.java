import java.io.*;

public class Main {

   public static void main(String[] args) {
      bufferedWriterTest("ms. Yavuz is the best teacher!\uD83E\uDD20","/Users/edayavuz/Desktop/BufferedWriter.txt");
      printWriterTest("/Users/edayavuz/Desktop/PrintWriter.txt");

   }

   // since so many things can go wrong working with files, we'll have to handle exceptions.

   private static void bufferedWriterTest(String message, String fileName){
      try(BufferedWriter outStream = new BufferedWriter(new FileWriter(fileName))){ // Create stream & open file
         outStream.write(message); // pass the message into the write method.
         System.out.println("fileWriterTest method is successful!");
      }
      catch (IOException e){
         System.out.println("oppa: " + e.getMessage());
      }
   }

   private static void printWriterTest(String fileName){
      try(PrintWriter outStream = new PrintWriter(new FileOutputStream(fileName))) {
         for(int i = 0; i<10; i++){
            outStream.print(i + " ");
            outStream.println(Math.pow(i,2));
         }

         System.out.println("printWriterTest method is successful!");
      }
      catch (IOException e){
         System.out.println("oppa: " + e);
      }
   }
}
