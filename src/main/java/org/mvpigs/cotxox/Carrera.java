package org.mvpigs.cotxox;

import org.mvpigs.cotxox.Conductores.Conductor;
import org.mvpigs.cotxox.Conductores.PoolConductores;

public class Carrera {

    private String tarjetaCredito = "";
    private double tiempoEsperado = 0d;
    private double tiempoCarrera = 0d;
    private double costeTotal = 0d;
    private Conductor conductor = null;
    private double distancia = 0d;

    private String origen = "";
    private String destino = "";
	private int propina;

    public Carrera(String tarjetaCredito) {
        this.setTarjetaCredito(tarjetaCredito);
    }

	public String getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public double getTiempoEsperado() {
		return tiempoEsperado;
	}

	public void setTiempoEsperado(double tiempoEsperado) {
		this.tiempoEsperado = tiempoEsperado;
	}

	public double getTiempoCarrera() {
		return tiempoCarrera;
	}

	public void setTiempoCarrera(double tiempoCarrera) {
		this.tiempoCarrera = tiempoCarrera;
	}

	public double getCosteTotal() {
		return costeTotal;
	}

	public void setCosteTotal(double costeTotal) {
		this.costeTotal = costeTotal;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
    public void asignarConductor(PoolConductores conductores) {
		setConductor(conductores.asignarConductor());
	}

	public void realizarPago(double pago) {
		this.costeTotal = pago;
	}

	public void recibirPropina(int propina) {
		this.propina = propina;
	}

	public int getPropina() {
		return this.propina;
	}

	public void liberarConductor() {
		getConductor().setOcupado(false);
	}

	public double getCosteEsperado() {
		return Tarifa.getCosteTotalEsperado(this);
	}

}