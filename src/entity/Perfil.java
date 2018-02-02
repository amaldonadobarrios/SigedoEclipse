package entity;

import java.io.Serializable;



/**
 * The persistent class for the perfil database table.
 * 
 */

public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idPerfil;
	private String descripcion;

	public Perfil() {
	}

	public int getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Perfil [idPerfil=" + idPerfil + ", descripcion=" + descripcion + "]";
	}

}