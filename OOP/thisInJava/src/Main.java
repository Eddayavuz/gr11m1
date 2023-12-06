class Calculator{
    private int num1;
    private int num2;
    Calculator(int num1, int num2){
        num1 = num1;
        num2 = num2;
    }
    int sum(){
        return num1 + num2;
    }
    int mult(){
        return num1 * num2;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calculate = new Calculator(10,3);
        System.out.print("sum = " + calculate.sum());
        }
    }