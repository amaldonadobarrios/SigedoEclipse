package entity;

import java.io.Serializable;


/**
 * The persistent class for the clas_contenido_doc database table.
 * 
 */

public class ClasContenidoDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idClasContenidoDoc;
	private String descripcion;

	public ClasContenidoDoc() {
	}

	public int getIdClasContenidoDoc() {
		return this.idClasContenidoDoc;
	}

	public void setIdClasContenidoDoc(int idClasContenidoDoc) {
		this.idClasContenidoDoc = idClasContenidoDoc;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}