package medievil.BackEnd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board {

    public int size = 0;
    public JPanel background = null;

    public int[][] logicMatrix;
    public JLabel[][] graphicMatrix;
   

    public int sizeBlockY;
    public Characters princess, princess2;
    public Characters wizard, wizard2;
    public Characters knight, knight2;
    public Characters bomb;
    public Characters heart;
    
    public Random random = new Random();

    public Board(int size, JPanel panel) {
        this.size = size;
        this.background = panel;
        fill();
 
    }

    public Board() {

    }
    
    public void fillBombs() {
        int cantidadBombas = (int) (size * (0.0938) * size);
        for (int i = 0; i <= cantidadBombas; i++) {
            logicMatrix[random.nextInt(size)][random.nextInt(size)] = 2;

        }
    }

    public void fillHearts
        () {
        int lifes = (int) (size * (0.047) * size);
        for (int i = 0; i <= lifes; i++) {
            logicMatrix[random.nextInt(size)][random.nextInt(size)] = 1;

        }
    }

    public void fill() {

        sizeBlockY = 600 / size;
        logicMatrix = new int[size][size];
        graphicMatrix = new JLabel[size][size];

        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {

                logicMatrix[i][j] = 0;
            }
        }
        fillBombs();
        fillHearts();

        logicMatrix[random.nextInt(size)][random.nextInt(size)] = 3;
        wizard = new Characters();

        logicMatrix[random.nextInt(size)][random.nextInt(size)] = 4;
        knight = new Characters();

        logicMatrix[random.nextInt(size)][random.nextInt(size)] = 5;
        princess = new Characters();

        logicMatrix[random.nextInt(size)][random.nextInt(size)] = 6;
        wizard2 = new Characters();

        logicMatrix[random.nextInt(size)][random.nextInt(size)] = 7;
        knight2 = new Characters();

        logicMatrix[random.nextInt(size)][random.nextInt(size)] = 8;
        princess2 = new Characters();

        bomb = new Characters();
        heart = new Characters();
        rePaint();
    }

    public void getPosition() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                switch (logicMatrix[i][j]) {
                    case 3:
                        wizard.positionX = j;
                        wizard.positionY = i;
                        break;
                    case 4:
                        knight.positionX = j;
                        knight.positionY = i;
                        break;
                    case 5:
                        princess.positionX = j;
                        princess.positionY = i;
                        break;
                    case 6:
                        wizard2.positionX = j;
                        wizard2.positionY = i;
                        break;
                    case 7:
                        knight2.positionX = j;
                        knight2.positionY = i;
                        break;
                    case 8:
                        princess2.positionX = j;
                        princess2.positionY = i;
                        break;
                    default:
                        break;
                }
            }
        }
    }
   
    public void rePaint() {

        JLabel spot = null;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                //0 casilla vacia
                switch (logicMatrix[i][j]) {
                    case 0:
                        spot = new JLabel();
                        //si es uno
                        break;
                    case 1:
                        spot = new JLabel(this.heart.obtainImages(sizeBlockY, "/Imagen/fullHeart.jpg"));
                        break;
                    case 2:
                        spot = new JLabel(this.bomb.obtainImages(sizeBlockY, "/Imagen/bomb.png"));
                        break;
                    case 3:
                        spot = new JLabel(this.wizard.obtainImages(sizeBlockY, "/Imagen/wizard1.jpg"));
                        break;
                    case 4:
                        spot = new JLabel(this.knight.obtainImages(sizeBlockY, "/Imagen/knight1.png"));
                        break;
                    case 5:
                        spot = new JLabel(this.princess.obtainImages(sizeBlockY, "/Imagen/princess1.png"));
                        break;
                    case 6:
                        spot = new JLabel(this.wizard2.obtainImages(sizeBlockY, "/Imagen/wizard2.jpeg"));
                        break;
                    case 7:
                        spot = new JLabel(this.knight2.obtainImages(sizeBlockY, "/Imagen/knight2.jpg"));
                        break;
                    case 8:
                        spot = new JLabel(this.princess2.obtainImages(sizeBlockY, "/Imagen/princess2.png"));
                        break;
                    default:
                        break;
                }

                spot.setOpaque(false);
                spot.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
                spot.setBounds(j * sizeBlockY, i * sizeBlockY, sizeBlockY, sizeBlockY);

                graphicMatrix[i][j] = spot;
                background.add(graphicMatrix[i][j], BorderLayout.CENTER);
                background.repaint();
            }

        }

    }
}
