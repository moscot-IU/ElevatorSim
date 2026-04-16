package Elevator;

//Elevator Project, Kendall Ferguson, 4/16/2026, This is the code for the Control to the elevators.
//This will make the elevators move up and down when someone makes a request.

import java.util.LinkedList;
import java.util.Queue;

public class ElevatorController {
	
private Elevator elevator;
private Queue<Integer>requests;

public ElevatorController(Elevator elevator) {
	this.elevator = elevator;
	requests = new LinkedList<>();
}

//Adds a floor requests
public void addRequest(int floor) {
	requests.add(floor);
}

//Runs the system
public void run() {
	while (!requests.isEmpty()) {
		int target = requests.poll();
		
		while( elevator.getCurrentFloor() != target) {
			if(elevator.getCurrentFloor() <target) {
				elevator.moveUp();
			} else {
				elevator.moveDown();
			}
			}
		}
		
		elevator.openDoor();
	}
}

