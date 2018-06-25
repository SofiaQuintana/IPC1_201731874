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
public class List {
    private String name;
    private Node start, end;

    public List(String name) {
        this.name = name;
    }

    public List() {
        this("");
    }
    
    public boolean isEmpty() {
        return (null == start);
    }
    
   public void insertAtFront(Object data) {
       if(isEmpty()) {
           start = end = new Node(data);
       } else {
           start = new Node(data, start);
       }
   }
   
   public void insertAtEnd(Object data) {
       if(isEmpty()) {
           start = end = new Node(data);
       } else {
           end = end.next = new Node(data);
       }
   }
   
   public Object removeAtFront() throws Exception{
       if(isEmpty()) {
           throw new Exception("La lista " + name + " esta vacia.");
       } 
           Object data = start.getData();
           if(start == end) {
               start = end = null;
           } else {
               start = start.next;
           }
           return data;
       
   }
   
   public Object removeAtEnd() throws Exception {
       if(isEmpty()) {
           throw new Exception("La lista " + name + " esta vacia.");
       }
           Object data = end.getData();
            if(start == end) {
                start = end = null;
            }  else {
                Node actual = start;
                
                while(actual.next != end ) {
                    actual = actual.next;
                }
                    end = actual;
                    actual.next = null;
                
            }
            return data;
   }
   
   public void print() {
       Node temporal = start;
       if(temporal == null) {
           System.out.println("La " + name + " esta vacia.");
       }
       System.out.print("Contenido");
       while(temporal != null) {
           System.out.println("," + temporal.getData());
           temporal = temporal.next;
       }
   }
}
