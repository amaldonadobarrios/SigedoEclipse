package dao;

import java.sql.SQLException;
import java.util.List;

import entity.Oficina;

public interface OficinaDAO {
public boolean save(Oficina obj)throws SQLException, Exception;
public List<Oficina> listar() throws SQLException, Exception;
public boolean update(Oficina obj)throws SQLException, Exception;
public Oficina getObjeto(int id)throws SQLException, Exception;
}
