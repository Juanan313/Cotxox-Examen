package org.mvpigs.cotxox;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TarifaTest {

    /**
     *  Tests para las clase Tarifa, esta contiene atributos y metodos estáticos por lo cual no es necesario inicializarla.
     */
    @Test
    public void atributosTest() {

        assertEquals(1.35, Tarifa.getCosteMilla(), 0.1);
        assertEquals(0.35, Tarifa.getCosteMinuto(),0.1);
        assertEquals(5, Tarifa.getCosteMinimo());
        assertEquals(20, Tarifa.getPorcentajeComisión());

    }

}