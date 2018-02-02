package entity;

import java.io.Serializable;


/**
 * The persistent class for the centro_trabajo database table.
 * 
 */

public class CentroTrabajo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idCentroTrabajo;
	private int estado;
	private int idOficina;
	private int idUnidad;
	
	public CentroTrabajo() {
	}

	public int getIdCentroTrabajo() {
		return idCentroTrabajo;
	}

	public void setIdCentroTrabajo(int idCentroTrabajo) {
		this.idCentroTrabajo = idCentroTrabajo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}

	public int getIdUnidad() {
		return idUnidad;
	}

	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}

	@Override
	public String toString() {
		return "CentroTrabajo [idCentroTrabajo=" + idCentroTrabajo + ", estado=" + estado + ", idOficina=" + idOficina
				+ ", idUnidad=" + idUnidad + "]";
	}
	
	}