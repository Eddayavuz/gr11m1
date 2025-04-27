public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism: We declare an array of type Animal,
        // but store Chicken and Cow objects (subclasses of Animal)
        Animal[] farmAnimals = {
                new Chicken(1, "Henrietta", 2, "female"),
                new Cow(2, "Bessie", 4, "female"),
                new Chicken(3, "Cluckster", 1, "male")
        };

        System.out.println("Morning on the farm!");
        for (Animal animal : farmAnimals) {
            // Polymorphism in action:
            // The correct makeSound() and getProduct() methods
            // are called depending on the actual object type at runtime
            animal.makeSound();
            System.out.println(animal.getName() + " produces: " + animal.getProduct());
            System.out.println();
        }
    }
}

// Base class (Superclass)
class Animal {
    int id;
    String name;
    int age;
    String gender;
    String product;

    public Animal(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    // Methods intended to be overridden in subclasses (runtime polymorphism)
    public void makeSound(){}
    public String getProduct(){
        return product;
    }
}

// Subclass Chicken inherits from Animal
class Chicken extends Animal {
    public Chicken(int id, String name, int age, String gender) {
        super(id, name, age, gender);
    }

    @Override // Polymorphism: Overriding the makeSound method
    public void makeSound() {
        System.out.println(name + " the chicken says: Cluck cluck!");
    }

    @Override // Polymorphism: Overriding the getProduct method
    public String getProduct() {
        if (gender.equalsIgnoreCase("female")) {
            return "Eggs";
        } else {
            return "Nothing (just feathers!)";
        }
    }
}

// Subclass Cow inherits from Animal
class Cow extends Animal {
    public Cow(int id, String name, int age, String gender) {
        super(id, name, age, gender);
    }

    @Override // Polymorphism: Overriding the makeSound method
    public void makeSound() {
        System.out.println(name + " the cow says: Moo!");
    }

    @Override // Polymorphism: Overriding the getProduct method
    public String getProduct() {
        if (gender.equalsIgnoreCase("female")) {
            return "Milk";
        } else {
            return "Nothing (maybe beef someday!)";
        }
    }
}
