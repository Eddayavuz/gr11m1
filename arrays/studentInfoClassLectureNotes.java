public class studentInfoClassLectureNotes {

    public static void main(String[] args) {
        Students[] studentArray = {
                new Students("Iliyan", "Petrov", 2002),
                new Students("Mila", "Dimitrova", 2003),
                new Students("Stefan", "Ivanov", 2001)
        };
        getOldest(studentArray).displayInfo();
    }

    // find the oldest student. And return the Student object.
    public static Students getOldest(Students[] studentArray){
    int index = 0;
    int oldest = 0;

    for (int i=0; i < studentArray.length; i++){
        if(studentArray[i].birthYear> oldest){
            oldest = studentArray[i].birthYear;
            index = i;
        }
    }
        return studentArray[index];
    }
}

class Students{
    public String name;
    public String lastname;
    public int birthYear;

    public Students(String name, String lastname, int birthYear){
        this.name = name;
        this.lastname = lastname;
        this.birthYear = birthYear;
    }

    public void displayInfo(){
        System.out.println("name: " + name + " last name: " + lastname + " birth year: " + birthYear);
    }
}
