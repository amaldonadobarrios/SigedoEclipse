package entity;

import java.io.Serializable;
import java.util.Date;

/**
 * The persistent class for the detalle_ht database table.
 * 
 */

public class DetalleHt implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idDetalleHt;
	private String asunto;
	private Date fechaRegistro;
	private int idOficinaRegistro;
	private int idUnidadRegistro;
	private int idUsuarioRegistro;

	public DetalleHt() {
	}

	public int getIdDetalleHt() {
		return this.idDetalleHt;
	}

	public void setIdDetalleHt(int idDetalleHt) {
		this.idDetalleHt = idDetalleHt;
	}

	public String getAsunto() {
		return this.asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public int getIdOficinaRegistro() {
		return this.idOficinaRegistro;
	}

	public void setIdOficinaRegistro(int idOficinaRegistro) {
		this.idOficinaRegistro = idOficinaRegistro;
	}

	public int getIdUnidadRegistro() {
		return this.idUnidadRegistro;
	}

	public void setIdUnidadRegistro(int idUnidadRegistro) {
		this.idUnidadRegistro = idUnidadRegistro;
	}

	public int getIdUsuarioRegistro() {
		return this.idUsuarioRegistro;
	}

	public void setIdUsuarioRegistro(int idUsuarioRegistro) {
		this.idUsuarioRegistro = idUsuarioRegistro;
	}

	@Override
	public String toString() {
		return "DetalleHt [idDetalleHt=" + idDetalleHt + ", asunto=" + asunto + ", fechaRegistro=" + fechaRegistro
				+ ", idOficinaRegistro=" + idOficinaRegistro + ", idUnidadRegistro=" + idUnidadRegistro
				+ ", idUsuarioRegistro=" + idUsuarioRegistro + "]";
	}

}