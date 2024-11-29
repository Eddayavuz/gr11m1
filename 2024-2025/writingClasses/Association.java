public class Association {
    public static void main(String[] args) {
       Course math = new Course("math");
       Student student = new Student("Viktor", math);

       student.displayDetails();
    }
}
class Course {
    String courseName;

    public Course(String courseName){
        this.courseName = courseName;
    }
}

class Student {
    String name;
    Course course;  // Association: Notice the data type here.

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }
    void displayDetails(){
        System.out.println(name + " " + course); // when printed on the console, what should we expect?
    }
}

