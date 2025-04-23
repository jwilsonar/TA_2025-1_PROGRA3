
package pe.edu.pucp.softres.dao.daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.softres.dao.ReservaDAO;
import pe.edu.pucp.softres.model.ReservaDTO;
import pe.edu.pucp.softres.parametros.ReservaParametros;
import pe.edu.pucp.softres.db.DBManager;
/**
 *
 * @author frank
 */
public class ReservaDAOImpl implements ReservaDAO{
    
    private Connection conexion;
    private CallableStatement statement;
    private ResultSet resultSet;
    
    @Override
    public int insertar(ReservaDTO reserva) {
        Integer resultado = 0;
        this.conexion = DBManager.getInstance().getConnection();
        String sql = "INSERT INTO RES_RESERVAS(USUARIO_ID, LOCAL_ID, FECHA_HORA_REGISTRO, CANT_PERSONAS, TMESA_ID, NUM_MESAS, DURACION_ESTIMADA, OBSERVACIONES, MOTIVO_CANCELACION, CONFIRMACION_EMAIL, ESTADO, NOMBRE_EVENTO, DESCP_EVENTO, FECHA_CREACION, USUARIO_CREACION, FECHA_MODIFICACION, USUARIO_MODIFICACION) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            this.statement = this.conexion.prepareCall(sql);
            this.conexion.setAutoCommit(false);
//            this.statement.setInt(1, reserva.getUsuarioId());
//            this.statement.setInt(2, reserva.getLocalId());
//            this.statement.setTimestamp(3, reserva.getFechaHoraRegistro());
//            this.statement.setInt(4, reserva.getCantPersonas());
//            this.statement.setInt(5, reserva.getTmesaId());
//            this.statement.setInt(6, reserva.getNumMesas());
//            this.statement.setInt(7, reserva.getDuracionEstimada());
//            this.statement.setString(8, reserva.getObservaciones());
//            this.statement.setString(9, reserva.getMotivoCancelacion());
//            this.statement.setBoolean(10, reserva.isConfirmacionEmail());
//            this.statement.setString(11, reserva.getEstado()); // Asumiendo que es tipo ENUM
//            this.statement.setString(12, reserva.getNombreEvento());
//            this.statement.setString(13, reserva.getDescEvento());
//            this.statement.setTimestamp(14, reserva.getFechaCreacion());
//            this.statement.setString(15, reserva.getUsuarioCreacion());
//            this.statement.setTimestamp(16, reserva.getFechaModificacion());
//            this.statement.setString(17, reserva.getUsuarioModificacion());

            this.statement.executeUpdate();
            resultado = this.retornarUltimoAutoGenerado();
            this.conexion.commit();
        } catch (SQLException ex) {
            if (this.conexion != null) {
                try {
                    this.conexion.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.conexion != null) {
                try {
                    this.conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ReservaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public ReservaDTO obtenerPorId(Integer idReserva) {
        return null;
    }

    @Override
    public List<ReservaDTO> listar(ReservaParametros parametros) {
        return null;
    }

    @Override
    public int modificar(ReservaDTO reserva) {
        return 0;
    }

    @Override
    public int eliminar(Integer reserva, String motivo) {
        return 0;
    }

    @Override
    public int asignarMesas(ReservaDTO reserva) {
         return 0;
    }
    
}
