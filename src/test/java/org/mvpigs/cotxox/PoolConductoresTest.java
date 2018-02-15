package org.mvpigs.cotxox;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mvpigs.cotxox.Conductores.Conductor;
import org.mvpigs.cotxox.Conductores.PoolConductores;

public class PoolConductoresTest {

    static PoolConductores poolConductores;
    static Conductor Pablo;
    static Conductor María;
    static Conductor Juan;
    static ArrayList<Conductor> listaConductores = new ArrayList<Conductor>();
    static String[] modelos;
    static String[] matricula;

    @BeforeClass
    public static void setUp() {

        Pablo = new Conductor("Pablo");
        María = new Conductor("María");
        Juan = new Conductor("Juan");

        String[] matricula = { "4ABC123", "5DHJ234", "4JDK258" };
		String[] modelos = { "Chevy Malibu", "Toyota Prius","Golf" };

        listaConductores.add(Pablo);
        listaConductores.add(María);
        listaConductores.add(Juan);

        poolConductores = new PoolConductores(listaConductores);
        
        int indice = 0;
        for (Conductor conductor : poolConductores.getPoolConductores()) {
            conductor.setMatricula(matricula[indice]);
            conductor.setModelo(modelos[indice]);
            conductor.setValoracion((byte)0);
            indice++;
        }
    }

    @Test
    public void poolConductoresTest() {

        int posicion = 0;
        for (Conductor conductor : poolConductores.getPoolConductores()) {
            assertEquals(conductor.getNombre(), listaConductores.get(posicion).getNombre());
            posicion++;
        }
     

        for (Conductor conductor : poolConductores.getPoolConductores()) {
			System.out.println(conductor.getNombre());
			System.out.println(conductor.getModelo());
			System.out.println(conductor.getMatricula());
			System.out.println(conductor.getValoracion());

        }
    }
}