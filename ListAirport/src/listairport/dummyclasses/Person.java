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
public class Person {
    private int id;
    private int bagQuantity;
    private int documentsQuantity;

    public Person(int id, int bagQuantity, int documentsQuantity) {
        setId(id);
        setBagQuantity(bagQuantity);
        setDocumentsQuantity(documentsQuantity);
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
