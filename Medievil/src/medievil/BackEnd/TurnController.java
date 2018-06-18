/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievil.BackEnd;

import medievil.BackEnd.Player;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author joses
 */
public class TurnController {

    private Player jugador1;
    private Player jugador2;
    private int turno;

    public Player iniciarTurno(Player jugador1, Player jugador2) {

        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.turno = 0;
        return obtenerTurno();
    }

    public Player obtenerTurno() {
        if (this.turno == 0) {
            return this.jugador1;
        }
        return this.jugador2;
    }

    public Player cambiarTurno() {

        this.turno = this.turno == 0 ? 1 : 0;

        return obtenerTurno();
    }

}
