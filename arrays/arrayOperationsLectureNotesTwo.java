public class arrayOperationsLectureNotesTwo {

    public static void main(String[] args) {

// Enhanced for loops are an alternate method of traversing an array:
        int[] numList = {5,6,7,4,2};
        for(int number: numList)
        {
            System.out. println(number);
        }

// Both standard and enhanced for loops are useful in different contexts.
// For example, since enhanced for loops takes the value of each element,
// they cannot modify the value of an element.

// If elements need to be updated, standard for loops are better.
// In contrast, if elements just need to be accessed, enhanced for loops provide a more streamlined way
// to access elements without the need for a counter. The use of enhanced loops also let us avoid ArrayIndexOutOfBounds error.

        String[] classroom = {"Boris", "Gergana", "Viktor", "Lucy", "Dara"};

//Standard For Loop:
        for(int i = 0; i < classroom.length; i ++)
        {
            System.out.println(classroom[i]);
        }

//Enhanced For Loop:
        for(String student : classroom)
        {
            System.out.println(student);
        }
    }
    }
