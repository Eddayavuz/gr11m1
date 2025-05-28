import java.io.*;
import java.util.*;


// 1. read the TEXT file line by line
// 2. as I read them I will create and add objects them to my list
// 3. print out the linkedlist on the console

class Car implements Serializable{
    String brand;
    int year;
    
    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
}

public class CarRental {
    public static void main(String[] args) throws IOException {
       LinkedList<Car> mainCarList = readFromTextFile("objects.txt");
       
       for(Car c : mainCarList){
           System.out.println(c.brand + " " + c.year);
       }
    }

    public static LinkedList<Car> readFromTextFile(String path){
       LinkedList<Car> carList = new LinkedList<>();
       
       try(BufferedReader rd = new BufferedReader( new FileReader (path))){
           String line = rd.readLine(); // read the first line to be able to start the loop.
           while(line != null){
               String brand = line; // assign the first line to brand (as I know it's the brand information)
               int year = Integer.parseInt(rd.readLine()); // assign the second line to year by parsing it into int (as I know it's the year information in my file)
               carList.add(new Car(brand, year)); // create and add objects to carList
               line = rd.readLine(); // read the next line (which is again the brand name)
           }
       }catch(IOException e){
           System.out.println(e.getMessage());
       }
       return carList;
    }

}
