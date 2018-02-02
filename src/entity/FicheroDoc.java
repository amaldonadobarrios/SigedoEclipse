package entity;

import java.io.Serializable;
import java.util.Arrays;



/**
 * The persistent class for the fichero_doc database table.
 * 
 */
public class FicheroDoc implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idFicheroDoc;

	private byte[] blob;

	private int estado;

	private String nombre;

	private String size;

	private String tipo;

	public FicheroDoc() {
	}

	public int getIdFicheroDoc() {
		return this.idFicheroDoc;
	}

	public void setIdFicheroDoc(int idFicheroDoc) {
		this.idFicheroDoc = idFicheroDoc;
	}

	public byte[] getBlob() {
		return this.blob;
	}

	public void setBlob(byte[] blob) {
		this.blob = blob;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "FicheroDoc [idFicheroDoc=" + idFicheroDoc + ", blob=" + Arrays.toString(blob) + ", estado=" + estado
				+ ", nombre=" + nombre + ", size=" + size + ", tipo=" + tipo + "]";
	}

}