
package medievil.BackEnd;

import medievil.FrontIn.BoardFrame;


public class Controller {
    
    	public Player player1;
	public Player player2;
        public Characters dado;
	private TurnController controlador;
        private BoardFrame ui;
    public Controller() {
        controlador=new TurnController();
        ui= new BoardFrame();
    }

    

  
    
    public Player initGame(Player jugador1, Player jugador2 ){
        
        this.player1=jugador1;
        this.player2=jugador2; 
        
        return controlador.iniciarTurno(jugador1, jugador2);
    }
  
    public Player obtainWinner(){
        
        if (player1.getVidas()>player2.getVidas()) {
            return player1;
            
        }else if (player2.getVidas()> player1.getVidas()) {
            return player2;
        }

            return null;
        }
    
    }
    

