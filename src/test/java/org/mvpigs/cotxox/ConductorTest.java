package org.mvpigs.cotxox;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mvpigs.cotxox.Conductores.Conductor;

public class ConductorTest {
    static Conductor conductor1;
    static Conductor conductor2;

    @BeforeClass
    public static void setUp() {
        conductor1 = new Conductor("Pablo");
        conductor2 = new Conductor("María");
        conductor1.setMatricula("0306JRK");
        conductor2.setMatricula("1875ABC");
        conductor1.setValoracion((byte)5);
        
    }
    @Test
    public void conductorConstructorTest() {

        assertEquals("María", conductor2.getNombre());
        assertEquals("Pablo", conductor1.getNombre());
    }

    @Test
    public void ValoracionMediaTest() {

		assertEquals(1, conductor1.getNumeroValoraciones(), 0);
		assertEquals(5, conductor1.getValoracion(), 0.1);

		int numeroValoraciones = 0;
		for (int valoracion = 0; valoracion <= 5; valoracion++) {
			conductor1.setValoracion((byte) valoracion);
			numeroValoraciones++;
		}
		assertEquals(numeroValoraciones + 1, conductor1.getNumeroValoraciones(), 0);
		assertEquals(2.875, conductor1.getValoracion(), 0.1);
	}

}