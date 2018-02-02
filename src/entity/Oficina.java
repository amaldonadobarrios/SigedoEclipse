package entity;

import java.io.Serializable;


/**
 * The persistent class for the oficina database table.
 * 
 */

public class Oficina implements Serializable {
	private static final long serialVersionUID = 1L;


	private int idOficina;
	private String descripcion;
	private int estado;
	private String fechaMod;
	private String fechaReg;
	private int usuMod;
	private int usuReg;

	public Oficina() {
	}

	public int getIdOficina() {
		return this.idOficina;
	}

	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
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

	public String getFechaMod() {
		return this.fechaMod;
	}

	public void setFechaMod(String string) {
		this.fechaMod = string;
	}

	public String getFechaReg() {
		return this.fechaReg;
	}

	public void setFechaReg(String string) {
		this.fechaReg = string;
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
		return "Oficina [idOficina=" + idOficina + ", descripcion=" + descripcion + ", estado=" + estado + ", fechaMod="
				+ fechaMod + ", fechaReg=" + fechaReg + ", usuMod=" + usuMod + ", usuReg=" + usuReg + "]";
	}

}