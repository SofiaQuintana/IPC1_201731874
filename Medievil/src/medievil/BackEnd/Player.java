/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievil.BackEnd;

/**
 *
 * @author gamcas
 */
public class Player {
    
    private String name;
    private  int vidas;

    public Player() {
    }

    
    
    public Player(String name) {
        this.name = name;
        this.vidas=5;
    }

    public int getVidas() {
        return vidas;
    }

    public String getName() {
        return name;
    }
    
    
    public void addVidas(int vidas){
        this.vidas+=vidas;
    }
    
    public void quitarVidas(int vidas){
        this.vidas-=vidas;
    }
    
}
