
package pe.edu.pucp.softres.dao.daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.softres.dao.MesaDAO;
import pe.edu.pucp.softres.model.MesaDTO;
import pe.edu.pucp.softres.model.ReservaDTO;
import pe.edu.pucp.softres.parametros.MesaParametros;
import pe.edu.pucp.softres.db.DBManager;
/**
 *
 * @author frank
 */
public class MesaDAOImpl implements MesaDAO{
    
    private Connection conexion;
    private CallableStatement statement;
    private ResultSet resultSet;
    
    @Override
    public int insertar(MesaDTO mesa) {
        Integer resultado = 0;
        this.conexion = DBManager.getInstance().getConnection();
        String sql = "INSERT INTO RES_MESAS(LOCAL_ID, TMESA_ID, NUMEROMESA, CAPACIDAD, ESTADO, X, Y, FECHA_CREACION, USUARIO_CREACION, FECHA_MODIFICACION, USUARIO_MODIFICACION) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            this.statement = this.conexion.prepareCall(sql);
            this.conexion.setAutoCommit(false);
//            this.statement.setInt(1, mesa.getLocalId());
//            this.statement.setInt(2, mesa.getTmesaId());
//            this.statement.setString(3, mesa.getNumeroMesa());
//            this.statement.setInt(4, mesa.getCapacidad());
//            this.statement.setString(5, mesa.getEstado()); // 'DISPONIBLE', 'RESERVADA', etc.
//            this.statement.setInt(6, mesa.getX());
//            this.statement.setInt(7, mesa.getY());
//            this.statement.setTimestamp(8, mesa.getFechaCreacion());
//            this.statement.setString(9, mesa.getUsuarioCreacion());
//            this.statement.setTimestamp(10, mesa.getFechaModificacion());
//            this.statement.setString(11, mesa.getUsuarioModificacion());

            this.statement.executeUpdate();
            resultado = this.retornarUltimoAutoGenerado();
            this.conexion.commit();
        } catch (SQLException ex) {
            if (this.conexion != null) {
                try {
                    this.conexion.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(MesaDAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(MesaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.conexion != null) {
                try {
                    this.conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MesaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(MesaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public MesaDTO obtenerPorId(Integer idMesa) {
        return null;
    }

    @Override
    public List<MesaDTO> listar(MesaParametros parametros) {
        return null;
    }

    @Override
    public int modificar(MesaDTO mesa) {
         return 0;
    }

    @Override
    public int eliminar(Integer mesa) {
        return 0;
    }

    @Override
    public List<MesaDTO> asignarMesas(ReservaDTO reserva) {
        return null;
    }
    
}
