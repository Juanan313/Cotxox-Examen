package org.mvpigs.cotxox.Conductores;

import java.util.ArrayList;
import java.util.Random;

public class PoolConductores {

    private ArrayList<Conductor> poolConductores = new ArrayList<Conductor>();

    
    /* Constructor */
    public PoolConductores(ArrayList<Conductor> poolConductores) {

        this.setPoolConductores(poolConductores);

    }

    /* Getters y Setters */
	public ArrayList<Conductor> getPoolConductores() {
		return poolConductores;
	}


	public void setPoolConductores(ArrayList<Conductor> poolConductores) {
		this.poolConductores = poolConductores;
}
    
    public Conductor asignarConductor() {

        Conductor conductor = new Conductor();
        Random aleatorio = new Random();

        for (int i = 0; i <= this.getPoolConductores().size(); i++) {
            int index = aleatorio.nextInt(getPoolConductores().size());
            conductor = getPoolConductores().get(index);
            if (!conductor.isOcupado()) {
                conductor.setOcupado(true);
                break;
            } 
        }
		return conductor;
    }

}