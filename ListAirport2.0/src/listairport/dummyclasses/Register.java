/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.dummyclasses;

import listairport.edd.DocumentStack;
import listairport.edd.PassengersQueue;

/**
 *
 * @author zofia
 */
public class Register {
    private char correlative;
    private PassengersQueue queue;
    private Passenger passenger;
    private DocumentStack stack;
    private boolean state;
    
    public Register(char correlative, PassengersQueue queue, DocumentStack stack, Passenger passenger, boolean state) {
        setCorrelative(correlative);
        setQueue(queue);
        setStack(stack);
        setPassenger(passenger);
        setState(state);
    }

    public char getCorrelative() {
        return correlative;
    }

    public void setCorrelative(char correlative) {
        this.correlative = correlative;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public PassengersQueue getQueue() {
        return queue;
    }

    public void setQueue(PassengersQueue queue) {
        this.queue = queue;
    }

    public DocumentStack getStack() {
        return stack;
    }

    public void setStack(DocumentStack stack) {
        this.stack = stack;
    }

    public String isAvailable() {
        if(isState()) {
            return "Available";
        } else {
            return "Busy";
        }
    }
    
    @Override
    public String toString() {
        return "Desk: " + getCorrelative() + "\n"
                +"Passenger: " + getPassenger().getCorrelative() +"\n"
                +"Turns: " + getPassenger().getRegisterTurns() + "\n";
    }
    
    
}
