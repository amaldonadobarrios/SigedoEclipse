package entity;

import java.io.Serializable;



/**
 * The persistent class for the estado_ht database table.
 * 
 */

public class EstadoHt implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idEstadoHt;
	private String descripcion;
	
	public EstadoHt() {
	}

	public int getIdEstadoHt() {
		return this.idEstadoHt;
	}

	public void setIdEstadoHt(int idEstadoHt) {
		this.idEstadoHt = idEstadoHt;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "EstadoHt [idEstadoHt=" + idEstadoHt + ", descripcion=" + descripcion + "]";
	}

}