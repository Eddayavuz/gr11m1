/*
Practical Task – House Composition
------------------------------------
Concept: Composition (A House HAS Rooms)

In this example:
- A House object *creates and owns* its Room objects.
- If the House is destroyed, its Rooms cannot exist on their own.
*/

public class Composition {
    public static void main(String[] args) {
        // 🏠 Step 1: Create a House with two Rooms
        House myHouse = new House("Maple Street 24", "Living Room", "Kitchen");

        // 🏠 Step 2: Show all details of the house
        myHouse.showDetails();
    }
}

class Room {
    private String roomName;

    // Constructor for creating a room
    public Room(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}

class House {
    private String address;
    private Room room1;
    private Room room2;

    // Constructor – creates a house and its rooms together
    public House(String address, String room1Name, String room2Name) {
        this.address = address;

        // Composition: the rooms are created INSIDE the house
        this.room1 = new Room(room1Name);
        this.room2 = new Room(room2Name);
    }

    // Display details of the house
    public void showDetails() {
        System.out.println("🏡 House located at: " + address);
        System.out.println("This house has the following rooms:");
        System.out.println("- " + room1.getRoomName());
        System.out.println("- " + room2.getRoomName());
    }
}
