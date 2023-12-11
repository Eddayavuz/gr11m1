class Rectangle {

    public double length; // mistake #1
    double width; // mistake #2

    public Rectangel(double l, double w) { // mistake #3
        this.length = l;
        width = w;
    }

    public int calculateArea() { // mistake #4
        return length * width;
    }

    public void printArea() {
        System.out.println("Area: " + calculateArea());
    }

    double getLength(){
        return this.length;
    }

}
public class brokenRectangle{
    public static void main(String[] args){

        Rectangle rec1 =  new Rectangle(10,20); // mistake #5
        System.out.println("Length: " + rec1.getLength(4)); // mistake #6
        printArea(); // mistake #7


    }
}