package BMICalculate;
import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        String bmiCategory = determineBMICategory(bmi);

        System.out.println("Your BMI is: " + bmi);
        System.out.println("BMI Category: " + bmiCategory);

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        // BMI formula: BMI = weight (kg) / (height * height) (m^2)
        return weight / (height * height);
    }

    public static String determineBMICategory(double bmi) {
    	 if (bmi < 18.5) {
             return "Underweight";
         } else if (bmi >= 18.5 && bmi < 25) {
             return "Normal Weight";
         } else if (bmi >= 25 && bmi < 30) {
             return "Overweight";
         } else {
             return "Obese";
         }
    }

}
