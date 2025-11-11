/*
Practical Task – Association Example
------------------------------------
Concept: Association (A Student is ASSOCIATED with a Course)

In this example:
- A Student and a Course are two independent classes.
- The Student "has a reference to" a Course object.
- The Course is created outside the Student class and passed in as a parameter.

👉 Key idea:
If the Student object is deleted, the Course object can still exist.
*/

public class Association {
    public static void main(String[] args) {

        // 🟢 Step 1: Create a Course object.
        // Think: is this Course connected to any Student yet?
        Course math = new Course("math");

        // 🟢 Step 2: Create a Student object and "associate" it with the Course.
        // The Course object is passed into the Student constructor.
        Student student = new Student("Viktor", math);

        // 🟢 Step 3: Call the method to display the student's details.
        // What do you think will print on the screen?
        student.displayDetails();
    }
}

// 🎓 CLASS: Course
// Represents a university course or subject.
class Course {
    String courseName;

    // 🟢 Step 4: Constructor – every course must have a name.
    public Course(String courseName){
        this.courseName = courseName;
    }

    // 🧠 Try This:
    // Add a toString() method below to make printing more readable:
    // public String toString() { return courseName; }
}

// 🧍 CLASS: Student
// A Student is associated with a Course (HAS-A relationship).
class Student {
    String name;
    Course course;  // Association: notice the data type here (a reference to another class)

    // 🟢 Step 5: The constructor receives BOTH a name and a Course object.
    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    // 🟢 Step 6: Display details about the student and their associated course.
    void displayDetails(){
        System.out.println(name + " " + course);

        // 💭 Think:
        // What do you see in the console? Probably something like:
        // Viktor Course@1b6d3586
        //
        // Why? Because 'course' is an object reference.
        // To print the actual course name, we need to define a toString() method in the Course class.
    }
}
