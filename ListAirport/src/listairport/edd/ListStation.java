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
public class ListStation extends List{
    private int size;
    private boolean flag;
    
    public ListStation() {
        super();
        size = 0;
        
    }
    
    public void insertAtStart(Object data) {
        super.insertAtFront(data);
        size++;
    }

    public void initialize() {
        Maintenance maintenance = new Maintenance(true, null);
        insertAtStart(maintenance);
    }
    
    public int getSize() {
        return size;
    }

    public boolean isFlag() {
        return flag;
    }
    
    public void addData(Airplane plane) {
        flag = false;
        for (int i = 0; i < getSize(); i++) {
            flag = false;
            Maintenance maintenance = (Maintenance) obtainData(i, size);
            if(maintenance.isState()) {
                maintenance.setState(flag);
                maintenance.setPlane(plane);
                flag = true;
                return;
            }
        }
    }
    
    public void decreace() {
        for(int i=0 ; i<getSize(); i++) {
            Maintenance maintenance = (Maintenance) obtainData(i, size);
            if(maintenance.getPlane() != null) {
                Airplane plane = maintenance.getPlane();
	plane.maintenanceTurns = plane.maintenanceTurns - 1;
                if(plane.maintenanceTurns <= 0) {
                    maintenance.setState(true);
                    maintenance.setPlane(null);
                }
            }
        }
    }
	
    public void print(JTextArea terminal) {
        for(int i=0 ; i< getSize(); i++) {
            Maintenance maintenance = (Maintenance) obtainData(i, size);
            if(maintenance.getPlane() != null) {
                terminal.append("\n STATION " + (i+1)
                + "\n       STATE: busy \n");
            } else {
                    terminal.append("\n STATION " + (i+1) 
                + "\n       STATE: available "  + maintenance.getPlane());
            }
        }
    }
    
}
