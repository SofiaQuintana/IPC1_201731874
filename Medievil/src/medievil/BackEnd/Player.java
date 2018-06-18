/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievil.BackEnd;

/**
 *
 * @author zofia
 */
public class Player {
    
    private String name;
    private  int lifes;

    public Player() {
    }

    
    
    public Player(String name) {
        this.name = name;
        this.lifes=5;
    }

    public int getVidas() {
        return lifes;
    }

    public String getName() {
        return name;
    }
    
    
    public void addVidas(int vidas){
        this.lifes+=vidas;
    }
    
    public void quitarVidas(int vidas){
        this.lifes-=vidas;
    }
    
}
