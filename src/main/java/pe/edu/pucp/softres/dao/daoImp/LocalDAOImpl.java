
package pe.edu.pucp.softres.dao.daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.softres.dao.LocalDAO;
import pe.edu.pucp.softres.model.LocalDTO;
import pe.edu.pucp.softres.parametros.LocalParametros;
import pe.edu.pucp.softres.db.DBManager;
/**
 *
 * @author frank
 */
public class LocalDAOImpl implements LocalDAO{
    
    private Connection conexion;
    private CallableStatement statement;
    private ResultSet resultSet;
    
    @Override
    public Integer insertar(LocalDTO local) {
        Integer resultado = 0;
        this.conexion = DBManager.getInstance().getConnection();
        String sql = "INSERT INTO RES_LOCALES(SEDE_ID, NOMBRE, DIRECCION, CAPACIDAD_TOTAL, TELEFONO, ESTADO, FECHA_CREACION, USUARIO_CREACION, FECHA_MODIFICACION, USUARIO_MODIFICACION) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            this.statement = this.conexion.prepareCall(sql);
            this.conexion.setAutoCommit(false);
            this.statement.setInt(1, local.getIdSede());
            this.statement.setString(2, local.getNombre());
            this.statement.setString(3, local.getDireccion());
            this.statement.setInt(4, local.getCapacidadTotal());
            this.statement.setString(5, local.getTelefono());
            this.statement.setBoolean(6, local.getEstado());
            this.statement.setObject(7, local.getFecha_creacion());
            this.statement.setString(8, local.getUsuario_creacion());
            this.statement.setObject(9, local.getFecha_modificacion());
            this.statement.setString(10, local.getUsuario_modificacion());

            this.statement.executeUpdate();
            resultado = this.retornarUltimoAutoGenerado();
            this.conexion.commit();
        } catch (SQLException ex) {
            if (this.conexion != null) {
                try {
                    this.conexion.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(LocalDAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(LocalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.conexion != null) {
                try {
                    this.conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LocalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return resultado;
    }
    private Integer retornarUltimoAutoGenerado() {
        Integer resultado = null;
        String sql = "select @@last_insert_id as id";
        try {
            this.statement = this.conexion.prepareCall(sql);
            this.resultSet = this.statement.executeQuery();
            if (this.resultSet.next())
                resultado = this.resultSet.getInt("id");
        } catch (SQLException ex) {
            Logger.getLogger(LocalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public LocalDTO obtenerPorId(Integer idLocal) {
        return null;
    }

    @Override
    public List<LocalDTO> listar(LocalParametros parametros) {
        return null;
    }

    @Override
    public Integer modificar(LocalDTO local) {
        return 0;
    }

    @Override
    public Integer eliminar(LocalDTO local) {
        return 0;
    }
    
}
