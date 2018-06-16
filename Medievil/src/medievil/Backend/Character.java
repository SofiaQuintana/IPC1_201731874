/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievil.Backend;

/**
 *
 * @author zofia
 */
public class Character {
    private Princess princess;
    private Knight knight;
    private Wizard wizard;

    public Character(Princess princess, Knight knight, Wizard wizard) {
        this.princess = princess;
        this.knight = knight;
        this.wizard = wizard;
    }

    public Character() {
    }
    
    public Princess getPrincess() {
        return princess;
    }

    public Knight getKnight() {
        return knight;
    }

    public Wizard getWizard() {
        return wizard;
    }
    
    
}
