package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.UnidadDAO;
import entity.Unidad;
import util.ConectaDB;

public class UnidadDAOImpl implements UnidadDAO {
	ConectaDB db = new ConectaDB();
	Connection cn = null;
	int i = 0;
	boolean rpta = false;
	@Override
	public boolean save(Unidad obj) throws SQLException, Exception {
		String query = "INSERT INTO unidad (descripcion, estado,usu_reg,fecha_reg) VALUES (?,?,?,sysdate())";
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
	public List<Unidad> listar() throws SQLException, Exception {
		List<Unidad> lista = null;

		String query = "SELECT * FROM Unidad";
		cn = db.getConnection();
		if (cn != null) {
			try {
				PreparedStatement ps = cn.prepareStatement(query);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					lista = new ArrayList<>();
					Unidad temp;
					rs.beforeFirst();
					while (rs.next()) {
						temp = new Unidad();
						temp.setIdUnidad(rs.getInt(1));
						temp.setDescripcion(rs.getString(2));
						temp.setEstado(rs.getInt(3));					
						temp.setUsuReg(rs.getInt(4));
						temp.setUsuMod(rs.getInt(5));
						temp.setFechaReg(rs.getDate(6));
						temp.setFechaMod(rs.getDate(7));
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
	public boolean update(Unidad obj) throws SQLException, Exception {
		Unidad objant=new Unidad();
		objant=getObjeto(obj.getIdUnidad());
		if (obj.getDescripcion()==null) {
			obj.setDescripcion(objant.getDescripcion());
		}
		if (obj.getEstado()==0) {
			obj.setEstado(objant.getEstado());
		}
		if (obj.getUsuMod()==0) {
			obj.setUsuMod(objant.getUsuMod());
		}
		String query = "UPDATE Unidad SET "
				+ " descripcion = ?,"
				+ " estado =?,"
				+ " usu_mod =?,"
				+ " fecha_mod= sysdate()"
				+ " WHERE "
				+ " id_Unidad =?";
		cn = db.getConnection();
		if (cn != null) {
			try {
				PreparedStatement ps = cn.prepareStatement(query);
				ps.setString(1, obj.getDescripcion());
				ps.setInt(2, obj.getEstado());
				ps.setInt(3, obj.getUsuMod());
				ps.setInt(4, obj.getIdUnidad());
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
	public Unidad getObjeto(int id) throws SQLException, Exception {
		Unidad temp=null;
		String query = "SELECT id_Unidad," + 
				"descripcion," + 
				"estado," + 
				"usu_reg," + 
				"usu_mod," + 
				"fecha_reg," + 
				"fecha_mod FROM Unidad where id_Unidad=?";
		cn = db.getConnection();
		if (cn != null) {
			try {
				PreparedStatement ps = cn.prepareStatement(query);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					rs.beforeFirst();
					while (rs.next()) {
						temp = new Unidad();
						temp.setIdUnidad(rs.getInt("id_Unidad"));
						temp.setDescripcion(rs.getString("descripcion"));
						temp.setEstado(rs.getInt("estado"));
						temp.setUsuReg(rs.getInt("usu_reg"));
						temp.setUsuMod(rs.getInt("usu_mod"));
						temp.setFechaReg(rs.getDate("fecha_reg"));
						temp.setFechaMod(rs.getDate("fecha_mod"));	
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
