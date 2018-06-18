/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievil.Backend;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author zofia
 */
public class Board {
    private int size = 0;
    private JPanel background = null;
    private Wizard wizard;
    private Wizard wizardTwo;
    private Knight knight;
    private Knight knightTwo;
    private Princess princess;
    private Princess princessTwo;
    
    private int[][] logicMatrix;
    private JLabel[][] graphicMatrix; 
    
    private int sizeBlockY = 0;

    public Board(int size, JPanel background) {
        setSize(size);
        this.background = background;
        Board.this.initializeAndFill();
    }

    public Board() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public void initializeAndFill(int size) {
        setSize(size);
        sizeBlockY = 550/size;
        graphicMatrix = new JLabel[size][size];
        logicMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                graphicMatrix[i][j] = new JLabel();
                Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2, true);
                graphicMatrix[i][j].setBorder(border);
                background.add(graphicMatrix[i][j]);
                logicMatrix[i][j] = 0;
            }
        }
    }
//    public void initializeAndFill() {
//        sizeBlockY = 550/size;
//        logicMatrix = new int[size][size];
//        graphicMatrix = new JLabel[size][size];
//        
//        wizard = new Wizard();
//        wizardTwo = new Wizard();
//        //Recordar que hay que jalar la posicion cuando se llene de manera random;
//        knight = new Knight();
//        knightTwo = new Knight();
//        princessTwo = new Princess();
//        princess = new Princess();
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                logicMatrix[i][j] = 0;             
//            }            
//        }
//        
//        fillCharacters();
//        rePaint();
//    }
    
    public void fillCharacters() {
        logicMatrix[(int) (Math.random() * (size-1) + 0)][(int) (Math.random() * (size-1) + 0)] = Wizard.ID_WIZARD_1;
        logicMatrix[(int) (Math.random() * (size-1) + 0)][(int) (Math.random() * (size-1) + 0)] = Wizard.ID_WIZARD_2;
        logicMatrix[(int) (Math.random() * (size-1) + 0)][(int) (Math.random() * (size-1) + 0)]= Knight.ID_KNIGHT_1;
        logicMatrix[(int) (Math.random() * (size-1) + 0)][(int) (Math.random() * (size-1) + 0)] = Knight.ID_KNIGHT_2;
        logicMatrix[(int) (Math.random() * (size-1) + 0)][(int) (Math.random() * (size-1) + 0)] = Princess.ID_PRINCESS_1;
        logicMatrix[(int) (Math.random() * (size-1) + 0)][(int) (Math.random() * (size-1) + 0)] = Princess.ID_PRINCESS_2;
    }
    
    public void rePaint() {
        JLabel spot = null;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
                switch(logicMatrix[i][j]) {
                    case 0:
                        spot = new JLabel();
                        break;
                    case 1:
                        ImageIcon image0 = wizard.obtainImage(sizeBlockY, 1);
                        spot = new JLabel(image0);
                        wizard.coordinates(i, j);
                    break;
                    case 2:
                        ImageIcon image1 = wizardTwo.obtainImage(sizeBlockY, 2);
                        spot = new JLabel(image1);
                        wizardTwo.coordinates(i, j);
                    break;
                    case 3: 
                        ImageIcon image2 = knight.obtainImage(sizeBlockY, 3);
                        spot = new JLabel(image2);
                        knight.coordinates(i, j);
                    break;
                    case 4:
                        ImageIcon image3 = knightTwo.obtainImage(sizeBlockY, 4);
                        spot = new JLabel(image3);
                        knightTwo.coordinates(i, j);
                    break;
                    case 5:
                        ImageIcon image4 = princess.obtainImage(sizeBlockY, 5);
                        spot = new JLabel(image4);
                        princess.coordinates(j, j);
                    break;
                    case 6:
                        ImageIcon image5 = princessTwo.obtainImage(sizeBlockY, 6);
                        spot = new JLabel(image5);
                        princessTwo.coordinates(i, j);
                    break;
                    default:
                    break;
                }
                
                spot.setOpaque(false);
                spot.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                spot.setBounds(j * sizeBlockY,i*sizeBlockY,sizeBlockY,sizeBlockY);   
                
                graphicMatrix[i][j] = spot;
                background.add(graphicMatrix[i][j], BorderLayout.CENTER);
                background.repaint();
            }
            
        }
    }
}
