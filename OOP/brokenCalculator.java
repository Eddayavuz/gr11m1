// Practice Question 1: Find and fix the errors in the code below.

public class brokenCalculator {
    public static void main(String[] args) {

        System.out.println("Starting at 5");
        Calculator myTi = new Calculator(5);

        System.out.println("Adding 10 ...");
        System.out.print("Should print 15: ");
        System.out.println(myTi.add(10));

        System.out.println("Multiplying by 2 ...");
        System.out.print("Should print 30: ");
        System.out.println(myTi.multiple(2));

        System.out.println("Changing value to 20 ...");
        myTi.setValue(20);
        System.out.print("Adding. Should print 50: ");
        System.out.println(myTi.add());

    }
}
class Calculator {

    private int total;
    private int value; // Value is the number stored in memory

    public Calculator(int startingValue){
        int total = startingValue;
        value = 0;
    }

    public int add(int value){
        int total = total + value;
        return total;
    }

    /**
     * Adds the instance variable value to the total
     */
    public int add(){
        int total += value;
        return total;
    }
    public int multiple(int value){
        int total *= value;
        return total;
    }
    public void setValue(int value){
        value = value;
    }
    public int getValue(){
        return value;
    }

}