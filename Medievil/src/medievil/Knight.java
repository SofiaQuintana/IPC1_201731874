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
public class Knight {
    public static final String IMAGE_PATH = "";
    public static final String POWER = "Strenght";
    public static final int DAMAGE = 2;
    public static final int ATTACK_POSITION = 1;
    public static final int DISTANCE = 2;
    private int position;

    public Wizard(int position) {
        setPosition(position);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}