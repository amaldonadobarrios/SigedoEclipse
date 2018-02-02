package entity;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the detalle_doc database table.
 * 
 */

public class DetalleDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idDetalleDoc;
	private Date fechaReg;
	private int idOficina;
	private int idUnidad;
	private int usuReg;

	public DetalleDoc() {
	}

	public int getIdDetalleDoc() {
		return this.idDetalleDoc;
	}

	public void setIdDetalleDoc(int idDetalleDoc) {
		this.idDetalleDoc = idDetalleDoc;
	}

	public Date getFechaReg() {
		return this.fechaReg;
	}

	public void setFechaReg(Date fechaReg) {
		this.fechaReg = fechaReg;
	}

	public int getIdOficina() {
		return this.idOficina;
	}

	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}

	public int getIdUnidad() {
		return this.idUnidad;
	}

	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}

	public int getUsuReg() {
		return this.usuReg;
	}

	public void setUsuReg(int usuReg) {
		this.usuReg = usuReg;
	}

}