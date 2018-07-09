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
    public Node start;
    public Node ending;
    private int size;

    public BagList() {
        start = null;
        ending = null;
        size = 0;
    }

    public void setBag(int correlative) {
        insertData(correlative);
    }

    public void deleteBag(int quantity) {
        while (quantity != 0) {
            delete(1);
            quantity--;
        }
    }

    public void insertData(Object data) {
        Node auxiliar = new Node(data);
        if (start == null) {
            start = auxiliar;
            start.next = start;
            auxiliar.previous = ending;
            ending = auxiliar;
        } else {
            ending.next = auxiliar;
            auxiliar.next = start;
            auxiliar.previous = ending;
            ending = auxiliar;
            start.previous = ending;
        }
    }

    public void delete(int quantity) {
        if (start != null) {
            if (quantity > 0) {
                int iterator = 1;
                Node auxiliar = start;
                while ((auxiliar.getNext() != start) && (iterator < quantity)) {
                    iterator++;
                    auxiliar = auxiliar.getNext();
                }
                if (iterator == 1) {
                    if (auxiliar.getNext() == start) {
                        start = null;
                    } else {
                        Node ant = auxiliar.getPrevious();
                        ant.setNext(auxiliar.getNext());
                        auxiliar = auxiliar.getNext();
                        auxiliar.setPrevious(ant);
                        start = auxiliar;
                    }
                } else {
                    Node ant = auxiliar.getPrevious();
                    auxiliar.setPrevious(null);
                    ant.setNext(auxiliar.getNext());
                    auxiliar = auxiliar.getNext();
                    auxiliar.setPrevious(ant);
                }
            }
        }
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int getSize() {
        return size;
    }

    public void printBags(JTextArea terminal) {
        Node auxiliar = start;
        if (start != null) {
            do {
                terminal.append("\nBAG: " + auxiliar.getData());
                auxiliar = auxiliar.next;
            } while (auxiliar != start);
        }
    }
}