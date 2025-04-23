
package pe.edu.pucp.softres.dao.daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.softres.dao.TipoDocumentoDAO;
import pe.edu.pucp.softres.model.TipoDocumentoDTO;
import pe.edu.pucp.softres.db.DBManager;
/**
 *
 * @author frank
 */
public class TipoDocumentoDAOImpl implements TipoDocumentoDAO{
    
    private Connection conexion;
    private CallableStatement statement;
    private ResultSet resultSet;
    
    @Override
    public int insertar(TipoDocumentoDTO tipoDocumento) {
        Integer resultado = 0;
        this.conexion = DBManager.getInstance().getConnection();
        String sql = "INSERT INTO RES_TIPO_DOCUMENTOS(NOMBRE) VALUES (?)";

        try {
            this.statement = this.conexion.prepareCall(sql);
            this.conexion.setAutoCommit(false);
            this.statement.setString(1, tipoDocumento.getNombre());

            this.statement.executeUpdate();
            resultado = this.retornarUltimoAutoGenerado();
            this.conexion.commit();
        } catch (SQLException ex) {
            if (this.conexion != null) {
                try {
                    this.conexion.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(TipoDocumentoDAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(TipoDocumentoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.conexion != null) {
                try {
                    this.conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TipoDocumentoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(TipoDocumentoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public TipoDocumentoDTO obtenerPorId(Integer id) {
        return null;
    }

    @Override
    public List<TipoDocumentoDTO> listar() {
         return null;
    }

    @Override
    public int modificar(TipoDocumentoDTO tipoDocumento) {
        return 0;
    }

    @Override
    public int eliminar(TipoDocumentoDTO tipoDocumento) {
        return 0;
    }
    
}
