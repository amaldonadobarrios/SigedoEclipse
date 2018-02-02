package entity;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the usuario database table.
 * 
 */
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idUsuario;
	private int diasVigencia;
	private int estado;
	private Date fechaCaducidad;
	private Date fechaMod;
	private Date fechaReg;
	private int idPerfil;
	private int idPersona;
	private int idUsuarioCrea;
	private int idUsuarioMod;
	private String password;
	private String usuario;
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getDiasVigencia() {
		return diasVigencia;
	}
	public void setDiasVigencia(int diasVigencia) {
		this.diasVigencia = diasVigencia;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public Date getFechaMod() {
		return fechaMod;
	}
	public void setFechaMod(Date fechaMod) {
		this.fechaMod = fechaMod;
	}
	public Date getFechaReg() {
		return fechaReg;
	}
	public void setFechaReg(Date fechaReg) {
		this.fechaReg = fechaReg;
	}
	public int getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public int getIdUsuarioCrea() {
		return idUsuarioCrea;
	}
	public void setIdUsuarioCrea(int idUsuarioCrea) {
		this.idUsuarioCrea = idUsuarioCrea;
	}
	public int getIdUsuarioMod() {
		return idUsuarioMod;
	}
	public void setIdUsuarioMod(int idUsuarioMod) {
		this.idUsuarioMod = idUsuarioMod;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", diasVigencia=" + diasVigencia + ", estado=" + estado
				+ ", fechaCaducidad=" + fechaCaducidad + ", fechaMod=" + fechaMod + ", fechaReg=" + fechaReg
				+ ", idPerfil=" + idPerfil + ", idPersona=" + idPersona + ", idUsuarioCrea=" + idUsuarioCrea
				+ ", idUsuarioMod=" + idUsuarioMod + ", password=" + password + ", usuario=" + usuario + "]";
	}

	
}