import java.util.Scanner;
public class MovieRental
{
   public static void main (String[] args){
       Scanner read = new Scanner (System.in);
       String name = read.nextLine();
       int id = read.nextInt();
       double salary = read.nextDouble();
   }
}

class Movies{

   String title;
   String genre;
   int stock;

   //Constructor
   public Movies(String title, String genre, int stock){
      this.title = title;
      this.genre = genre;
      this.stock = stock;
   }
   //Methods
void rentMovie(){
      Scanner reader = new Scanner(System.in);
      System.out.println("how many you want to rent?");
      int num = reader.nextInt();
      stock = stock - num;
}
void returnMovie(){
      Scanner reader = new Scanner(System.in);
      System.out.println("how many you want to return?");
      int num = reader.nextInt();
      stock = stock + num;
   }
void checkStatus(){
   System.out.println("the movie called:" + title + "\nStock Status: " + stock);
}

}


