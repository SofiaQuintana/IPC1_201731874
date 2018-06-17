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
public class Knight {
    public String imagePath = "";
    public static final String POWER = "Strenght";
    public static final String NAME = "Knight";
    public static final int DAMAGE = 2;
    public static final int ATTACK_POSITION = 1;
    public static final int DISTANCE = 2;
    private int position; //Posicion en la que el jugador coloca dicho personaje de los 3 disponibles.
    public static final int ID_KNIGHT_1 = 3;
    public static final int ID_KNIGHT_2 = 4;
    private int idBoard;
    private int positionInBoardX;
    private int positionInBoardY;
    

    public Knight(int position) {
        setPosition(position);
    }

    public Knight() {
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
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

    public String getImagePath(int id) {
        setImagePath(id);
        return imagePath;
    }

    public void setImagePath(int id) {
        if(id == ID_KNIGHT_1) {
            this.imagePath = "/Images/knight1.png";
        } else if(id == ID_KNIGHT_2) {
            this.imagePath = "/Images/knight2.jpg";
        }        
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
