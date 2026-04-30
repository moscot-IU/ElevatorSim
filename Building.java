//ElevatorSim
//This class is deisgned to hold the descriptions of the floors that the elevator traverses
//Team Name: G1
//Contributing Team Member: Morton Scott
 

package elevatorSim;

public class Building {
    private final String[] descriptions = {
        "Clothing", "Home Goods", "Electronics", "Sporting Goods", "Skyview Restaurant"
    };

    public String getFloorDescription(int floor) {
        return (floor >= 1 && floor <= 5) ? descriptions[floor-1] : "Unknown";
    }
}
