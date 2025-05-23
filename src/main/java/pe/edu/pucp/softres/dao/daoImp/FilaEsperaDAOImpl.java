
package pe.edu.pucp.softres.dao.daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.softres.dao.FilaEsperaDAO;
import pe.edu.pucp.softres.model.FilaEsperaDTO;
import pe.edu.pucp.softres.parametros.FilaEsperaParametros;
import pe.edu.pucp.softres.db.DBManager;
/**
 *
 * @author frank
 */
public class FilaEsperaDAOImpl implements FilaEsperaDAO{

    private Connection conexion;
    private CallableStatement statement;
    private ResultSet resultSet;
    
    @Override
    public Integer insertar(FilaEsperaDTO filaEspera) {
        Integer resultado = 0;
        this.conexion = DBManager.getInstance().getConnection();
        String sql = "INSERT INTO RES_FILAESPERA(USUARIO_ID, RESERVA_ID, ESTADO, FECHA_CREACION, USUARIO_CREACION, FECHA_MODIFICACION, USUARIO_MODIFICACION) VALUES (?,?,?,?,?,?,?)";
        try {
            this.statement = this.conexion.prepareCall(sql);
            this.conexion.setAutoCommit(false);
            this.statement.setInt(1, filaEspera.getIdUsuario());
            this.statement.setInt(2, filaEspera.getIdReserva());
            this.statement.setString(3, filaEspera.getEstado().name());
            this.statement.setObject(4, filaEspera.getFecha_creacion());
            this.statement.setString(5, filaEspera.getUsuario_creacion());
            this.statement.setObject(6, filaEspera.getFecha_modificacion());
            this.statement.setString(7, filaEspera.getUsuario_modificacion());

            this.statement.executeUpdate();
            resultado = this.retornarUltimoAutoGenerado();
            this.conexion.commit();
        } catch (SQLException ex) {
            if (this.conexion != null) {
                try {
                    this.conexion.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(FilaEsperaDAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(FilaEsperaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.conexion != null) {
                try {
                    this.conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(FilaEsperaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(FilaEsperaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public FilaEsperaDTO obtenerPorId(Integer idFilaEspera) {
        return null;
    }

    @Override
    public List<FilaEsperaDTO> listar(FilaEsperaParametros parametros) {
        return null;
    }

    @Override
    public Integer modificar(FilaEsperaDTO filaEspera) {
        return 0;
    }

    @Override
    public Integer eliminar(Integer filaEspera) {
        return 0;
    }
    
}
