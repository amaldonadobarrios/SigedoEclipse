package entity;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the unidad database table.
 * 
 */
public class Unidad implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idUnidad;
	private String descripcion;
	private int estado;
	private Date fechaMod;
	private Date fechaReg;
	private int usuMod;
	private int usuReg;

	public Unidad() {
	}

	public int getIdUnidad() {
		return this.idUnidad;
	}

	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFechaMod() {
		return this.fechaMod;
	}

	public void setFechaMod(Date fechaMod) {
		this.fechaMod = fechaMod;
	}

	public Date getFechaReg() {
		return this.fechaReg;
	}

	public void setFechaReg(Date fechaReg) {
		this.fechaReg = fechaReg;
	}

	public int getUsuMod() {
		return this.usuMod;
	}

	public void setUsuMod(int usuMod) {
		this.usuMod = usuMod;
	}

	public int getUsuReg() {
		return this.usuReg;
	}

	public void setUsuReg(int usuReg) {
		this.usuReg = usuReg;
	}

	@Override
	public String toString() {
		return "Unidad [idUnidad=" + idUnidad + ", descripcion=" + descripcion + ", estado=" + estado + ", fechaMod="
				+ fechaMod + ", fechaReg=" + fechaReg + ", usuMod=" + usuMod + ", usuReg=" + usuReg + "]";
	}

}