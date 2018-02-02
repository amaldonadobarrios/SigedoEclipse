package dao;

import java.sql.SQLException;
import java.util.List;

import entity.CentroTrabajo;

public interface CentroTrabajoDAO {

	public boolean save(CentroTrabajo obj) throws SQLException, Exception;
	public List<CentroTrabajo> listar()throws SQLException, Exception;
	public boolean update(CentroTrabajo obj)throws SQLException, Exception;
	public CentroTrabajo getObjeto(int id)throws SQLException, Exception;
}
