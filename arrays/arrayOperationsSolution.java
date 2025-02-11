import java.util.Scanner;

public class arrayOperationsSolution {
    public static void main(String[] args) {
        String[] students = {"Nikoleta", "Vasil", "Martin","Svetoslav","Irina", "Aleksandar"};
        int[] grades = {99, 49, 89, 45, 35, 78 };

        System.out.println("enter option");
        Scanner read = new Scanner(System.in);
        int option = read.nextInt();

        switch(option){
            case 1:
                System.out.println(calculateAverage(grades));
                break;
            case 2:
                System.out.println(findHighestGradeStudent(students, grades));
                break;
            case 3:
                System.out.println(findLowestGradeStudent(students, grades));
                break;
            case 4:
                System.out.println(countFailedStudents(grades));
                break;
            case 5:
                System.out.println(lookupStudentGrade(students, grades, "Vasil"));
                break;


        }
    }

    private static double calculateAverage(int[] grades) {
        int sum = 0 ;
        for(int i = 0 ; i < grades.length ; i++){
            sum += grades[i];
        }
        return sum/grades.length;
    }

    private static String findHighestGradeStudent(String[] studentNames, int[] grades) {
        int max = grades[0];
        int index = 0;
        for (int i = 0; i < grades.length; i++){
            if(grades[i] > max){
                max = grades[i];
                index = i;
            }
        }
        return studentNames[index];
    }

    private static String findLowestGradeStudent(String[] studentNames, int[] grades) {
        int min = grades[0];
        int index = 0;
        for (int i = 0; i < grades.length; i++){
            if(grades[i] < min){
                min = grades[i];
                index = i;
            }
        }
        return studentNames[index];
    }
    private static int countFailedStudents(int[] grades) {
        int count = 0;
        for (int i = 0; i < grades.length; i++){
            if(grades[i] < 50)
                count++;
        }
        return count;
    }
    private static int lookupStudentGrade(String[] studentNames, int[] grades, String studentToLookup) {
        int index = 0;
        for (int i = 0 ; i < grades.length; i++){
            if(studentNames[i].equals(studentToLookup)){
                index = i;
            }
        }
        return grades[index];
    }
}
