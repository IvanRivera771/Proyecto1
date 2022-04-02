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
public class Buey extends Mascotas {

    public Buey() {
        nombre = "Buey";
        unidadesDaño = 1;
        unidadesVida = 4;
        habilidad = "Mejor me protejo";
        tipo = "Mamífero";

        efecto = false;

    }

}
