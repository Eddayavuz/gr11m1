// Employee class with the required attributes and methods
class Employee {
    private String firstName;
    private String lastName;
    private String employeeID;
    private double salary;
    private double performanceRating;

    // Parameterized constructor to initialize the attributes
    public Employee(String firstName, String lastName, String employeeID, double salary, double performanceRating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.salary = salary;
        this.performanceRating = performanceRating;
    }

    // Method to check if the employee is a high performer
    public boolean isHighPerformer() {
        return this.performanceRating > 4.5;
    }

    // Method to calculate the bonus based on the performance rating
    public double calculateBonus() {
        if (isHighPerformer()) {
            return 0.20 * salary; // 20% bonus for high performers
        } else {
            return 0.05 * salary; // 5% bonus for others
        }
    }

    // Method to send a performance review email
    public void sendPerformanceEmail() {
        double bonus = calculateBonus();
        System.out.println("Dear " + this.firstName + " " + this.lastName + ",");
        System.out.println("Based on your performance rating of " + this.performanceRating + ", you are a valued member of our team.");
        System.out.println("Your bonus for this period is " + bonus + ". Keep up the great work!");
        System.out.println();
    }
}

public class employeeBonus {
    public static void main(String[] args) {
        // Create two Employee objects: one with a high performance rating, one with a lower rating
        Employee highPerformer = new Employee("Eda", "Yavuz", "E001", 50000, 4.8);  // High performer
        Employee lowPerformer = new Employee("Steven", "Gochkov", "E002", 45000, 3.9);  // Low performer

        // Call the methods for both employees
        highPerformer.sendPerformanceEmail();
        lowPerformer.sendPerformanceEmail();
    }
}
