/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listairport;

import java.util.Random;
import listairport.dummyclasses.Airplane;
import listairport.dummyclasses.Person;

/**
 *
 * @author zofia
 */
public class RandomGenerator {
    private Random random = new Random();
    private static final String  SIZE_SMALL = "Small";
    private static final String SIZE_MEDIUM = "Medium";
    private static final String SIZE_LARGE = "Large";
    
    public String generateType() {
        int auxiliar = (int) (random.nextInt()*3 + 1);
        switch(auxiliar) {
            case 1: 
                return SIZE_SMALL;
            case 2:
                return SIZE_MEDIUM;
            case 3:
                return SIZE_LARGE;
            default:
                return null;
        }
    }
    
    public int generatePlane(Airplane plane) {
        switch(generateType()) {
            case "Small" :
                int auxiliar = (int) (random.nextInt()*10 + 5);
                plane.setTurnQuantity(1);
                int aux = (int) (random.nextInt()*3 + 1);
                return auxiliar;
            case "Medium":
                auxiliar = (int) (random.nextInt()*25 + 15);
                plane.setTurnQuantity(2);
                return auxiliar;
            case "Large":
                auxiliar = (int) (random.nextInt()*40 + 30);
                plane.setTurnQuantity(3);
                return auxiliar;
            default:
                return 0;
        }
    }
    
    
    
}
