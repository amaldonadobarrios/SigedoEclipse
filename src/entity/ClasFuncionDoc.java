package entity;

import java.io.Serializable;


/**
 * The persistent class for the clas_funcion_doc database table.
 * 
 */

public class ClasFuncionDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int idClasFuncionDoc;
	private String descripcion;

	public ClasFuncionDoc() {
	}

	public int getIdClasFuncionDoc() {
		return this.idClasFuncionDoc;
	}

	public void setIdClasFuncionDoc(int idClasFuncionDoc) {
		this.idClasFuncionDoc = idClasFuncionDoc;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}