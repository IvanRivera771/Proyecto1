/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoMascotas;

import Mascotas.Mascotas;

/**
 *
 * @author Ivan Rivera
 */
public class Caracol extends Mascotas {

    public Caracol() {

        nombre = "Caracol";
        unidadesDaño = 2;
        unidadesVida = 2;
        habilidad = "Resurgir";
        tipo = "Insecto/Solitario";
        efecto = false;

    }

}
