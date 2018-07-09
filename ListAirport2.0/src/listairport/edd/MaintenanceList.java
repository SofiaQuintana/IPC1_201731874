/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.edd;

import javax.swing.JTextArea;
import listairport.dummyclasses.Airplane;
import listairport.dummyclasses.Maintenance;

/**
 *
 * @author zofia
 */
public class MaintenanceList {
    public Node start;
    public Node ending;
    public int size;
    private boolean state; //AYUDA A DETERMINAR SI LA ESTACION ESTA OCUPADA O LIBRE.

    public MaintenanceList() {
        start=null;
        ending=null;
        size=0;
    }
    
    public void addPlanes(Airplane plane) {
        for (int i = 0; i < getSize(); i++) {
            state = false;
            Maintenance maintenance = (Maintenance) getData(i);
            if (maintenance.isState()) {
                maintenance.setState(false);
                maintenance.setAirplane(plane);
                state = true;
                return;
            } else {
                state = false;
            }
        }
    }

    public void initializeList() {
        Maintenance maintenance = new Maintenance(true, null);
        insertAtFront(maintenance);
    }

    public void decreaseTurn() {
        for (int i = 0; i < getSize(); i++) {
            Maintenance maintenance = (Maintenance) getData(i);
            if (maintenance.getAirplane() != null) {
                maintenance.getAirplane().setMaintenanceTurn(maintenance.getAirplane().getMaintenanceTurn() - 1);
            }
        }
    }

    public void finishMaintenance() {
        for (int i = 0; i < getSize(); i++) {
            Maintenance maintenance = (Maintenance) getData(i);
            if (maintenance.getAirplane() != null) {
                if (maintenance.getAirplane().getMaintenanceTurn() <= 0) {
                    maintenance.setAirplane(null);
                    maintenance.setState(true);
                }
            }
        }
    }

    public void insertAtFront(Object data) {
        Node nodo = new Node(data, start);
        start = nodo;
        if (ending == null) {
            ending = start;
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

    public boolean isState() {
        return state;
    }
  
    public void printMaintenance(JTextArea terminal) {
        for (int i = 0; i < getSize(); i++) {
            Maintenance maintenance = (Maintenance) getData(i);
            if (maintenance.getAirplane() == null) {
                terminal.append("\n STATION " + (i + 1));
                terminal.append("\n	STATE: " + maintenance.isAvailable() + "\n");
            } else {
                terminal.append("\n STATION " + (i + 1));
                terminal.append("\n	STATE: " + maintenance.isAvailable() + maintenance.getAirplane());
            }
        }
    }

}
