/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.edd;

/**
 *
 * @author zofia
 */
public class Node {

    public Node next;
    public Node previous;
    private Object data;

    //constructor para lista doble
    public Node(Object data, Node previous, Node next) {
        setNext(next);
        setData(data);
        setPrevious(previous);
    }

    //constructor para cola simple
    public Node(Object data) {
        setNext(null);
        setData(data);
    }

    //constructor para lista simple
    public Node(Object data, Node next) {
        setNext(next);
        setData(data);
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
