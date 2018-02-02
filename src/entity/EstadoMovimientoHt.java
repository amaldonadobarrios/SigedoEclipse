package entity;

import java.io.Serializable;



/**
 * The persistent class for the estado_movimiento_ht database table.
 * 
 */
public class EstadoMovimientoHt implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int idEstadoMovimientoHt;

	private String descripcion;

	public EstadoMovimientoHt() {
	}

	public int getIdEstadoMovimientoHt() {
		return this.idEstadoMovimientoHt;
	}

	public void setIdEstadoMovimientoHt(int idEstadoMovimientoHt) {
		this.idEstadoMovimientoHt = idEstadoMovimientoHt;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "EstadoMovimientoHt [idEstadoMovimientoHt=" + idEstadoMovimientoHt + ", descripcion=" + descripcion
				+ "]";
	}

}