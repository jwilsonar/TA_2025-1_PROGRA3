
package pe.edu.pucp.softres.dao.daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.softres.dao.HorarioAtencionDAO;
import pe.edu.pucp.softres.model.HorarioAtencionDTO;
import pe.edu.pucp.softres.parametros.HorarioDeAtencionParametros;
import pe.edu.pucp.softres.db.DBManager;
/**
 *
 * @author frank
 */
public class HorarioAtencionDAOImpl implements HorarioAtencionDAO{

    private Connection conexion;
    private CallableStatement statement;
    private ResultSet resultSet;
    
    @Override
    public int insertar(HorarioAtencionDTO horarioAtencion) {
        Integer resultado = 0;
        this.conexion = DBManager.getInstance().getConnection();
        String sql = "INSERT INTO RES_HORARIOS_ATENCION(DIA_SEMANA, HORA_INI, HORA_FIN, ES_FERIADO, ESTADO, FECHA_CREACION, USUARIO_CREACION, FECHA_MODIFICACION, USUARIO_MODIFICACION) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            this.statement = this.conexion.prepareCall(sql);
            this.conexion.setAutoCommit(false);
//            this.statement.setString(1, horarioAtencion.getDiaSemana());
//            this.statement.setTimestamp(2, horarioAtencion.getHoraIni());
//            this.statement.setTimestamp(3, horarioAtencion.getHoraFin());
//            this.statement.setBoolean(4, horarioAtencion.isEsFeriado());
//            this.statement.setBoolean(5, horarioAtencion.isEstado());
//            this.statement.setTimestamp(6, horarioAtencion.getFechaCreacion());
//            this.statement.setString(7, horarioAtencion.getUsuarioCreacion());
//            this.statement.setTimestamp(8, horarioAtencion.getFechaModificacion());
//            this.statement.setString(9, horarioAtencion.getUsuarioModificacion());

            this.statement.executeUpdate();
            resultado = this.retornarUltimoAutoGenerado();
            this.conexion.commit();
        } catch (SQLException ex) {
            if (this.conexion != null) {
                try {
                    this.conexion.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(HorarioAtencionDAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(HorarioAtencionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.conexion != null) {
                try {
                    this.conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HorarioAtencionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(HorarioAtencionDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public HorarioAtencionDTO obtenerPorId(Integer idHorario) {
        return null;
    }

    @Override
    public List<HorarioAtencionDTO> listar(HorarioDeAtencionParametros parametros) {
        return null;
    }

    @Override
    public int modificar(HorarioAtencionDTO horario) {
        return 0;
    }

    @Override
    public int eliminar(Integer horario) {
        return 0;
    }
    
}
