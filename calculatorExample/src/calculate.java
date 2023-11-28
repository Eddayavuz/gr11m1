public class calculate {
    private int x;
    private int y;

    public calculate(int num1, int num2){
        x = num1;
        y = num2;
    }
    public int getSum(){
        return x+y;
    }
    public int getMul(){
        return x*y;
    }
    public int getSub(){
        return x-y;
    }
    public double getDiv(){
        return (double)x / y;
    }
}
