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
public class MaintenanceQueue {

    public Node start;
    public Node ending;
    private int size;

    public MaintenanceQueue() {
        start = null;
        ending = null;
        size = 0;
    }

    public void setPlane(Airplane plane) {
        insert(plane);
    }

    public void moveToMaintenance(MaintenanceList maintenanceList) {
        if (startQueue() == null) {
            return;
        }
        maintenanceList.addAviones((Airplane) startQueue());
        if (maintenanceList.getEstado()) {
            eliminate();
        }
    }

    public void insert(Object data) {

        if (isEmpty()) {
            start = new Node(data);
            ending = start;
        } else {
            ending = ending.next = new Node(data);
        }
        size++;
    }

    public Object eliminate() {
        if (isEmpty()) {
            return null;
        }
        Object aux = start.getData();
        start = start.next;
        size--;
        return aux;
    }

    public Object startQueue() {
        if (start == null) {
            return null;
        }
        return start.getData();

    }

    public boolean isEmpty() {
        return start == null;
    }

    public Object getData(int index) {
        index = size - index - 1;
        int iterator = 0;
        Node temporal = start;

        while (iterator < index) {
            temporal = temporal.getNext();
            iterator++;
        }
        return temporal.getData();
    }

    public int sizeQueue() {
        return size;
    }

    public void printStationInformation(JTextArea terminal) {
        for (int i = sizeQueue() - 1; i >= 0; i--) {
            Airplane avion = (Airplane) getData(i);
            terminal.append("	PLANE: " + avion.getCorrelative() + "\n	TYPE: "
                    + avion.getType() + "\n 	PASSENGERS: "
                    + avion.getPassengers() + "\n 	DESABORDAJE TURNS: "
                    + avion.getDesabordajeTurn() + "\n 	MAINTENANCE TURNS: "
                    + avion.getMaintenanceTurn() + "\n");
        }
    }
}
