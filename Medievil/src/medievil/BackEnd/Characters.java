/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievil.BackEnd;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author zofia
 */
public class Characters {

    int positionY;
    int positionX;
    
    
    public ImageIcon obtainImages(int sizeY, String path) {

        ImageIcon icon = new ImageIcon(getClass().getResource(path));

        Image imagen = icon.getImage();
        Image sizeImagen = imagen.getScaledInstance(sizeY, sizeY, Image.SCALE_SMOOTH);
        icon = new ImageIcon(sizeImagen);

        return icon;

    }

    
}
