
package pe.edu.pucp.softres.dao.daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.softres.dao.NotificacionDAO;
import pe.edu.pucp.softres.model.NotificacionDTO;
import pe.edu.pucp.softres.db.DBManager;
/**
 *
 * @author frank
 */
public class NotificacionDAOImpl implements NotificacionDAO{
    
    private Connection conexion;
    private CallableStatement statement;
    private ResultSet resultSet;
    
    @Override
    public Integer insertar(NotificacionDTO notificacion) {
        Integer resultado = 0;
        this.conexion = DBManager.getInstance().getConnection();
        String sql = "INSERT INTO RES_NOTIFICACIONES(USUARIO_ID, MENSAJE, LEIDA, FECHA_CREACION, USUARIO_CREACION) VALUES (?,?,?,?,?)";
        try {
            this.statement = this.conexion.prepareCall(sql);
            this.conexion.setAutoCommit(false);
            this.statement.setInt(1, notificacion.getIdUsuario());
            this.statement.setString(2, notificacion.getMensaje());
            this.statement.setBoolean(3, notificacion.getLeida());
            this.statement.setObject(4, notificacion.getFecha_creacion());
            this.statement.setString(5, notificacion.getUsuario_creacion());

            this.statement.executeUpdate();
            resultado = this.retornarUltimoAutoGenerado();
            this.conexion.commit();
        } catch (SQLException ex) {
            if (this.conexion != null) {
                try {
                    this.conexion.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(NotificacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(NotificacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.conexion != null) {
                try {
                    this.conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NotificacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(NotificacionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public NotificacionDTO obtenerPorId(Integer idNotificacion) {
        return null;
    }

    @Override
    public List<NotificacionDTO> listar(boolean leido) {
        return null;
    }

    @Override
    public Integer modificar(NotificacionDTO notificacion) {
        return 0;
    }

    @Override
    public Integer eliminar(Integer notificacion) {
         return 0;
    }

    @Override
    public void marcarLeida(Integer idNotificacion) {
        //falta implementar
    }
    
}
