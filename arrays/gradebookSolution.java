import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Nikoleta", "Vasil", "Martin", "Svetoslav", "Irina", "Aleksandar"};
        int[] grades = {20, 49, 89, 45, 35, 78};

        Scanner read = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate Average");
            System.out.println("2. Display the student with the highest grade");
            System.out.println("3. Display the student with the lowest grade");
            System.out.println("4. Display the count of students who are failing");
            System.out.println("5. Look up student grade with user input");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = read.nextInt();

            switch (choice) {
                case 1:
                    double averageGrade = calculateAverage(grades);
                    System.out.println("Average Grade: " + averageGrade);
                    break;
                case 2:
                    String highestGradeStudent = findHighestGradeStudent(students, grades);
                    System.out.println("Student with the Highest Grade: " + highestGradeStudent);
                    break;
                case 3:
                    String lowestGradeStudent = findLowestGradeStudent(students, grades);
                    System.out.println("Student with the Lowest Grade: " + lowestGradeStudent);
                    break;
                case 4:
                    int failedStudentsCount = countFailedStudents(grades);
                    System.out.println("Number of Failed Students: " + failedStudentsCount);
                    break;
                case 5:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter the name of the student to look up: ");
                    String studentToLookup = scanner.next();
                    int studentGrade = lookupStudentGrade(students, grades, studentToLookup);
                    System.out.println(studentGrade);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
        while (choice != 6);
    }

    private static double calculateAverage(int[] grades) {
        double sum = 0;
        for (int i=0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }
    private static String findHighestGradeStudent(String[] studentNames, int[] grades) {
        int index = 0;
        int maxGrade = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > maxGrade) {
                maxGrade = grades[i];
                index = i;
            }
        }
        return studentNames[index];
    }

    private static String findLowestGradeStudent(String[] studentNames, int[] grades) {
        int index = 0;
        int minGrade = 100;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < minGrade) {
                minGrade = grades[i];
                index = i;
            }
        }
        return studentNames[index];
    }

    private static int countFailedStudents(int[] grades) {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 50) {
                count++;
            }
        }
        return count;
    }

    private static int lookupStudentGrade(String[] studentNames, int[] grades, String studentToLookup) {
        for (int i = 0; i < studentNames.length; i++) {
            if (studentNames[i].equalsIgnoreCase(studentToLookup)) {
                return grades[i];
            }
        }
        return 0; // Student not found
    }
}
