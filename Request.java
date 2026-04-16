/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevatorSim;

/**
 *
 * @author maddi
 */
public class Request {

    //Variables
    private int floorNumber;
    private boolean goingUp;

    //Constructors
    public Request(int floorNumber, boolean goingUp) {
        this.floorNumber = floorNumber;
        this.goingUp = goingUp;
    }
    
    //Getters
    public int getFloorNumber() {
        return floorNumber;
    }
    
    public boolean getGoingUp() {
        return goingUp;
    }
}
