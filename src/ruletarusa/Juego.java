package ruletarusa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sosaj
 */
public class Juego {

    private final List<Jugador> jugadores;
    private final Revolver revolver;

    public Juego(int cantJugadores) {

        this.revolver = new Revolver();
        revolver.girarTambor();
        this.jugadores = new ArrayList<>();

        for (int i = 1; i <= cantJugadores; i++) {

            this.jugadores.add(new Jugador(i));

        }

    }

    public void jugar() {

        while (true) {

            for (Jugador jugador : jugadores) {

                System.out.println("Es el turno del jugador " + jugador.getNombre());

                jugador.disparar(revolver);

                if (jugador.isVivo()) {

                    System.out.println("El arma no se dispara, el siguiente"
                            + " jugador recibe el arma");

                }

                if (!jugador.isVivo()) {

                    System.out.println("El jugador " + jugador.getNombre() + " ha muerto, fin del juego.");

                    return;

                }

            }

        }

    }

}
