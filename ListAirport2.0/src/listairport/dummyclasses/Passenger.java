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
     private int bags, documents, correlative;

    public Passenger(int correlative, int bags, int documents) {
        this.correlative = correlative;
        this.bags = bags;
        this.documents = documents;
    }

    public int getMaletas() {
        return bags;
    }

    public void setMaletas(int maletas) {
        this.bags = maletas;
    }

    public int getNumero() {
        return correlative;
    }

    public void setNumero(int numero) {
        this.correlative = numero;
    }

    public int getDocumentos() {
        return documents;
    }

    public void setDocumentos(int documentos) {
        this.documents = documentos;
    }
    
  
    public String toString() {
        return " " + getNumero();
    }

}
