package entity;

import java.io.Serializable;



/**
 * The persistent class for the estado_doc database table.
 * 
 */

public class EstadoDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idEstadoDoc;
	private String descripcion;

	public int getIdEstadoDoc() {
		return idEstadoDoc;
	}

	public void setIdEstadoDoc(int idEstadoDoc) {
		this.idEstadoDoc = idEstadoDoc;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "EstadoDoc [idEstadoDoc=" + idEstadoDoc + ", descripcion=" + descripcion + "]";
	}

	

}