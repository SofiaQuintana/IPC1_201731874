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
    private Graphics graphics;
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
    private int registerTurn;
    private int bagsIterator;
    private int bagNumber = 1;
    private String type;
    private boolean initialized = false;

    public void planesDataGenerator() {
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
                maintenance = (int) ((Math.random() * 3) + 2);
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
            planesDataGenerator();
            planesList.setPlane(number, type, passengers, desabordaje, maintenance);
            number++;
            planesQuantity--;
            addPassengers();
            addBags();
        }
    }

    public void addStations() {
        while (stationsQuantity != 0) {
            maintenanceList.initializeList();
            stationsQuantity--;
        }
    }

    public void eliminatePassengers() {
        int passenger = 5;
        while (passenger != 0) {
            bagsList.deleteBag(passengersQueue.getBags());
            passengersQueue.eliminateData();
            passenger--;
        }
    }

    public void addPassengers() {
        iterator += passengers;
        for (int i = (iterator - passengers + 1); i < (iterator + 1); i++) {
            luggagePassengers();
            passengersQueue.setPassenger(i, bags, documents, registerTurn);
            bagsIterator += bags;
        }
    }

    public void addBags() {
        while (bagsIterator != 0) {
            bagsList.setBag(bagNumber);
            bagNumber++;
            bagsIterator--;
        }
    }

    public void luggagePassengers() {
        bags = (int) (Math.random() * 4 + 1);
        documents = (int) (Math.random() * 10 + 1);
        registerTurn = (int) (Math.random() * 3 + 1);
        
    }

    public void generateImages() {
        //Generador de imagenes para aviones.
        graphics.createDotFile(planesList.start, "Planes");
        graphics.generateImage("Planes.dot", "planes.png");
        //Generador de imagenes para pasajeros.
        
    }
    
    public void printTerminal(JTextArea terminal, int turns) {
        terminal.append("\n******************************* TURN " + turns + "*******************************\n");
        terminal.append("\n ----------- PLANES -----------\n");
        planesList.printPlanes(terminal);

        terminal.append("\n ----------- PASSENGERS -----------\n");
        passengersQueue.printPassengers(terminal);

        terminal.append("\n --------- BAGS ---------\n");
        bagsList.printBags(terminal);

        terminal.append("\n --------- STATIONS ---------\n");
        maintenanceList.printMaintenance(terminal);

        terminal.append("\n --------- QUEUE ---------\n");
        maintenanceQueue.printStationInformation(terminal);

        terminal.append("\n**************************** TURN ENDING  " + turns + "****************************\n");
    }

    public void turnAction(JTextArea terminal)  {
        planesList.decreaseTurn();
        maintenanceList.decreaseTurn();
        for (int i = 0; i < 5; i++) {
            planesList.eliminatePlane(maintenanceQueue);
            maintenanceList.finishMaintenance();
            maintenanceQueue.moveToMaintenance(maintenanceList);
        }
        if (!initialized) {
            addPlanes();
            turns++;
            printTerminal(terminal, turns);
            initialized = true;
            generateImages();
            return;
        }
        eliminatePassengers();
        addPlanes();
        turns++;
        generateImages();
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
        graphics = new Graphics();
        planesQuantity = Integer.parseInt(planeField.getText());
        stationsQuantity = Integer.parseInt(terminalField.getText());
        addStations();
        printTerminal(terminal, turns);
    }
    
    public void validateEmptyness() throws Exception {
        if(passengersQueue.isEmpty() && bagsList.isEmpty() && planesList.isEmpty() 
                && maintenanceQueue.isEmpty()) {
            throw new Exception("Simulacion Finalizada");
        }
    }
}
