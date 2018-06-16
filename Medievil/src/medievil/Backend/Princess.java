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
public class Princess {
    private String imagePath = "";
    public static final String POWER = "Predictable";
    public static final boolean WEAPON = true;
    public static final int DAMAGE = 1;
    public static final int ATTACK_POSITION = 4;
    public static final int DISTANCE = 1;
    private int position;

    public Princess(int position) {
        setPosition(position);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }   
    
}
