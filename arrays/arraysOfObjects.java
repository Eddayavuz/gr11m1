public class arraysOfObjects {
    public static void main(String[] args) {

        // Create an array of Car objects
        Car[] carArray = {
                new Car("Toyota", "Camry", 2020),
                new Car("Honda", "Civic", 2021),
                new Car("Ford", "Fusion", 2019)
        };

        // Access and manipulate the array elements
        System.out.println(carArray[0].make);  // Output: Toyota

        // Loop through the array
        for (Car cars : carArray) {
            System.out.print("Car: ");
            cars.displayInfo();
        }
    }

    private static double calculateAverageYear(Car[] cars) {
        if (cars.length == 0) {
            return 0; // handle the case when the array is empty to avoid division by zero
        }
        int sum = 0;
        for (Car car : cars) {
            sum += car.year;
        }
        return (double) sum / cars.length;
    }
}

class Car {
    String make;
    String model;
    int year;
    int averageYear;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayInfo() {
        System.out.println(make + " " + model + " (" + year + ")");
    }
}
