/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievil;

/**
 *
 * @author zofia
 */
public class Player {
    private String name;
    private Character[] characters;
    private int lifesQuantity;

    public Player(String name, Character[] characters, int lifesQuantity) {
        this.name = name;
        this.characters = characters;
        this.lifesQuantity = lifesQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character[] getCharacters() {
        return characters;
    }

    public void setCharacters(Character[] characters) {
        this.characters = characters;
    }

    public int getLifesQuantity() {
        return lifesQuantity;
    }

    public void setLifesQuantity(int lifesQuantity) {
        this.lifesQuantity = lifesQuantity;
    }
    
    
}
