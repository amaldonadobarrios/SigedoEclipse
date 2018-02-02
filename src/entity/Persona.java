package entity;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the persona database table.
 * 
 */

public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idPersona;
	private String apeMat;
	private String apePat;
	private String celular;
	private String cip;
	private String dni;
	private int estado;
	private Date fechaMod;
	private Date fechaReg;
	private String grado;
	private int idCentroTrabajo;
	private String nombres;
	private int usuMod;
	private int usuReg;

	public Persona() {
	}

	public int getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getApeMat() {
		return this.apeMat;
	}

	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}

	public String getApePat() {
		return this.apePat;
	}

	public void setApePat(String apePat) {
		this.apePat = apePat;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCip() {
		return this.cip;
	}

	public void setCip(String cip) {
		this.cip = cip;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getGrado() {
		return this.grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public int getIdCentroTrabajo() {
		return this.idCentroTrabajo;
	}

	public void setIdCentroTrabajo(int idCentroTrabajo) {
		this.idCentroTrabajo = idCentroTrabajo;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
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
		return "Persona [idPersona=" + idPersona + ", apeMat=" + apeMat + ", apePat=" + apePat + ", celular=" + celular
				+ ", cip=" + cip + ", dni=" + dni + ", estado=" + estado + ", fechaMod=" + fechaMod + ", fechaReg="
				+ fechaReg + ", grado=" + grado + ", idCentroTrabajo=" + idCentroTrabajo + ", nombres=" + nombres
				+ ", usuMod=" + usuMod + ", usuReg=" + usuReg + "]";
	}

}