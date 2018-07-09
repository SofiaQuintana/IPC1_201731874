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
public class Passenger {

    private int bags;
    private int correlative;
    private int documents;
    private int registerTurns;
    
    public Passenger(int correlative, int bags, int documents, int registerTurns) {
        setCorrelative(correlative);
        setBags(bags);
        setDocuments(documents);
        setRegisterTurns(registerTurns);
    }

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }

    public int getCorrelative() {
        return correlative;
    }

    public void setCorrelative(int correlative) {
        this.correlative = correlative;
    }

    public int getDocuments() {
        return documents;
    }

    public void setDocuments(int documents) {
        this.documents = documents;
    }

    public int getRegisterTurns() {
        return registerTurns;
    }

    public void setRegisterTurns(int registerTurns) {
        this.registerTurns = registerTurns;
    }

    public String toString() {
        return " " + getCorrelative();
    }

}
