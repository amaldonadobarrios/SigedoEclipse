package entity;

import java.io.Serializable;


/**
 * The persistent class for the prioridad_doc database table.
 * 
 */

public class PrioridadDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idPrioridadDoc;
	private String descrpcion;

	public PrioridadDoc() {
	}

	public int getIdPrioridadDoc() {
		return this.idPrioridadDoc;
	}

	public void setIdPrioridadDoc(int idPrioridadDoc) {
		this.idPrioridadDoc = idPrioridadDoc;
	}

	public String getDescrpcion() {
		return this.descrpcion;
	}

	public void setDescrpcion(String descrpcion) {
		this.descrpcion = descrpcion;
	}

	@Override
	public String toString() {
		return "PrioridadDoc [idPrioridadDoc=" + idPrioridadDoc + ", descrpcion=" + descrpcion + "]";
	}

}