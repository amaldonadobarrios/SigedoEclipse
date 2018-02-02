package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.OficinaDAO;
import entity.Oficina;
import util.ConectaDB;

public class OficinaDAOImpl implements OficinaDAO {
	ConectaDB db = new ConectaDB();
	Connection cn = null;
	int i = 0;
	boolean rpta = false;
	@Override
	public boolean save(Oficina obj) throws SQLException, Exception {
		String query = "INSERT INTO oficina (descripcion,estado,usu_reg,fecha_reg) VALUES (?,?,?,sysdate())";
		cn = db.getConnection();
		if (cn != null) {
			try {
				PreparedStatement ps = cn.prepareStatement(query);
				ps.setString(1, obj.getDescripcion());
				ps.setInt(2, obj.getEstado());
				ps.setInt(3, obj.getUsuReg());
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
	public List<Oficina> listar() throws SQLException, Exception {
		List<Oficina> lista = null;

		String query = "SELECT * FROM oficina";
		cn = db.getConnection();
		if (cn != null) {
			try {
				PreparedStatement ps = cn.prepareStatement(query);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					lista = new ArrayList<>();
					Oficina temp;
					rs.beforeFirst();
					while (rs.next()) {
						temp = new Oficina();
						temp.setIdOficina(rs.getInt(1));
						temp.setDescripcion(rs.getString(2));
						temp.setEstado(rs.getInt(3));					
						temp.setUsuReg(rs.getInt(4));
						temp.setUsuMod(rs.getInt(5));
						temp.setFechaReg(rs.getString(6));
						temp.setFechaMod(rs.getString(7));
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
	public boolean update(Oficina obj) throws SQLException, Exception {
		Oficina objant=new Oficina();
		objant=getObjeto(obj.getIdOficina());
		if (obj.getDescripcion()==null) {
			obj.setDescripcion(objant.getDescripcion());
		}
		if (obj.getEstado()==0) {
			obj.setEstado(objant.getEstado());
		}
		if (obj.getUsuMod()==0) {
			obj.setUsuMod(objant.getUsuMod());
		}
		String query = "UPDATE oficina SET "
				+ " descripcion = ?,"
				+ " estado =?,"
				+ " usu_mod =?,"
				+ " fecha_mod= sysdate()"
				+ " WHERE "
				+ " id_oficina =?";
		cn = db.getConnection();
		if (cn != null) {
			try {
				PreparedStatement ps = cn.prepareStatement(query);
				ps.setString(1, obj.getDescripcion());
				ps.setInt(2, obj.getEstado());
				ps.setInt(3, obj.getUsuMod());
				ps.setInt(4, obj.getIdOficina());
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
	public Oficina getObjeto(int id) throws SQLException, Exception {
		Oficina temp=null;
		String query = "SELECT id_oficina," + 
				"descripcion," + 
				"estado," + 
				"usu_reg," + 
				"usu_mod," + 
				"fecha_reg," + 
				"fecha_mod FROM oficina where id_oficina=?";
		cn = db.getConnection();
		if (cn != null) {
			try {
				PreparedStatement ps = cn.prepareStatement(query);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					rs.beforeFirst();
					while (rs.next()) {
						temp = new Oficina();
						temp.setIdOficina(rs.getInt("id_oficina"));
						temp.setDescripcion(rs.getString("descripcion"));
						temp.setEstado(rs.getInt("estado"));
						temp.setUsuReg(rs.getInt("usu_reg"));
						temp.setUsuMod(rs.getInt("usu_mod"));
						temp.setFechaReg(rs.getString("fecha_reg"));
						temp.setFechaMod(rs.getString("fecha_mod"));	
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
