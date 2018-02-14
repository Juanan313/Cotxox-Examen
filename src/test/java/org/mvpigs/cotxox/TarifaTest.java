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

    @Test
    public void getCosteMillaTest() {

        assertEquals(10.12, Tarifa.getCosteDistancia(7.5),0.1);
        assertEquals(1.35, Tarifa.getCosteDistancia(1),0.1);
        assertEquals(0, Tarifa.getCosteDistancia(0),0.1);
        assertEquals(0, Tarifa.getCosteDistancia(-10),0.1);
        assertEquals(257.5, Tarifa.getCosteDistancia(190.74),0.1);
    }
    @Test
    public void getCosteMinuto() {

        assertEquals(18, Tarifa.getCosteTiempo(51.42),0.1);
        assertEquals(0.35, Tarifa.getCosteTiempo(1),0.1);
        assertEquals(0, Tarifa.getCosteTiempo(0),0.1);
        assertEquals(0, Tarifa.getCosteTiempo(-250),0.1);

    }
}