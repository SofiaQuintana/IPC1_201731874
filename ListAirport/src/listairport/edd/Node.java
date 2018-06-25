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
    public Object data;
    public Node next;
    public Node previous;
    
    public Node(Object data, Node next) {
        setData(data);
        setNext(next);    
    }
    
    public Node(Object data) {
        setData(data);
        setNext(null);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
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
    
    
}
