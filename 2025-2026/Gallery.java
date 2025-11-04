import java.util.Scanner;

public class Gallery{
    public static void main(String[] args){

        Car myCar = new Car("Honda", "Jazz", 98, 200);
        myCar.showTax();
    }

}

class Car{

    private String make;
    private String model;
    private double COlevel;
    private double tax;

    public Car(String make, String model, double COlevel, double tax){
        this.make = make;
        this.model = model;
        this.COlevel = COlevel;
        this.tax = tax;
    }

    public void showTax(){
        if(COlevel>95)
            tax = tax + (COlevel-95) * 2;
        System.out.println("the tax of your " + make + " " + model + " is " + tax);
    }

}
