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
public class Queue extends List{
    private int size;
    
    public Queue() {
        size = 0;
    }
    
    public void enQueue(Object data) {
        super.insertAtEnd(data);
        size++;
    }
    
    public Object deQueue() throws Exception {      
         Object temporal =  super.removeAtFront();
         size--;
         return temporal;
    }

    public int getSize() {
        return size;
    }
       
}
