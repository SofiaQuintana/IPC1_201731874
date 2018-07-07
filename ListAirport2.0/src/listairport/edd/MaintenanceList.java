/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport.edd;

import javax.swing.JTextArea;
import listairport.dummyclasses.Airplane;
import listairport.dummyclasses.Maintenance;

/**
 *
 * @author zofia
 */
public class MaintenanceList {
    public Node inicio;
    public Node fin;
    public int size;
    private boolean estado;

    public MaintenanceList() {

        inicio=null;
        fin=null;
        size=0;

    }
    
    public void addAviones(Airplane avion) {
        for (int i = 0; i < getSize(); i++) {
            estado = false;
            Maintenance mantenimiento = (Maintenance) getElemento(i);
            if (mantenimiento.isState()) {
                mantenimiento.setState(false);
                mantenimiento.setAirplane(avion);
                estado = true;
                return;
            } else {
                estado = false;
            }
        }
    }

    public void iniciarLista() {
        Maintenance nuevo = new Maintenance(true, null);
        insertarInicio(nuevo);
    }

    public void bajarTurno() {
        for (int i = 0; i < getSize(); i++) {
            Maintenance mantenimiento = (Maintenance) getElemento(i);
            if (mantenimiento.getAirplane() != null) {
                mantenimiento.getAirplane().setMaintenanceTurn(mantenimiento.getAirplane().getMaintenanceTurn() - 1);
            }
        }
    }

    public void terminaMantenimiento() {
        for (int i = 0; i < getSize(); i++) {
            Maintenance mantenimiento = (Maintenance) getElemento(i);
            if (mantenimiento.getAirplane() != null) {
                if (mantenimiento.getAirplane().getMaintenanceTurn() <= 0) {
                    mantenimiento.setAirplane(null);
                    mantenimiento.setState(true);
                }
            }
        }
    }

    public void insertarInicio(Object objeto) {
        Node nodo = new Node(objeto, inicio);
        inicio = nodo;
        if (fin == null) {
            fin = inicio;
        }
        size++;
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

    public boolean estaVacia() {
        return inicio == null;
    }
    
    public int getSize() {
        return size;
    }

    public boolean getEstado() {
        return estado;
    }
  
    public void recorrerMantenimiento(JTextArea consola) {
        for (int i = 0; i < getSize(); i++) {
            Maintenance mantenimiento = (Maintenance) getElemento(i);
            if (mantenimiento.getAirplane() == null) {
                consola.append("\nESTACION " + (i + 1));
                consola.append("\n	ESTADO: " + mantenimiento.isAvailable() + "\n");
            } else {
                consola.append("\nESTACION " + (i + 1));
                consola.append("\n	ESTADO: " + mantenimiento.isAvailable() + mantenimiento.getAirplane());
            }
        }
    }

}
