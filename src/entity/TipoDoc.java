package entity;

import java.io.Serializable;



/**
 * The persistent class for the tipo_doc database table.
 * 
 */

public class TipoDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idTipoDoc;
	private String descripcion;

	public TipoDoc() {
	}

	public int getIdTipoDoc() {
		return this.idTipoDoc;
	}

	public void setIdTipoDoc(int idTipoDoc) {
		this.idTipoDoc = idTipoDoc;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TipoDoc [idTipoDoc=" + idTipoDoc + ", descripcion=" + descripcion + "]";
	}

}