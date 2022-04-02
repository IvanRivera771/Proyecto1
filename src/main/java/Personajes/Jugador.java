package Personajes;

import Mascotas.Mascotas;
import java.security.AlgorithmParameterGeneratorSpi;

public class Jugador extends Personaje {

//  Alimentos[] alimentos;
    int cantidaddeVida;
    int cantidaddeVictorias;

    public Jugador() {

        cantidaddeVida = 10;
        cantidaddeVictorias = 0;
    }

    public boolean calcularVida() {

        return vidaSuficiente() > 0;

    }

    public int vidaSuficiente() {

        int suficiente = 1;

        return suficiente;

    }

    public Mascotas[] comprarMascotas(Mascotas[] tiendaMascotas) {

        return mascotas;

    }

}//Fin Jugador
