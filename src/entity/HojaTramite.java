package entity;

import java.io.Serializable;



/**
 * The persistent class for the hoja_tramite database table.
 * 
 */

public class HojaTramite implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idHojaTramite;
	private int idDetalleHt;
	private int idEstadoHt;
	
	public HojaTramite() {
	}

	public int getIdHojaTramite() {
		return this.idHojaTramite;
	}

	public void setIdHojaTramite(int idHojaTramite) {
		this.idHojaTramite = idHojaTramite;
	}

	public int getIdDetalleHt() {
		return this.idDetalleHt;
	}

	public void setIdDetalleHt(int idDetalleHt) {
		this.idDetalleHt = idDetalleHt;
	}

	public int getIdEstadoHt() {
		return this.idEstadoHt;
	}

	public void setIdEstadoHt(int idEstadoHt) {
		this.idEstadoHt = idEstadoHt;
	}

}