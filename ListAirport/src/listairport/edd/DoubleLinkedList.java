/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.edd;

import listairport.dummyclasses.Airplane;

/**
 *
 * @author zofia
 */
public class DoubleLinkedList {
    private Node first;
    
    public void insertAtEnding(int dpi, String nombre){
        Airplane plane = new Airplane(dpi, dpi, dpi, dpi).
        Node nuevo=new NodoPersona(dpi,nombre);
        if(primero==null){
            primero=nuevo;
        }else{
            NodoPersona aux=primero;
            while(aux.sig!=null){
                aux=aux.sig;
            }
            aux.sig=nuevo;
            nuevo.ant=aux;
        }
    }
}
