/**
 * Team Name: G1
 * Contributing Team Member: Nickolaus Macy
 */

package elevatorSim;
import java.util.ArrayList;

public class Elevator {
    private int currentFloor = 1;
    private final ArrayList<Integer> queue = new ArrayList<>();
    private final Building building;

    public Elevator(Building b) {
        this.building = b;
    }

    public String addStop(int floor) {
        if (floor == currentFloor) return "Already at " + building.getFloorDescription(floor) + "\n";
        if (!queue.contains(floor)) {
            queue.add(floor);
            return "Request Logged: Floor " + floor + "\n";
        }
        return "Floor " + floor + " already in queue.\n";
    }

    public String move() {
        if (queue.isEmpty()) return "";
        int target = queue.remove(0);
        String dir = (target > currentFloor) ? "UP" : "DOWN";
        String log = "Moving " + dir + " from " + currentFloor + " to " + target + "...\n";
        currentFloor = target;
        return log + "ARRIVED: " + building.getFloorDescription(currentFloor) + "\n\n";
    }

    public boolean hasWork() { return !queue.isEmpty(); }
}

