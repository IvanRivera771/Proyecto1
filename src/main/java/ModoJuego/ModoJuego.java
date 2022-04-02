package ModoJuego;

import Mascotas.Mascotas;
import Personajes.Jugador;
import RellenarEspacio.RellenarEspacio;
import java.util.Random;
import java.util.Scanner;
import TipoMascotas.*;
import com.sun.xml.internal.ws.addressing.v200408.MemberSubmissionAddressingConstants;

public class ModoJuego {

    private Mascotas Mascotas;
    private Mascotas[] Mascotas1;
    private int niveles = 1;
    private Mascotas[] comprarMascotas;
    private Jugador jugador;
    private Mascotas[] mascotasJugador;
    Mascotas espacioVacio;
    int oro;
    int vida;
    Scanner entrada;

//    private RellenarEspacio RellenarEspacio();
    public ModoJuego() {

        jugador = new Jugador();
        Mascotas = new Mascotas();
        comprarMascotas = new Mascotas[5];
        espacioVacio = new RellenarEspacio();
        comprarMascotas[0] = espacioVacio;
        comprarMascotas[1] = espacioVacio;
        comprarMascotas[2] = espacioVacio;
        comprarMascotas[3] = espacioVacio;
        comprarMascotas[4] = espacioVacio;
        oro = 10;
        vida = 10;

        entrada = new Scanner(System.in);

    }

    public void jugar() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenidos al Juego ");
        System.out.println("*******AUTO PETS*******");
        System.out.println("Elije el Modo que quieras");
        System.out.println("Antes de jugar debes elejir el escenario en el");
        System.err.println("que quieras librar Batalla");
        System.out.println("1. Modo Arena");
        System.out.println("2. Modo Versus");
        System.out.println("3. Modo Creativo");
        int opcion = entrada.nextInt();

    }//Fin Jugar

    public void iniciarJuego() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenidos al Juego ");
        System.out.println("*******AUTO PETS*******");
        System.out.println("Elije el Modo que quieras");
        System.out.println("Antes de jugar debes elejir el escenario en el");
        System.err.println("que quieras librar Batalla");

        System.out.println("Se inicia el Juego....");
        System.out.println("Presiona Enter para continuar...");
        entrada.nextLine();
        Mascotas1 = tiendaMascotas();
        while (jugador.calcularVida()) {

            System.out.println(":::::::::::::::::::::::::::::::::");

            System.out.println("Estos son los animales en tienda");

            System.out.println("Puedes comprar 3 Mascotas en la tienda");
            System.out.println("Selecciona la opcion para continuar");
            System.out.println("1. Comprar ");
            int opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    mostrarMascotas(Mascotas1);
                    mascotasJugador = comprarMascotas(Mascotas1);
                    mostrarEquipo(mascotasJugador);

            }

            entrada.nextLine();
        }

    }

    private Mascotas[] ordenarMascotas(Mascotas[] ordenar) {
        int pos;
        int opcion;
        Mascotas mover;

        System.out.println("Ordena a tus mascotas a tu preferencia");
        mostrarEquipo(ordenar);

        System.out.println("Ingrese la posición de la mascota que va a mover");
        opcion = entrada.nextInt();

        System.out.println("En que posicion quiere guardar la Mascota");
        pos = entrada.nextInt();

        mover = ordenar[opcion - 1];
        ordenar[opcion - 1] = ordenar[pos - 1];
        ordenar[pos - 1] = mover;

        mostrarEquipo(ordenar);
        return ordenar;
        

    }//Fin OrdenarMascotas

    //Mostramos los animales en el equipo
    private void mostrarEquipo(Mascotas[] Mascotas) {

        for (int i = 0; i < Mascotas.length; i++) {

            System.out.println(Mascotas[i]);

        }

    }

    private Mascotas[] comprarMascotas(Mascotas[] mascotas) {
        Scanner entrada = new Scanner(System.in);
        boolean comprado = false;
        int opcion;
        System.out.println("Que mascota deseas comprar");
        opcion = entrada.nextInt();

        if (oro > 2) {
            for (int i = 0; i < comprarMascotas.length; i++) {

                if (comprarMascotas[i] == espacioVacio) {
                    comprarMascotas[i] = mascotas[opcion - 1];
                    mascotas[opcion - 1] = espacioVacio;
                    oro -= 3;
                    System.out.println("Mascota comprada");
                    System.out.println("Cantidad de oro " + oro);
                    comprado = true;
                    break;

                } //Fin if 

            }//Fin for
            if (comprado == false) {
                System.out.println("Ya no hay espacio en el equipo");

            }
        } else {

            System.out.println("Ya no te queda mas oro, no puedes comprar mas mascotas");

        }
        return comprarMascotas;

    }//Fin ComprarMascotas

    private void mostrarMascotas(Mascotas[] mostrarMascotas) {

        for (int i = 0; i < mostrarMascotas.length; i++) {

            System.out.println(mostrarMascotas[i]);

        }

    }

    public Mascotas[] tiendaMascotas() {

        Mascotas espacioMascotas[] = new Mascotas[3];

        for (int i = 0; i < espacioMascotas.length; i++) {

            espacioMascotas[i] = generarMascotas(niveles);

        }

        niveles++;
        return espacioMascotas;

    }

    public Mascotas generarMascotas(int niveles) {

        Random aleatorio = new Random();
        int elegirMascota = 0;
        if (niveles == 1) {
            elegirMascota = aleatorio.nextInt(8);

        }//Fin if 1
        else if (niveles == 2) {
            elegirMascota = aleatorio.nextInt(16);

        }//Fin if 2
        else if (niveles == 3) {
            elegirMascota = aleatorio.nextInt(27);

        }//Gin if 3
        else if (niveles == 4) {
            elegirMascota = aleatorio.nextInt(35);

        }//Gin if 4
        else if (niveles == 5) {
            elegirMascota = aleatorio.nextInt(43);

        }//Gin if 5
        else if (niveles == 6) {
            elegirMascota = aleatorio.nextInt(52);

        }//Gin if 6
        else if (niveles == 7) {
            elegirMascota = aleatorio.nextInt(54);

        }//Gin if 7

        switch (elegirMascota) {

            case 1:

                Mascotas = new Hormiga();
                break;

            case 2:
                Mascotas = new Pescado();
                break;

            case 3:
                Mascotas = new Mosquito();
                break;

            case 4:
                Mascotas = new Grillo();
                break;
            case 5:
                Mascotas = new Castor();
                break;
            case 6:
                Mascotas = new Caballo();
                break;
            case 7:
                Mascotas = new Nutria();
                break;
            case 8:
                Mascotas = new Escarabajo();
                break;
            case 9:
                Mascotas = new Sapo();
                break;
            case 10:
                Mascotas = new Dodo();
                break;
            case 11:
                Mascotas = new Elefante();
                break;
            case 12:
                Mascotas = new PuercoEspin();
                break;
            case 13:
                Mascotas = new Pavoreal();
                break;
            case 14:

                Mascotas = new Rata();
                break;
            case 15:

                Mascotas = new Zorro();
                break;
            case 16:

                Mascotas = new Araña();
                break;
            case 17:
                Mascotas = new Camello();
                break;

            case 18:
                Mascotas = new Mapache();
                break;

            case 19:
                Mascotas = new Jirafa();
                break;

            case 20:
                Mascotas = new Tortuga();
                break;

            case 21:

                Mascotas = new Caracol();
                break;

            case 22:

                Mascotas = new Oveja();
                break;

            case 23:
                Mascotas = new Conejo();
                break;

            case 24:
                Mascotas = new Lobo();
                break;

            case 25:
                Mascotas = new Buey();
                break;

            case 26:
                Mascotas = new Canguro();
                break;

            case 27:
                Mascotas = new Buho();
                break;

            case 28:
                Mascotas = new Venado();
                break;

            case 29:
                Mascotas = new Loro();
                break;

            case 30:
                Mascotas = new Hipopotamo();
                break;

            case 31:
                Mascotas = new Delfin();
                break;

            case 32:
                Mascotas = new Puma();
                break;

            case 33:
                Mascotas = new Ballena();
                break;

            case 34:
                Mascotas = new Ardilla();
                break;

            case 35:
                Mascotas = new Llama();
                break;

            case 36:
                Mascotas = new Foca();
                break;

            case 37:
                Mascotas = new Jaguar();
                break;

            case 38:
                Mascotas = new Escorpion();
                break;

            case 39:
                Mascotas = new Rinoceronte();
                break;

            case 40:
                Mascotas = new Mono();
                break;

            case 41:
                Mascotas = new Cocodrilo();
                break;

            case 42:
                Mascotas = new Vaca();
                break;

            case 43:
                Mascotas = new Chompipe();
                break;

            case 44:
                Mascotas = new Panda();
                break;

            case 45:
                Mascotas = new Gato();
                break;

            case 46:
                Mascotas = new Tigre();
                break;

            case 47:
                Mascotas = new Serpiente();
                break;

            case 48:
                Mascotas = new Mamut();
                break;
            case 49:
                Mascotas = new Leopardo();
                break;

            case 50:
                Mascotas = new Gorila();
                break;

            case 51:
                Mascotas = new Pulpo();
                break;

            case 52:
                Mascotas = new Mosca();
                break;

            case 53:
                Mascotas = new Quetzal();

                break;

            case 54:
                Mascotas = new Camaleon();

                break;

        }

        return Mascotas;
    }//Fin

//        public Mascotas[] mascotasTienda() {
//
//        }
}
