/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mascotas;

/**
 *
 * @author Ivan Rivera
 */
public class Mascotas {

    protected int unidadesDaño;
    protected int unidadesVida;
    protected boolean efecto;
    protected int puntosVida;
    
    
    
    
    public boolean estaVivo(){
        
        return puntosVida>0;
        
    }
    
    public int obtenerPuntosDeVida(){
        
        return puntosVida;
    }
    
    private int calcularDefensa(){
        int defensa= MetodosAleatorios.MetodoAleatorio.generarAleatorio(unidadesDaño, unidadesVida);
        return defensa;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "unidadesDa\u00f1o=" + unidadesDaño + ", unidadesVida=" + unidadesVida + ", efecto=" + efecto + ", puntosVida=" + puntosVida + '}';
    }

    
    
    
    
}
