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
    private int peopleQuantity;
    private int turnQuantity;
    private int maintenanceTurns;

    public Airplane(String type, int peopleQuantity, int turnQuantity, int maintenanceTurns) {
        setType(type);
        setPeopleQuantity(peopleQuantity);
        setTurnQuantity(turnQuantity);
        setMaintenanceTurns(maintenanceTurns);
    }

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPeopleQuantity() {
        return peopleQuantity;
    }

    public void setPeopleQuantity(int peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public int getTurnQuantity() {
        return turnQuantity;
    }

    public void setTurnQuantity(int turnQuantity) {
        this.turnQuantity = turnQuantity;
    }

    public int getMaintenanceTurns() {
        return maintenanceTurns;
    }

    public void setMaintenanceTurns(int maintenanceTurns) {
        this.maintenanceTurns = maintenanceTurns;
    }
    
    
}
