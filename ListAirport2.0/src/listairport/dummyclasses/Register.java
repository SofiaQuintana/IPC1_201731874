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
    private DocumentStack stack;
    
    public Register(char correlative, PassengersQueue queue, DocumentStack stack) {
        setCorrelative(correlative);
        setQueue(queue);
        setStack(stack);
    }

    public char getCorrelative() {
        return correlative;
    }

    public void setCorrelative(char correlative) {
        this.correlative = correlative;
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

    @Override
    public String toString() {
        return "Desk: " + getCorrelative();
    }
    
    
}
