/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mascotas;

public class Mascotas {

    protected String nombre;
    protected int unidadesDaño;
    protected int unidadesVida;
    protected String habilidad;
    protected int nivel;
    protected String tipo;
    protected boolean efecto;
    protected int vidasSuficientes;

//    public boolean estaVivo(){
//        
//        return puntosVida>0;
//        
//    }
//    public int obtenerPuntosDeVida() {
//
//        return puntosVida;
//    }
    private int calcularDefensa() {
        int defensa = MetodosAleatorios.MetodoAleatorio.generarAleatorio(unidadesDaño, unidadesVida);
        return defensa;
    }

    @Override
    public String toString() {
        return "\n Datos Mascotas: "
                + "\n Nombre = " + nombre
                + "\n Unidades Daño = " + unidadesDaño
                + "\n Unidades Vida = " + unidadesVida
                + "\n Habilidades   = " + habilidad
                + "\n Tipo          = " + tipo;

    }

}
