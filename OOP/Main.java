
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(50, "green");
        Circle circle2 = new Circle(100);
        Circle circle3 = new Circle("orange");
        Circle circle4 = new Circle();

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println(circle4);
    }
}

class Circle
{
    private int radius = 10;
    private String color = "blue";

    // Constructor that takes both parameters
    public Circle(int radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    // Constructor that only takes a radius
    public Circle(int radius)
    {
        this.radius = radius;
    }

    // Constructor that only takes a color
    public Circle(String color)
    {
        this.color = color;
    }

    // Constructor that takes no parameters
    public Circle()
    {
    }

    // a special method to override another method in the object class.
    public String toString()
    {
        return color + " circle with radius " + radius;
    }
}