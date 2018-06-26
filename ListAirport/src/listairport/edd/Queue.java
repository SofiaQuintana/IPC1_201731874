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
public class Queue extends List{
    private int size;
    
    public Queue() {
        super();
        size = 0;
    }
    
    public void initializePassengers() {
        int auxiliar = size;
        auxiliar += 1;
        Passenger passenger = new Passenger(auxiliar);
        enQueue(passenger);
    }
    
    public void enQueue(Object data) {
        super.insertAtEnd(data);
        size++;
    }
    
    public Object deQueue() throws Exception {      
         Object temporal =  super.removeAtFront();
         size--;
         return temporal;
    }

    public int getSize() {
        return size;
    }
    
    public void printPassenger(JTextArea terminal) {
        for (int i = getSize()-1; i >= 0; i--) {
            Passenger passenger = (Passenger) obtainData(i, size);
            terminal.append("\n PASSENGER: " + passenger.getId() +  "\n"
                                    + "     BAGS: " + passenger.getBagQuantity()+ "\n"
                                    + "     DOCUMENTS: " + passenger.getDocumentsQuantity()+ "\n");
        }
    }
	
       
}
