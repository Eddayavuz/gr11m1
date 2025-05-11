import javax.swing.*;
import java.io.*;
import java.util.Random;

public class binaryIO {
    public static void main(String[] args) throws IOException {

        writeRecords("/Users/eda/Desktop/employee.txt");
        readRecords("/Users/eda/Desktop/employee.txt");
    }

    public static void writeRecords( String fileName )  {
        Random rand = new Random();
        try {
            DataOutputStream outStream = new DataOutputStream(new FileOutputStream(fileName));
            for (int k = 0; k < 5; k++) { // Output 5 data records
                String name = "Name" + k;
                outStream.writeUTF("Name" + k);
                outStream.writeInt(20 + rand.nextInt(40));
                outStream.writeDouble(1.50 + rand.nextDouble(0.50));
            }

        } catch (IOException e) {
            System.out.println("IOERROR: " + e.getMessage() + "\n");
        }
    }
    public static void readRecords( String fileName )  {
       try(DataInputStream inStream = new DataInputStream(new FileInputStream(fileName))){
           try{
           while (true){
               System.out.print(inStream.readUTF() + " ");
               System.out.print(inStream.readInt() + " ");
               System.out.println(inStream.readDouble() + " ");
           }
           }catch (EOFException e){}
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
    }

    }
