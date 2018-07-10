/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.edd;

import javax.swing.JTextArea;
import listairport.dummyclasses.Register;

/**
 *
 * @author zofia
 */
public class RegisterList {

    public Node start;
    public Node ending;
    private int size;

    public RegisterList() {
        start = null;
        ending = null;
        size = 0;
    }

    public void setRegister(char correlative, PassengersQueue queue, DocumentStack stack) {
        Register register = new Register(correlative, queue, stack);
        insertAtFront(register);
    }

    public Register getRegister(int index) {
        Register desk = (Register) getData(index);
        return desk;
    }

    public void insertAtFront(Object data) {
        if (start == null) {
            start = new Node(data, null, null);
            ending = start;
        } else {
            Node temporal = new Node(data, null, start);
            start.setPrevious(temporal);
            start = temporal;
        }
        size++;
    }

    public void insertAtEnding(Object data) {

        if (start == null) {
            start = new Node(data, null, null);
            ending = start;
        } else {
            Node temporal = new Node(data, ending, null);
            ending.setNext(temporal);
            ending = temporal;
        }
        size++;
    }

    public Object getData(int index) {
        index = size - index - 1;
        int iterator = 0;
        Node auxiliar = start;

        while (iterator < index) {
            auxiliar = auxiliar.getNext();
            iterator++;
        }
        return auxiliar.getData();
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int getSize() {
        return size;
    }

    public void printDesk(JTextArea terminal) {
        for (int i = 0; i < getSize(); i++) {
            Register desk = (Register) getData(i);
            terminal.append("\n DESK" + desk.getCorrelative() + "\n");
            desk.getQueue().printPassengers(terminal);
            desk.getStack().printDocuments(terminal);
        }
    }
}
