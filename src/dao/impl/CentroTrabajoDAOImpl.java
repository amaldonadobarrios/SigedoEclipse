package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.CentroTrabajoDAO;
import entity.CentroTrabajo;
import util.ConectaDB;

public class CentroTrabajoDAOImpl implements CentroTrabajoDAO {
	ConectaDB db = new ConectaDB();
	Connection cn = null;
	int i = 0;
	boolean rpta = false;

	@Override
	public boolean save(CentroTrabajo obj) throws Exception {
		String query = "INSERT INTO centro_trabajo (id_unidad,id_oficina,estado) VALUES (?,?,?)";
		cn = db.getConnection();
		if (cn != null) {
			try {
				PreparedStatement ps = cn.prepareStatement(query);
				ps.setInt(1, obj.getIdUnidad());
				ps.setInt(2, obj.getIdOficina());
				ps.setInt(3, obj.getEstado());
				i = ps.executeUpdate();

				if (i > 0) {
					cn.commit();
					rpta = true;
				} else {
					cn.rollback();
					rpta = false;
				}

			} catch (SQLException e) {

				throw new Exception("Problemas del sistema...");
			} finally {
				try {
					cn.close();
				} catch (SQLException ex) {

				}
			}
		}
		return rpta;
	}

	@Override
	public List<CentroTrabajo> listar() throws SQLException, Exception {
		List<CentroTrabajo> lista = null;

		String query = "SELECT * FROM centro_trabajo";
		cn = db.getConnection();
		if (cn != null) {
			try {
				PreparedStatement ps = cn.prepareStatement(query);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					lista = new ArrayList<>();
					CentroTrabajo temp;
					rs.beforeFirst();
					while (rs.next()) {
						temp = new CentroTrabajo();
						temp.setIdCentroTrabajo(rs.getInt(1));
						temp.setIdUnidad(rs.getInt(2));
						temp.setIdOficina(rs.getInt(3));
						temp.setEstado(rs.getInt(4));
						lista.add(temp);
					}
				}

			} catch (SQLException e) {

				throw new Exception("Problemas del sistema...");
			} finally {
				try {
					cn.close();
				} catch (SQLException ex) {

				}
			}
		}
		return lista;
	}

	@Override
	public boolean update(CentroTrabajo obj) throws SQLException, Exception {
		CentroTrabajo objant=new CentroTrabajo();
		objant=getObjeto(obj.getIdCentroTrabajo());
		if (obj.getIdUnidad()==0) {
			obj.setIdUnidad(objant.getIdUnidad());
		}
		if (obj.getIdOficina()==0) {
			obj.setIdOficina(objant.getIdOficina());
		}
		if (obj.getEstado()==0) {
			obj.setEstado(objant.getEstado());
		}
		String query = "UPDATE centro_trabajo SET "
				+ " id_unidad = ?,"
				+ " id_oficina =?,"
				+ " estado =? "
				+ " WHERE "
				+ " id_centro_trabajo =?";
		cn = db.getConnection();
		if (cn != null) {
			try {
				PreparedStatement ps = cn.prepareStatement(query);
				ps.setInt(1, obj.getIdUnidad());
				ps.setInt(2, obj.getIdOficina());
				ps.setInt(3, obj.getEstado());
				ps.setInt(4, obj.getIdCentroTrabajo());
				i = ps.executeUpdate();

				if (i > 0) {
					cn.commit();
					rpta = true;
				} else {
					cn.rollback();
					rpta = false;
				}

			} catch (SQLException e) {

				throw new Exception("Problemas del sistema...");
			} finally {
				try {
					cn.close();
				} catch (SQLException ex) {

				}
			}
		}
		return rpta;
	}

	@Override
	public CentroTrabajo getObjeto(int id) throws SQLException, Exception {
		CentroTrabajo temp=null;
		String query = "SELECT * FROM centro_trabajo where id_centro_trabajo =?";
		cn = db.getConnection();
		if (cn != null) {
			try {
				PreparedStatement ps = cn.prepareStatement(query);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					rs.beforeFirst();
					while (rs.next()) {
						temp = new CentroTrabajo();
						temp.setIdCentroTrabajo(rs.getInt(1));
						temp.setIdUnidad(rs.getInt(2));
						temp.setIdOficina(rs.getInt(3));
						temp.setEstado(rs.getInt(4));
					}
				}

			} catch (SQLException e) {

				throw new Exception("Problemas del sistema...");
			} finally {
				try {
					cn.close();
				} catch (SQLException ex) {

				}
			}
		}
		return temp;
	}

}
