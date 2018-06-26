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
public class Passenger {
    private int id;
    private int bagQuantity;
    private int documentsQuantity;
    private Random random = new Random();
    
    public Passenger(int id) {
        int auxiliar = (int) (Math.random()*4 + 1);
        setBagQuantity(auxiliar);
        setId(id);
        int aux = (int) (Math.random()*10 + 1);
        setDocumentsQuantity(aux);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        
        this.id = id;
    }

    public int getBagQuantity() {
        return bagQuantity;
    }

    public void setBagQuantity(int bagQuantity) {
        this.bagQuantity = bagQuantity;
    }

    public int getDocumentsQuantity() {
        return documentsQuantity;
    }

    public void setDocumentsQuantity(int documentsQuantity) {
        this.documentsQuantity = documentsQuantity;
    }
    
    
}
