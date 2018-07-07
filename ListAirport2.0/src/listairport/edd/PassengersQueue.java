/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.edd;

import javax.swing.JTextArea;
import listairport.dummyclasses.Passenger;

/**
 *
 * @author zofia
 */
public class PassengersQueue {
    public Node inicio;
        public Node fin;
        private int size;

        public PassengersQueue() {
            inicio = null;
            fin = null;
            size = 0;
        }

        public void setPasajero(int numero, int maletas, int documentos) {
            Passenger pasajero = new Passenger(numero, maletas, documentos);
            insertar(pasajero);
        }

        public int getMaletas() {
            if (sizeCola() != 0) {
                Passenger p = (Passenger) getElemento(sizeCola() - 1);
                return p.getMaletas();
            }
            return 0;
        }

        public void insertar(Object objeto) {

        if (estaVacia()) {
            inicio = new Node(objeto);
            fin = inicio;
        } else {
            fin = fin.next = new Node(objeto);
        }
        size++;
    }

    public Object quitar() {
        if (estaVacia()) {
            return null;
        }
        Object aux = inicio.getData();
        inicio = inicio.next;
        size--;
        return aux;
    }

    public Object getElemento(int indice) {
        indice = size - indice - 1;
        int cont = 0;
        Node aux = inicio;

        while (cont < indice) {
            aux = aux.getNext();
            cont++;
        }
        return aux.getData();
    }

    public int sizeCola() {
        return size;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public int getSize() {
        return size;
    }

    public void recorrerPasajeros(JTextArea consola) {
        for (int i = sizeCola() - 1; i >= 0; i--) {
            Passenger p = (Passenger) getElemento(i);
            consola.append("\nPASAJERO: " + p.getNumero() + "\n");
            consola.append("	MALETAS: " + p.getMaletas() + "\n 	DOCUMENTOS: " + p.getDocumentos() + "\n");
        }
    }

}
