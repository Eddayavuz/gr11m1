public class honorStudent {
    public static void main(String[] args){
        // create an object
        Student stu1 = new Student("Bella", "Traykova", 11, 3.9);
        Student stu2 = new Student("Eliza", "Cholakova",11, 3.0);

        stu1.HonorStudentEmail();
        stu2.HonorStudentEmail();
    }

}

class Student{
    //instance variable
   private String name;
   private String lastName;
   private int gradeLevel;
   private double gpa;
   private final String school = "ACS";

   //constructor
    public Student(String name, String lastName, int gradeLevel, double gpa){
       this.name = name;
       this.lastName = lastName;
       this.gradeLevel = gradeLevel;
       this.gpa = gpa;
    }

    // methods
   private boolean isHonorStudent(){
        return gpa > 3.8;
   }

   public void HonorStudentEmail(){
        if(isHonorStudent()){
            System.out.println("Dear " + name + " you are selected as one of the honor students of " + school+  " in class 2023 with the GPA of " +gpa+".\nCongratulations and we look forward to celebrating your achievement in the graduation ceremony.\n");
        }
   }
}

