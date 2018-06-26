/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.edd;

import GUI.PrincipalFrame;
import javax.swing.JTextArea;
import listairport.dummyclasses.Airplane;

/**
 *
 * @author zofia
 */
public class DoubleLinkedList extends List {
    private int listSize = 0;    

    public int getListSize() {
        return listSize;
    }
    
    public void addAirplane() {
        Airplane plane = new Airplane();
        insertAtFront(plane);
    }
    
    public Airplane obtainAirplane(int index) {
        Airplane plane = (Airplane) obtainData(index, listSize);
        return plane;
    }
    
    public void recorrer() {
       Node temporal = start;
       if(temporal == null) {
           System.out.println("La lista esta vacia.");
       }
       while(temporal != null) {
           PrincipalFrame.addPassengers();
           temporal.getData();
           temporal = temporal.next;
       }
   }
    
    @Override
    public void insertAtFront(Object data) {
        if(isEmpty()) {
            start = end = new Node(data);
        } else {
            Node nuevo = new Node(data, null, start); //Resolviendo metodo showed by ingeniero Moises.
            start.setPrevious(nuevo);
            start = nuevo;
        }
            listSize++; //Realizamos este sumador con el objetivo de saber cuantos nodos tiene la lista.
    }
    
    public void decreace() {
        for (int i = 0; i < getListSize(); i++) {
            Airplane plane = (Airplane) obtainData(i, listSize);
            if(plane.getTurnQuantity() <= 0) {
                eliminateSpecifiedData(i, listSize);
            }
            plane.turnQuantity = plane.turnQuantity - 1;
        }
    }
    
    public void printList(JTextArea terminal) {
        for (int i = 0; i < getListSize(); i++) {
            Airplane plane = (Airplane) obtainData(i, getListSize());
            int number = i;
            number = number + 1;
            terminal.append("AIRPLANE " + number);
            terminal.append("       TYPE: " + plane.getType() +"\n"
                                     + "        PASSENGERS: " + plane.getPeopleQuantity() + "\n" 
                                     + "        DESABORDAJE: " + plane.getTurnQuantity() + "\n"
                                     + "        MAINTENANCE: " + plane.getMaintenanceTurns() + "\n");
        }
        
    }
    
}
