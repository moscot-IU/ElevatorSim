package Elevator;

/**
 * Team Name: G1
 * Contributing Team Member: Kendall Ferguson
 */

package elevatorSim;
import javax.swing.Timer;

public class ElevatorController {
    private Elevator elevator;
    private Request gui;
    private Timer timer;

    public ElevatorController(Elevator e, Request r) {
        this.elevator = e;
        this.gui = r;
        
        // 5 second delay between floors
        this.timer = new Timer(5000, event -> {
            if (elevator.hasWork()) {
                gui.updateDisplay(elevator.move());
            } else {
                timer.stop();
            }
        });
    }

    public void handleFloorRequest(int floor) {
        gui.updateDisplay(elevator.addStop(floor));
        if (!timer.isRunning()) timer.start();
    }
}
