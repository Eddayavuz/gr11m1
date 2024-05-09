public class Person
{
    private String name = null;

    public Person(String theName)
    {
        this.name = theName;
    }

    public String getFood()
    {
        return "Hamburger";
    }

    public static void main(String[] args)
    {
        Person p = new Vegan("Javier");
        System.out.println(p.getFood());
    }
}
class Student extends Person
{
    private int id;
    private static int nextId = 0;

    public Student(String theName)
    {
        super(theName);
        id = nextId;
        nextId++;
    }
    @Override
    public String getFood()
    {
        String output = super.getFood();
        return output + " and Taco";
    }
    public int getId() {return this.id;}
    public void setId (int theId)
    {
        this.id = theId;
    }
}
class Vegan extends Student{

    public Vegan(String name){
        super(name);
    }
    @Override
    public String getFood() {
        String output = super.getFood();
        return "No " + output + " and Vegan Burger";
    }
}

// Explanation: When the student getFood() method is executed it will start executing the getFood method in Student.
// When it gets to super.getFood() it will execute the getFood method in Person.
// This method will return the string "Hamburger".
// Then execution will continue in the getFood method of Student and return the string "Hamburger and Taco".
