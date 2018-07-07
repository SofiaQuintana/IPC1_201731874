/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.backend;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import listairport.edd.AirplaneList;
import listairport.edd.BagList;
import listairport.edd.MaintenanceList;
import listairport.edd.MaintenanceQueue;
import listairport.edd.PassengersQueue;

/**
 *
 * @author zofia
 */
public class GeneralController {

    private AirplaneList planesList;
    private PassengersQueue passengersQueue;
    private BagList bagsList;
    private MaintenanceQueue maintenanceQueue;
    private MaintenanceList maintenanceList;
    private int planesQuantity;
    public int turns = 0;
    private int number = 1;
    private int iterator;
    private int stationsQuantity;
    private int passengers;
    private int desabordaje;
    private int maintenance;
    private int bags;
    private int documents;
    private int bagsIterator;
    private int bagNumber = 1;
    private String type;
    private boolean initialized = false;

    public void obtainPlanes() {
        int planeType = (int) (Math.random() * 3 + 1);
        switch (planeType) {
            case 1:
                type = "Small";
                desabordaje = 1;
                passengers = (int) ((Math.random() * 6) + 5);
                maintenance = (int) ((Math.random() * 3) + 1);
                break;
            case 2:
                type = "Medium";
                desabordaje = 2;
                passengers = (int) ((Math.random() * 11) + 15);
                maintenance = (int) ((Math.random() * 4) + 2);
                break;
            case 3:
                type = "Large";
                desabordaje = 3;
                passengers = (int) ((Math.random() * 11) + 30);
                maintenance = (int) ((Math.random() * 6) + 3);
                break;
            default:
                break;
        }
    }

    public void addPlanes() {
        if (planesQuantity > 0) {
            obtainPlanes();
            planesList.setPlane(number, type, passengers, desabordaje, maintenance);
            number++;
            planesQuantity--;
            addPassengers();
            addBags();
        }
    }

    public void addStations() {
        while (stationsQuantity != 0) {
            maintenanceList.iniciarLista();
            stationsQuantity--;
        }
    }

    public void eliminatePassengers() {
        int passenger = 5;
        while (passenger != 0) {
            bagsList.eliminarMaleta(passengersQueue.getMaletas());
            passengersQueue.quitar();
            passenger--;
        }
    }

    public void addPassengers() {
        iterator += passengers;
        for (int i = (iterator - passengers + 1); i < (iterator + 1); i++) {
            luggagePassengers();
            passengersQueue.setPasajero(i, bags, documents);
            bagsIterator += bags;
        }
    }

    public void addBags() {
        while (bagsIterator != 0) {
            bagsList.setMaleta(bagNumber);
            bagNumber++;
            bagsIterator--;
        }
    }

    public void luggagePassengers() {
        bags = (int) (Math.random() * 4 + 1);
        documents = (int) (Math.random() * 10 + 1);
    }

    public void printTerminal(JTextArea terminal, int turns) {
        terminal.append("\n*************** TURN " + turns + "***************\n");
        terminal.append("\n ----------- PLANES -----------\n");
        planesList.printPlanes(terminal);

        terminal.append("\n ----------- PASSENGERS -----------\n");
        passengersQueue.recorrerPasajeros(terminal);

        terminal.append("\n --------- BAGS ---------\n");
        bagsList.recorrerMaletas(terminal);

        terminal.append("\n --------- STATIONS ---------\n");
        maintenanceList.recorrerMantenimiento(terminal);

        terminal.append("\n --------- QUEUE ---------\n");
        maintenanceQueue.printStationInformation(terminal);

        terminal.append("\n**************************** TURN ENDING  " + turns + "****************************\n");
    }

    public void turnAction(JTextArea terminal) {
        planesList.decreaseTurn();
        maintenanceList.bajarTurno();
        for (int i = 0; i < 5; i++) {
            planesList.eliminatePlane(maintenanceQueue);
            maintenanceList.terminaMantenimiento();
            maintenanceQueue.moveToMaintenance(maintenanceList);
        }
        if (!initialized) {
            addPlanes();
            turns++;
            printTerminal(terminal, turns);
            initialized = true;
            return;
        }
        eliminatePassengers();
        addPlanes();
        turns++;
        printTerminal(terminal, turns);
    }

    public void initializeComponents(JTextField planeField, JTextField terminalField, JTextArea terminal) {
        turns = 0;
        number = 1;
        iterator = 0;
        bagNumber = 1;
        planesList = new AirplaneList();
        passengersQueue = new PassengersQueue();
        bagsList = new BagList();
        maintenanceList = new MaintenanceList();
        maintenanceQueue = new MaintenanceQueue();
        planesQuantity = Integer.parseInt(planeField.getText());
        stationsQuantity = Integer.parseInt(terminalField.getText());
        addStations();
        printTerminal(terminal, turns);
    }
}
