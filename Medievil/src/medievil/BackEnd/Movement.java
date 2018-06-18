/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievil.BackEnd;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import medievil.FrontIn.BoardFrame;

/**
 *
 * @author gamcas
 */
public class Movement extends Thread{
    
    public int cantidad=0;
    public Board tablero=null;
 
    
    public Movement(int cantidad, Board tablero){
        this.cantidad=cantidad;
        this.tablero=tablero;
    }
    
  public boolean finX(Characters personaje){
        if(personaje.positionX>=tablero.size-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean inicioX(Characters personaje){
        if(personaje.positionX<=0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean finY(Characters personaje){
        if(personaje.positionY>=tablero.size-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean inicioY(Characters personaje){
        if(personaje.positionY<=0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void moverAbajo(int cantidad){
        tablero.getPosition();
        if(cantidad<=0){
            return;
        }
        if(finY(tablero.wizard)){
            cantidad=0;
            
            tablero.logicMatrix[tablero.size-1][tablero.wizard.positionX]=0;
            tablero.graphicMatrix[tablero.size-1][tablero.wizard.positionX].setIcon(null);
            tablero.wizard.positionX=0;
            tablero.wizard.positionY=0;
            
            if(tablero.size%2==1){
                tablero.logicMatrix[(tablero.size-1)-((tablero.size-1)/2)][(tablero.size-1)-((tablero.size-1)/2)]=3;
            }
            else{
                tablero.logicMatrix[((tablero.size/2))][((tablero.size/2)+1)-1]=3;
            }
            tablero.rePaint();
            return;
        }
        else{
            try {
                //mover una posicion
                tablero.logicMatrix[tablero.wizard.positionY][tablero.wizard.positionX]=0;
                tablero.graphicMatrix[tablero.wizard.positionY][tablero.wizard.positionX].setIcon(null);
                tablero.rePaint();
                tablero.wizard.positionY+=1;
                tablero.logicMatrix[tablero.wizard.positionY][tablero.wizard.positionX]=3;
                tablero.rePaint();
                cantidad--;
                Thread.sleep(500);
                
                moverAbajo(cantidad);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    public void moverArriba(int cantidad){
        tablero.getPosition();
        if(cantidad<=0){
            return;
        }
        if(inicioY(tablero.wizard)){
            cantidad=0;
            tablero.logicMatrix[0][tablero.wizard.positionX]=0;
            tablero.graphicMatrix[0][tablero.wizard.positionX].setIcon(null);
            tablero.wizard.positionX=tablero.size-1;
            tablero.wizard.positionY=tablero.size-1;
            
            if(tablero.size%2==1){
                tablero.logicMatrix[(tablero.size-1)-((tablero.size-1)/2)][(tablero.size-1)-((tablero.size-1)/2)]=3;
            }
            else{
                tablero.logicMatrix[((tablero.size/2))][((tablero.size/2)+1)-1]=3;
            }
            tablero.rePaint();
            return;
        }
        else{
            try {
                //mover una posicion
                tablero.logicMatrix[tablero.wizard.positionY][tablero.wizard.positionX]=0;
                tablero.graphicMatrix[tablero.wizard.positionY][tablero.wizard.positionX].setIcon(null);
                tablero.rePaint();
                tablero.wizard.positionY-=1;
                tablero.logicMatrix[tablero.wizard.positionY][tablero.wizard.positionX]=3;
                tablero.rePaint();
                cantidad--;
                Thread.sleep(500);
                
                moverArriba(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void moverIzquierda(int cantidad){
        tablero.getPosition();
        if(cantidad<=0){
            return;
        }
        if(inicioX(tablero.wizard)){
            cantidad=0;
            tablero.logicMatrix[tablero.wizard.positionY][0]=0;
            tablero.graphicMatrix[tablero.wizard.positionY][0].setIcon(null);
            tablero.wizard.positionX=tablero.size-1;
            tablero.wizard.positionY=tablero.size-1;
            
            if(tablero.size%2==1){
                tablero.logicMatrix[(tablero.size-1)-((tablero.size-1)/2)][(tablero.size-1)-((tablero.size-1)/2)]=3;
            }
            else{
                tablero.logicMatrix[((tablero.size/2))][((tablero.size/2)+1)-1]=3;
            }
            tablero.rePaint();
            return;
        }
        else{
            try {
                //mover una posicion
                tablero.logicMatrix[tablero.wizard.positionY][tablero.wizard.positionX]=0;
                tablero.graphicMatrix[tablero.wizard.positionY][tablero.wizard.positionX].setIcon(null);
                tablero.rePaint();
                tablero.wizard.positionX-=1;
                tablero.logicMatrix[tablero.wizard.positionY][tablero.wizard.positionX]=3;
                tablero.rePaint();
                cantidad--;
                Thread.sleep(500);
                
                moverIzquierda(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void moverDerecha(int cantidad){
        tablero.getPosition();
        if(cantidad<=0){
            return;
        }
        if(finX(tablero.wizard)){
            cantidad=0;
            
            tablero.logicMatrix[tablero.wizard.positionY][tablero.size-1]=0;
            tablero.graphicMatrix[tablero.wizard.positionY][tablero.size-1].setIcon(null);
            tablero.wizard.positionX=0;
            tablero.wizard.positionY=0;
            
            if(tablero.size%2==1){
                tablero.logicMatrix[(tablero.size-1)-((tablero.size-1)/2)][(tablero.size-1)-((tablero.size-1)/2)]=3;
            }
            else{
                tablero.logicMatrix[((tablero.size/2))][((tablero.size/2)+1)-1]=3;
            }
            tablero.rePaint();
            return;
        }
        else{
            try {
                //mover una posicion
                tablero.logicMatrix[tablero.wizard.positionY][tablero.wizard.positionX]=0;
                tablero.graphicMatrix[tablero.wizard.positionY][tablero.wizard.positionX].setIcon(null);
                tablero.rePaint();
                tablero.wizard.positionX+=1;
                tablero.logicMatrix[tablero.wizard.positionY][tablero.wizard.positionX]=3;
                tablero.rePaint();
                cantidad--;
                Thread.sleep(500);
                
                moverDerecha(cantidad);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    public void run(){
      
        
        switch (BoardFrame.button) {
            case "Abajo":
                moverAbajo(cantidad);
                break;       
            case "Arriba":
                moverArriba(cantidad);
                break;
            case "Izquierda":
               moverIzquierda(cantidad);
                break;
                 case "Derecha":
               moverDerecha(cantidad);
                break;
            default:
                break;
        }
    }
}