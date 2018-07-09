/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.edd;

import javax.swing.JTextArea;
import listairport.dummyclasses.Passenger;

/**
 *
 * @author zofia
 */
public class Queue {
    public Node start;
    public Node ending;
    private int size;

    public Queue() {
        start = null;
        ending = null;
        size = 0;
    }
    
    public void setPassenger(Passenger passenger) {
        insertData(passenger);
    }

    public int getBags() {
        if (sizeQueue() != 0) {
            Passenger passenger = (Passenger) getData(sizeQueue() - 1);
            return passenger.getBags();
        }
        return 0;
    }

    public void insertData(Object data) {

        if (isEmpty()) {
            start = new Node(data);
            ending = start;
        } else {
            ending = ending.next = new Node(data);
        }
        size++;
    }

    public Object eliminateData() {
        if (isEmpty()) {
            return null;
        }
        Object auxiliar = start.getData();
        start = start.next;
        size--;
        return auxiliar;
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

    public int sizeQueue() {
        return size;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int getSize() {
        return size;
    }

    public void printPassengers(JTextArea terminal) {
        for (int i = sizeQueue() - 1; i >= 0; i--) {
            Passenger passenger = (Passenger) getData(i);
            terminal.append("\n PASSENGER: " + passenger.getCorrelative() + "\n");
            terminal.append("	BAGS: " + passenger.getBags() + "\n 	DOCUMENTS: " + passenger.getDocuments() + 
                                    "\n 	REGISTER TURN: " + passenger.getRegisterTurns()+ 
                                    "\n");
        }
    }

}
