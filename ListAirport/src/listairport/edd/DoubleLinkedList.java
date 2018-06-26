/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.edd;

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
    
    @Override
    public void insertAtFront(Object data) {
        if(start==null) {
            start = new Node(data);
            end = start;
        } else {
            Node nuevo = new Node(data, null, start);
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
    
}
