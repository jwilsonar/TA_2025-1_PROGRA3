
package pe.edu.pucp.softres.dao.daoImp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.softres.dao.UsuarioDAO;
import pe.edu.pucp.softres.model.UsuariosDTO;
import pe.edu.pucp.softres.parametros.UsuariosParametros;
import pe.edu.pucp.softres.db.DBManager;
/**
 *
 * @author frank
 */
public class UsuarioDAOImpl implements UsuarioDAO{
    
    private Connection conexion;
    private CallableStatement statement;
    private ResultSet resultSet;
    
    @Override
    public int insertar(UsuariosDTO usuario) {
        Integer resultado = 0;
        this.conexion = DBManager.getInstance().getConnection();
        String sql = "INSERT INTO RES_USUARIOS(ROL_ID, NOMBRECOMP, TIPO_DOC_ID, NUMERO_DOC, CONTRASENA, EMAIL, TELEFONO, SUELDO, FECHA_CONTRATACION, CANT_RESERVAS, ESTADO, FECHA_CREACION, USUARIO_CREACION, FECHA_MODIFICACION, USUARIO_MODIFICACION) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            this.statement = this.conexion.prepareCall(sql);
            this.conexion.setAutoCommit(false);
//            this.statement.setInt(1, usuario.getRolId());
//            this.statement.setString(2, usuario.getNombreComp());
//            this.statement.setInt(3, usuario.getTipoDocId());
//            this.statement.setString(4, usuario.getNumeroDoc());
//            this.statement.setString(5, usuario.getContrasena());
//            this.statement.setString(6, usuario.getEmail());
//            this.statement.setString(7, usuario.getTelefono());
//            this.statement.setBigDecimal(8, usuario.getSueldo()); // o setDouble si lo manejas así
//            this.statement.setTimestamp(9, usuario.getFechaContratacion());
//            this.statement.setInt(10, usuario.getCantReservas());
//            this.statement.setBoolean(11, usuario.isEstado());
//            this.statement.setTimestamp(12, usuario.getFechaCreacion());
//            this.statement.setString(13, usuario.getUsuarioCreacion());
//            this.statement.setTimestamp(14, usuario.getFechaModificacion());
//            this.statement.setString(15, usuario.getUsuarioModificacion());

            this.statement.executeUpdate();
            resultado = this.retornarUltimoAutoGenerado();
            this.conexion.commit();
        } catch (SQLException ex) {
            if (this.conexion != null) {
                try {
                    this.conexion.rollback();
                } catch (SQLException ex1) {
                    Logger.getLogger(UsuarioDAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            Logger.getLogger(UsuarioDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.conexion != null) {
                try {
                    this.conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UsuarioDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(UsuarioDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public UsuariosDTO obtenerPorId(Integer idUsuario) {
        return null;
    }

    @Override
    public List<UsuariosDTO> listar(UsuariosParametros parametros) {
        return null;
    }

    @Override
    public int modificar(UsuariosDTO usuario) {
         return 0;
    }

    @Override
    public int eliminar(Integer usuario) {
        return 0;
    }
    
}
