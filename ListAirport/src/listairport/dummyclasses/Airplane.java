/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.dummyclasses;

import java.util.Random;

/**
 *
 * @author zofia
 */
public class Airplane {
    private Random random = new Random();
    public String type;
    private int peopleQuantity;
    public int turnQuantity;
    public int maintenanceTurns;
    private int auxiliar;
    private static final String  SIZE_SMALL = "Small";
    private static final String SIZE_MEDIUM = "Medium";
    private static final String SIZE_LARGE = "Large";
    
    public Airplane() {
        setType();
        setPeopleQuantity();
        setTurnQuantity();
        setMaintenanceTurns();
    }

    public String getType() {
        return type;
    }

    public void setType() {
        auxiliar = (int) ((Math.random() *3) + 1);
            switch(auxiliar) {
            case 1: 
                this.type = SIZE_SMALL;
            case 2:
                this.type = SIZE_MEDIUM;
            case 3:
                this.type = SIZE_LARGE;
        }
    }

    public int getPeopleQuantity() {
        return peopleQuantity;
    }

    public void setPeopleQuantity() {
        
        switch(getType()) {
            case "Small" :
                int aux = (int) ((Math.random()*6) + 5);
                this.peopleQuantity = aux;
            case "Medium":
                aux = (int) ((Math.random()*11) + 15);
                this.peopleQuantity = aux;
            case "Large":
                aux = (int) ((Math.random()*11) + 30);
                this.peopleQuantity = aux;
        }
    }

    public int getTurnQuantity() {
        return turnQuantity;
    }

    public void setTurnQuantity() {
        switch(this.type) {
            case "Small":
                this.turnQuantity = 1;
            break;
            case "Medium":
                this.turnQuantity = 2;
            break;
            case "Large":
                this.turnQuantity = 3;
            break;
        }
    }

    public int getMaintenanceTurns() {
        return maintenanceTurns;
    }

    public void setMaintenanceTurns() {
        switch(this.type) {
            case "Small":
                int aux = (int) (Math.random()*2 + 1);
                this.maintenanceTurns = aux;
            break;
            case "Medium":
                aux = (int) (Math.random()*3 + 2);
                this.maintenanceTurns = aux;
            break;
            case "Large":
                aux = (int) (Math.random()*4 + 3);
                this.maintenanceTurns = aux;
            break;
        }
    }
    
    
}
