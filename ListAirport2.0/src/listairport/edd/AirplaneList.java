/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.edd;

import javax.swing.JTextArea;
import listairport.dummyclasses.Airplane;

/**
 *
 * @author zofia
 */
public class AirplaneList {

    public Node start;
    public Node ending;
    private int size;

    public AirplaneList() {
        start = null;
        ending = null;
        size = 0;
    }

    public void setPlane(int number, String type, int passengers, int desabordajeTurns,
            int maintenanceTurns) {
        Airplane plane = new Airplane(number, type, passengers, desabordajeTurns, maintenanceTurns);
        insertAtFront(plane);
    }

    public Airplane getPlane(int index) {
        Airplane plane = (Airplane) getData(index);
        return plane;
    }

    public void decreaseTurn() {
        for (int i = 0; i < getSize(); i++) {
            Airplane plane = (Airplane) getData(i);
            plane.setDesabordajeTurn(plane.getDesabordajeTurn() - 1);
        }
    }

    public void eliminatePlane(MaintenanceQueue maintenanceQueue) {
        for (int i = 0; i < getSize(); i++) {
            Airplane plane = (Airplane) getData(i);
            if (plane.getDesabordajeTurn() <= 0) {
                eliminateDate(i);
                maintenanceQueue.setPlane(plane);
            }
        }
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

    public void eliminateDate(int index) {
        index = size - index - 1;
        if (index == 0) {
            start = start.getNext();
        } else {
            int iterator = 0;
            Node auxiliar = start;
            while (iterator < index - 1) {
                auxiliar = auxiliar.getNext();
                iterator++;
            }
            auxiliar.setNext(auxiliar.getNext());
        }
        size--;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int getSize() {
        return size;
    }

    public void printPlanes(JTextArea terminal) {
        for (int i = 0; i < getSize(); i++) {
            Airplane avion = (Airplane) getData(i);
            terminal.append("\n PLANE: " + avion.getCorrelative() + "\n");
            terminal.append("	TYPE: "
                    + avion.getType()
                    + "\n 	PASSENGERS: "
                    + avion.getPassengers()
                    + "\n    DESABORDAJE TURNS: "
                    + avion.getDesabordajeTurn() + "\n 	MAINTENANCE TURNS: "
                    + avion.getMaintenanceTurn() + "\n");
        }
    }
}
