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
public class Movement extends Thread {
    private int quantity;
    private Board board;

    public Movement(int quantity, Board board) {
        this.quantity = quantity;
        this.board = board;
    }
    
    public boolean checkEndings() {
        if(Wizard.ID_WIZARD_1 >= board.getSize() - 1|| Wizard.ID_WIZARD_2 >= board.getSize() -1|| Knight.ID_KNIGHT_1 >= board.getSize() -1||
                Knight.ID_KNIGHT_2 >= board.getSize() -1 || Princess.ID_PRINCESS_1 >= board.getSize() -1|| Princess.ID_PRINCESS_2 >= board.getSize() -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean checkStarting() {
        
    }
}
