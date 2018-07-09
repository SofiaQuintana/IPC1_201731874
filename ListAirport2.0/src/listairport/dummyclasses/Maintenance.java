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
public class Maintenance {

    private boolean state;
    private Airplane airplane;

    public Maintenance(boolean state, Airplane plane) {
        setState(state);
        setAirplane(plane);
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean estado) {
        this.state = estado;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public String isAvailable() {
        if (isState()) {
            return "Available";
        } else {
            return "Busy";
        }
    }

}
