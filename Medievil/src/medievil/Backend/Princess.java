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
public class Princess {
    private String imagePath = "";
    public static final String POWER = "Predictable";
    public static final boolean WEAPON = true;
    public static final int DAMAGE = 1;
    public static final int ATTACK_POSITION = 4;
    public static final int DISTANCE = 1;
    private int position;
     public static final int ID_PRINCESS_1 = 5;
    public static final int ID_PRINCESS_2 = 6;
    private int idBoard;
    private int positionInBoardX;
    private int positionInBoardY;

    public Princess(int position) {
        setPosition(position);
    }

    public Princess() {
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
        if(id == ID_PRINCESS_1) {
            this.imagePath = "/Images/princess1.png";
        } else if(id == ID_PRINCESS_2) {
            this.imagePath = "/Images/princess2.png";
        }        
    }    

    public int getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(int idBoard) {
        this.idBoard = idBoard;
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
