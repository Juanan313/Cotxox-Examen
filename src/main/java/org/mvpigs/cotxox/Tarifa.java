package org.mvpigs.cotxox;

public class Tarifa {

    private static double costeMilla = 1.35;
    private static double costeMinuto = 0.35;
    private static int costeMinimo = 5;
    private static int porcentajeComisión = 20;
	/**
	 * @return the costeMilla
	 */
	public static double getCosteMilla() {
		return costeMilla;
	}
	/**
	 * @return the costeMinuto
	 */
	public static double getCosteMinuto() {
		return costeMinuto;
	}

	/**
	 * @return the costeMinimo
	 */
	public static int getCosteMinimo() {
		return costeMinimo;
	}

	/**
	 * @return the porcentajeComisión
	 */
	public static int getPorcentajeComisión() {
		return porcentajeComisión;
	}


    public static double getCosteDistancia(double distancia) {
        
        if (distancia <= 0) {
            return 0;
        } return distancia * costeMilla;
    }

    public static double getCosteTiempo(double minutos) {

        if (minutos <= 0) {
            return 0;
        } return minutos * costeMinuto;
    }


    
}