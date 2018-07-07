/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.dummyclasses;

/**
 *
 * @author zofia
 */
public class Airplane {
    private String type;
    private int desabordajeTurn;
    private int maintenanceTurn;
    private int correlative;
    private int passengers;

    public Airplane(int correlative, String type, int passengers, int desabordajeTurn, int maintenanceTurn) {
        this.correlative = correlative;
        this.type = type;
        this.passengers = passengers;
        this.desabordajeTurn = desabordajeTurn;
        this.maintenanceTurn = maintenanceTurn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCorrelative() {
        return correlative;
    }

    public void setCorrelative(int correlative) {
        this.correlative = correlative;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getDesabordajeTurn() {
        return desabordajeTurn;
    }

    public void setDesabordajeTurn(int desabordajeTurn) {
        this.desabordajeTurn = desabordajeTurn;
    }

    public int getMaintenanceTurn() {
        return maintenanceTurn;
    }

    public void setMaintenanceTurn(int maintenanceTurn) {
        this.maintenanceTurn = maintenanceTurn;
    }
    
    public String toString() {
        return "\n	AIRPLANE: " + correlative + "\n	TYPE: " + type + "\n	PASSENGERS: "
                + passengers + "\n	DESABORDAJE TURN: " + desabordajeTurn
                + "\n	 MAINTENANCE TURN: " + maintenanceTurn + "\n";
    }
}