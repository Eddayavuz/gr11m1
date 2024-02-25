import java.util.Scanner;

public class arrayOfObjectsCW {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        // Create an array of Car objects
        Car[] carArray = {
                new Car("Toyota", "Camry", 2020, 25000, false),
                new Car("Honda", "Civic", 2016, 15000, true),
                new Car("Ford", "Fusion", 2019, 20000, false)
        };
        int choice = 0;
        do{
            System.out.println("1. Display the details of all cars in the gallery.");
            System.out.println("2. Display the details of the most expensive car in the gallery.");
            System.out.println("3. Display average price of all cars.");
            System.out.println("4. Lease a car");
            System.out.print("Enter the option: ");
            choice = read.nextInt();

            switch(choice){
                case 1:
                    System.out.println("make" + " | " + "model" + " | " + "year" + " | " + "price" + " | " + "isLeased");
                    displayAll(carArray);
                break;
                case 2:
                    System.out.println("make" + " | " + "model" + " | " + "year" + " | " + "price" + " | " + "isLeased");
                    mostExpensive(carArray).displayInfo();
                break;
                case 3: System.out.println("average price: " + averagePrice(carArray));
                break;
                case 4: System.out.println("Available cars");
                System.out.println("make" + " | " + "model" + " | " + "year" + " | " + "price" + " | " + "isLeased");
                displayAvailableCars(carArray);
                System.out.println("Enter the number of the car you want to lease.");
                int leaseChoice = read.nextInt();
                leaseCar(carArray, leaseChoice);
                break;
            }

        }while(choice != 0);
    }

    public static void displayAvailableCars (Car[] car){
        for (int i = 0; i< car.length; i++){
            if (!car[i].isLeased){
                System.out.print(i + ":");
                car[i].displayInfo();
            }
        }
    }
    public static void displayAll(Car[] car){
        for (Car cars : car) {
            System.out.print("Car: ");
            cars.displayInfo();
        }
    }
    // 2. Write a method to find and display the details of the most expensive car in the gallery.
    public static Car mostExpensive (Car[] car){
        int maxPrice = 0;
        int index = 0;
        for (int i = 0; i< car.length; i++){
            if (car[i].price > maxPrice){
                maxPrice = car[i].price;
                index = i;
            }

        }
        return car[index];
    }

    // 3. Write a method to calculate and return the average price of all cars.
    public static double averagePrice(Car[] car){
        int averagePrice = 0;

        for (Car cars: car){
            averagePrice += cars.price;
        }
        return averagePrice/ car.length;
    }

    // 4. Write a method to lease a car by setting the isLeased attribute to true for a specified car.
    public static void leaseCar (Car[] car, int leaseChoice){
       car[leaseChoice].isLeased = true;
       System.out.println("successful!");
    }

}
class Car {
    String make;
    String model;
    int year;
    int price;
    boolean isLeased;

    // Constructor
    public Car(String make, String model, int year, int price, boolean isLeased) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isLeased = isLeased;
    }

    // 1. Write a method to display the details of all cars in the gallery.
    public void displayInfo() {
        System.out.println(make + " | " + model + " | " + year + " | " + price + " | " + isLeased);
    }
}
