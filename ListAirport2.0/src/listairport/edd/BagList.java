/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.edd;

import javax.swing.JTextArea;

/**
 *
 * @author zofia
 */
public class BagList {

    public Node inicio;
    public Node fin;
    private int size;

    public BagList() {
        inicio = null;
        fin = null;
        size = 0;
    }

    public void setMaleta(int numero) {
        ingresar(numero);
    }

    public void eliminarMaleta(int cantidad) {
        while (cantidad != 0) {
            eliminar(1);
            cantidad--;
        }
    }

    public void ingresar(Object objeto) {
        Node nuevo = new Node(objeto);

        if (inicio == null) {
            inicio = nuevo;
            inicio.next = inicio;
            nuevo.previous = fin;
            fin = nuevo;
        } else {
            fin.next = nuevo;
            nuevo.next = inicio;
            nuevo.previous = fin;
            fin = nuevo;
            inicio.previous = fin;
        }
    }

    public void eliminar(int maleta) {
        if (inicio != null) {
            if (maleta > 0) {
                int cont = 1;
                Node aux = inicio;
                while ((aux.getNext() != inicio) && (cont < maleta)) {
                    cont++;
                    aux = aux.getNext();
                }
                if (cont == 1) {
                    if (aux.getNext() == inicio) {
                        inicio = null;
                    } else {
                        Node ant = aux.getPrevious();
                        ant.setNext(aux.getNext());
                        aux = aux.getNext();
                        aux.setPrevious(ant);
                        inicio = aux;
                    }
                } else {
                    Node ant = aux.getPrevious();
                    aux.setPrevious(null);
                    ant.setNext(aux.getNext());
                    aux = aux.getNext();
                    aux.setPrevious(ant);
                }
            }
        }
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public int getSize() {
        return size;
    }

    public void recorrerMaletas(JTextArea consola) {
        Node aux = inicio;
        if (inicio != null) {
            do {
                consola.append("\nMALETA: " + aux.getData());
                aux = aux.next;
            } while (aux != inicio);
        }
    }
}