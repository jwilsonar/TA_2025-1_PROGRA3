
package pe.edu.pucp.softres.dao.daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.softres.dao.SedeDAO;
import pe.edu.pucp.softres.model.SedeDTO;
import pe.edu.pucp.softres.db.DBManager;
/**
 *
 * @author frank
 */
public class SedeDAOImpl implements SedeDAO{
    
    private Connection conexion;
    private CallableStatement statement;
    private ResultSet resultSet;
    
    @Override
    public Integer insertar(SedeDTO sede) {
        Integer resultado = 0;
        this.conexion = DBManager.getInstance().getConnection();
        String sql = "INSERT INTO RES_SEDES(NOMBRE, DISTRITO, ESTADO, FECHA_CREACION, USUARIO_CREACION, FECHA_MODIFICACION, USUARIO_MODIFICACION) VALUES (?,?,?,?,?,?,?)";

        try {
            this.statement = this.conexion.prepareCall(sql);
            this.conexion.setAutoCommit(false);
            this.statement.setString(1, sede.getNombre());
            this.statement.setString(2, sede.getDistrito());
            this.statement.setBoolean(3, sede.getEstado());
            this.statement.setObject(4, sede.getFecha_creacion());
            this.statement.setString(5, sede.getUsuario_creacion());
            this.statement.setObject(6, sede.getFecha_modificacion());
            this.statement.setString(7, sede.getUsuario_modificacion());

            this.statement.executeUpdate();
            resultado = this.retornarUltimoAutoGenerado();
            this.conexion.commit();
        } catch (SQLException ex) {
            if (this.conexion != null) {
                try {
                    this.conexion.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(SedeDAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(SedeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.conexion != null) {
                try {
                    this.conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SedeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SedeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public SedeDTO obtenerPorId(Integer idSede) {
        return null;
    }

    @Override
    public List<SedeDTO> listar(boolean estado) {
        return null;
    }

    @Override
    public Integer modificar(SedeDTO sede) {
         return 0;
    }

    @Override
    public Integer eliminar(Integer sede) {
        return 0;
    }
    
}
