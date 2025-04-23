
package pe.edu.pucp.softres.dao.daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.softres.dao.ComentarioDAO;
import pe.edu.pucp.softres.model.ComentariosDTO;
import pe.edu.pucp.softres.parametros.ComentarioParametros;
import pe.edu.pucp.softres.db.DBManager;

/**
 *
 * @author frank
 */
public class ComentarioDAOImpl implements ComentarioDAO{
    
    private Connection conexion;
    private CallableStatement statement;
    private ResultSet resultSet;
    
    public ComentarioDAOImpl(){
        
    }
    
    @Override
    public Integer insertar(ComentariosDTO comentario) {
        Integer resultado = 0;
        this.conexion = DBManager.getInstance().getConnection();
        String sql = "INSERT INTO RES_COMENTARIOS(USUARIO_ID, RESERVA_ID, MENSAJE, PUNTUACION, ESTADO, FECHA_CREACION, USUARIO_CREACION, FECHA_MODIFICACION, USUARIO_MODIFICACION) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            this.statement = this.conexion.prepareCall(sql);
            this.conexion.setAutoCommit(false);
//            this.statement.setInt(1, comentario.getUsuarioId());
//            this.statement.setInt(2, comentario.getReservaId());
//            this.statement.setString(3, comentario.getMensaje());
//            this.statement.setInt(4, comentario.getPuntuacion());
//            this.statement.setBoolean(5, comentario.isEstado());
//            this.statement.setTimestamp(6, comentario.getFechaCreacion());
//            this.statement.setString(7, comentario.getUsuarioCreacion());
//            this.statement.setTimestamp(8, comentario.getFechaModificacion());
//            this.statement.setString(9, comentario.getUsuarioModificacion());

            this.statement.executeUpdate();
            resultado = this.retornarUltimoAutoGenerado();
            this.conexion.commit();
        } catch (SQLException ex) {
            if (this.conexion != null) {
                try {
                    this.conexion.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(ComentarioDAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(ComentarioDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.conexion != null) {
                try {
                    this.conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ComentarioDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ComentarioDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public ComentariosDTO obtenerPorId(Integer id) {
        return null;
    }

    @Override
    public List<ComentariosDTO> listar(ComentarioParametros parametros) {
        return null;
    }

    @Override
    public int modificar(ComentariosDTO comentario) {
        return 0;
    }

    @Override
    public int eliminar(Integer comentario) {
        return 0;
    }
    
}
