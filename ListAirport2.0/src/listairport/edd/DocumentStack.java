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
public class DocumentStack {

    public Node start;
    public Node ending;
    private int size;

    public DocumentStack() {
        start = null;
        ending = null;
        size = 0;
    }

    public void setDocuments(int documents) {
        insertData(documents);
    }

    public void insertData(Object data) {

        if (isEmpty()) {
            start = new Node(data);
            ending = start;
        } else {
            start = new Node(data, start);
        }
        size++;
    }

    public Object eliminateData() {
        if (isEmpty()) {
            return null;
        }
        Object auxiliar = start.getData();
        start = start.next;
        size--;
        return auxiliar;
    }

    public Object getData(int index) {
        index = size - index - 1;
        int iterator = 0;
        Node auxiliar = start;

        while (iterator < index) {
            auxiliar = auxiliar.getNext();
            iterator++;
        }
        return auxiliar.getData();
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int getSize() {
        return size;
    }

    public void printDocuments(JTextArea terminal) {
        for (int i = getSize() - 1; i >= 0; i--) {
            int quantity = (int) getData(i);
            terminal.append("\n DOCUMENTS: " + quantity + "\n");
        }
    }

}
