package dao;

import java.sql.SQLException;
import java.util.List;

import entity.Unidad;
public interface UnidadDAO {
	public boolean save(Unidad obj)throws SQLException, Exception;
	public List<Unidad> listar() throws SQLException, Exception;
	public boolean update(Unidad obj)throws SQLException, Exception;
	public Unidad getObjeto(int id)throws SQLException, Exception;
}
