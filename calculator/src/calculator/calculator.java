package calculator;

public class calculator {
	
	int x;
	int y;
	
	
	public calculator(int num1, int num2) {
		x  = num1;
		y = num2;
	}
	
	public int getSum() {
		System.out.print(x + " + " + y + " = ");
		return x + y;
	}
	
	public double getDiv() {
		System.out.print(x + " / " + y + " = ");
		return (double)x / y;
	}
	
	public int getSubs() {
		System.out.print(x + " - " + y + " = ");
		return x - y;
	}
	
	public int getMul() {
		System.out.print(x + " x " + y + " = ");
		return x * y;
	}

}
