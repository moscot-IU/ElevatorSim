//ElevatorSim - Class by Morton Scott - 4/17/26 
//This class is deisgned to be the building object that contains our elevator object that traverses the floors of this building

public class Building {

    private int totalFloors;
    private Elevator elevator;

    // Constructor
    public Building(int totalFloors) {
        this.totalFloors = totalFloors;
        this.elevator = new Elevator(1, 1);
    }

    // Constructor
    public Building(int totalFloors, Elevator elevator) {
        this.totalFloors = totalFloors;
        this.elevator = elevator;
    }

    // Getters - 
    // Returns number of total floors
    public int getTotalFloors() { return totalFloors; }

    //Gets Elevators objects in formation
    public Elevator getElevator() { return elevator; }


    // Setters
    // Set total number of floors in the building
    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    //sets which elevator object is in the building
    public void setElevator(Elevator elevator) {
        this.elevator = elevator;
    }
}
