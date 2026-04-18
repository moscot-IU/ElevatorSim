/**
 * Team Name: G1
 * Contributing Team Member: Nickolaus Macy
 */

import java.util.ArrayList;
import java.util.Collections;

public class Elevator {
    private int currentFloor;
    private boolean doorsOpen;
    private ArrayList<Integer> floorQueue;
    private final int MAX_FLOOR = 5;
    private final int MIN_FLOOR = 1;

    //Initializes the elevator at the ground floor with closed doors and an empty request list.
    public Elevator() {
        this.currentFloor = 1;
        this.doorsOpen = false;
        this.floorQueue = new ArrayList<>();
    }

    //Adds a floor request to the queue and sorts it to ensure logical movement.
    public void addRequest(int floor) {
        if (floor >= MIN_FLOOR && floor <= MAX_FLOOR) {
            if (!floorQueue.contains(floor)) {
                floorQueue.add(floor);
                Collections.sort(floorQueue); // Basic sorting for simple pathing
                System.out.println("Floor " + floor + " added to queue.");
            }
        } else {
            System.out.println("Invalid floor request.");
        }
    }

    //Moves the elevator to the next floor in the queue.
           public void moveToNextFloor() {
        if (floorQueue.isEmpty()) {
            System.out.println("No pending requests.");
            return;
        }

        int targetFloor = floorQueue.get(0);
        closeDoors();

        while (currentFloor != targetFloor) {
            if (currentFloor < targetFloor) {
                currentFloor++;
            } else {
                currentFloor--;
            }
            System.out.println("Elevator at floor: " + currentFloor);
        }

        floorQueue.remove(0);
        openDoors();
        
        if (currentFloor == 5) {
            System.out.println("Welcome to the Restaurant Floor!");
        }
    }

    public void openDoors() {
        this.doorsOpen = true;
        System.out.println("Doors opening at floor " + currentFloor);
    }

    public void closeDoors() {
        this.doorsOpen = false;
        System.out.println("Doors closing.");
    }

    // Getters for the Control class to use for the GUI later
    public int getCurrentFloor() {
        return currentFloor;
    }

    public boolean areDoorsOpen() {
        return doorsOpen;
    }
}
