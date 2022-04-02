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
public class Ardilla extends Mascotas {

    public Ardilla() {

        nombre = "Ardilla";
        unidadesDaño = 2;
        unidadesVida = 5;
        habilidad = "Rebajas";
        tipo = "Domestico";

        efecto = false;

    }
}
