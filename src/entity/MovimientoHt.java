package entity;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the movimiento_ht database table.
 * 
 */

public class MovimientoHt implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idMovimientoHt;
	private Date fechaRegistro;
	private int id_usuarioDestino;
	private int idDocumento;
	private int idEstadoMovimientoHt;
	private int idHojaTramite;
	private int idOficinaDestino;
	private int idOficinaRegistro;
	private int idUnidadDestino;
	private int idUnidadRegistro;
	private int idUsuarioRegistro;

	public MovimientoHt() {
	}

	public int getIdMovimientoHt() {
		return this.idMovimientoHt;
	}

	public void setIdMovimientoHt(int idMovimientoHt) {
		this.idMovimientoHt = idMovimientoHt;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public int getId_usuarioDestino() {
		return this.id_usuarioDestino;
	}

	public void setId_usuarioDestino(int id_usuarioDestino) {
		this.id_usuarioDestino = id_usuarioDestino;
	}

	public int getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

	public int getIdEstadoMovimientoHt() {
		return this.idEstadoMovimientoHt;
	}

	public void setIdEstadoMovimientoHt(int idEstadoMovimientoHt) {
		this.idEstadoMovimientoHt = idEstadoMovimientoHt;
	}

	public int getIdHojaTramite() {
		return this.idHojaTramite;
	}

	public void setIdHojaTramite(int idHojaTramite) {
		this.idHojaTramite = idHojaTramite;
	}

	public int getIdOficinaDestino() {
		return this.idOficinaDestino;
	}

	public void setIdOficinaDestino(int idOficinaDestino) {
		this.idOficinaDestino = idOficinaDestino;
	}

	public int getIdOficinaRegistro() {
		return this.idOficinaRegistro;
	}

	public void setIdOficinaRegistro(int idOficinaRegistro) {
		this.idOficinaRegistro = idOficinaRegistro;
	}

	public int getIdUnidadDestino() {
		return this.idUnidadDestino;
	}

	public void setIdUnidadDestino(int idUnidadDestino) {
		this.idUnidadDestino = idUnidadDestino;
	}

	public int getIdUnidadRegistro() {
		return this.idUnidadRegistro;
	}

	public void setIdUnidadRegistro(int idUnidadRegistro) {
		this.idUnidadRegistro = idUnidadRegistro;
	}

	public int getIdUsuarioRegistro() {
		return this.idUsuarioRegistro;
	}

	public void setIdUsuarioRegistro(int idUsuarioRegistro) {
		this.idUsuarioRegistro = idUsuarioRegistro;
	}

	@Override
	public String toString() {
		return "MovimientoHt [idMovimientoHt=" + idMovimientoHt + ", fechaRegistro=" + fechaRegistro
				+ ", id_usuarioDestino=" + id_usuarioDestino + ", idDocumento=" + idDocumento
				+ ", idEstadoMovimientoHt=" + idEstadoMovimientoHt + ", idHojaTramite=" + idHojaTramite
				+ ", idOficinaDestino=" + idOficinaDestino + ", idOficinaRegistro=" + idOficinaRegistro
				+ ", idUnidadDestino=" + idUnidadDestino + ", idUnidadRegistro=" + idUnidadRegistro
				+ ", idUsuarioRegistro=" + idUsuarioRegistro + "]";
	}

}