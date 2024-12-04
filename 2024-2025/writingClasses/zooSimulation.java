import javax.swing.*;

public class zooSimulation {
    public static void main(String[] args) {

        // Create Habitats
        Habitat savannah = new Habitat("Savannah", 500.0, 35.0);
        Habitat rainforest = new Habitat("Rainforest", 300.0, 28.0);
        Habitat aquarium = new Habitat("Aquarium", 200.0, 20.0);
        Habitat aviary = new Habitat("Aviary", 150.0, 25.0);

        // Create Zoo
        Zoo zoo = new Zoo();

        // Add Animals to Zoo
        zoo.addAnimal1("Leo", "Lion", 5, savannah);
        zoo.addAnimal2("Zara", "Zebra", 3, savannah);
        zoo.addAnimal3("Nemo", "Clownfish", 1, aquarium);
        zoo.addAnimal4("Polly", "Parrot", 2, aviary);

        // Create Staff
        Staff alice = new Staff("Alice", "Zookeeper", savannah);
        Staff bob = new Staff("Bob", "Aquatic Specialist", aquarium);

        alice.assignStaff(rainforest);
    }
}

class Animal{
    private String name;
    private String species;
    private int age;
    Habitat habitat;

    public Animal(String name, String species, int age, Habitat habitat){
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = habitat;
    }

}

class Habitat{
    private String type;
    private double size;
    private double temperature;

    public Habitat(String type, double size, double temperature){
        this.type = type;
        this.size= size;
        this.temperature = temperature;
    }

}

class Zoo{
    Animal a1;
    Animal a2;
    Animal a3;
    Animal a4;

    void addAnimal1(String name, String species, int age, Habitat habitat){
        a1 = new Animal(name, species, age, habitat);
    }

    void addAnimal2(String name, String species, int age, Habitat habitat){
        a2 = new Animal(name, species, age, habitat);
    }

    void addAnimal3(String name, String species, int age, Habitat habitat){
        a3 = new Animal(name, species, age, habitat);
    }
    void addAnimal4(String name, String species, int age, Habitat habitat){
        a4 = new Animal(name, species, age, habitat);
    }
}

class Staff{
    private String name;
    private String role;
    private Habitat assignedHabitat;

    public Staff(String name, String role, Habitat assignedHabitat){
        this.name = name;
        this.role = role;
        this.assignedHabitat = assignedHabitat;
    }

    public void assignStaff(Habitat habitat){
        assignedHabitat = habitat;
        System.out.println("Staff named " + name + " is assigned to habitat named " + habitat);
    }

}
