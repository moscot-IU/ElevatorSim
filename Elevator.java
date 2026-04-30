/**
 * Team Name: G1
 * Contributing Team Member: Nickolaus Macy
 */
package elevatorSim;

import java.util.ArrayList;

public class Elevator {
    private int currentFloor = 1; // Tracks the elevator's current location
    private final ArrayList<Integer> queue = new ArrayList<>(); // List of pending floor requests
    private final Building building; // Reference to floor descriptions

    // Constructor to link the elevator to the building data
    public Elevator(Building b) {
        this.building = b;
    }

    /**
     * Adds a floor to the movement queue if it isn't already there 
     * and the elevator isn't already at that floor.
     */
    public String addStop(int floor) {
        // Check if the elevator is already at the requested floor
        if (floor == currentFloor) {
            return "Already at " + building.getFloorDescription(floor) + "\n";
        }
        
        // Add floor to queue if it's a new request
        if (!queue.contains(floor)) {
            queue.add(floor);
            return "Request Logged: Floor " + floor + "\n";
        }
        
        return "Floor " + floor + " already in queue.\n";
    }

    /**
     * Processes the next request in the queue, updates the current floor,
     * and returns a status message for the GUI.
     */
    public String move() {
        if (queue.isEmpty()) return "";

        // Remove the first floor in the list to visit it
        int target = queue.remove(0);
        
        // Determine travel direction
        String dir = (target > currentFloor) ? "UP" : "DOWN";
        String log = "Moving " + dir + " from " + currentFloor + " to " + target + "...\n";
        
        // Update state to the new floor
        currentFloor = target;
        
        return log + "ARRIVED: " + building.getFloorDescription(currentFloor) + "\n\n";
    }

    // Helper method to let the Controller know if there are pending stops
    public boolean hasWork() {
        return !queue.isEmpty();
    }
}
