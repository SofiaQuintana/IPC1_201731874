/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievil.Backend;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author zofia
 */
public class Wizard {
    private String imagePath = "";
    public static final String POWER = "Magic Ball";
    public static final int DAMAGE = 1;
    public static final int ATTACK_POSITION = 1;
    public static final int DISTANCE = 4;
    public static final int ID_WIZARD_1 = 1;
    public static final int ID_WIZARD_2 = 2;
    private int idBoard;
    private int positionInBoardX;
    private int positionInBoardY;    
    private int position;

    public Wizard(int position) {
        setPosition(position);
    }

    public Wizard() {
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getImagePath(int id) {      
        setImagePath(id);
            return imagePath;
    }

    public void setImagePath(int id) {
        if(id == ID_WIZARD_1) {
            this.imagePath = "/Images/wizard1.jpg";
        } else if(id == ID_WIZARD_2) {
            this.imagePath ="/Images/wizard2.jpg";
        }        
    }

    public int getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(int positionInBoard) {
        this.idBoard = positionInBoard;
    }

    public int getPositionInBoardX() {
        return positionInBoardX;
    }

    public void setPositionInBoardX(int positionInBoard) {
        this.positionInBoardX = positionInBoard;
    }

    public int getPositionInBoardY() {
        return positionInBoardY;
    }

    public void setPositionInBoardY(int positionInBoardY) {
        this.positionInBoardY = positionInBoardY;
    }
    
     public ImageIcon obtainImage(int size, int id){
        ImageIcon imageCharacter=new ImageIcon(getImagePath(id));
        Image image=imageCharacter.getImage();
        Image sizeImage= image.getScaledInstance(size,size,Image.SCALE_SMOOTH);
        imageCharacter=new ImageIcon(sizeImage);
        return imageCharacter;
    }
     
      public void coordinates(int x, int y) {
        setPositionInBoardX(x);
        setPositionInBoardY(y);
    }
}
