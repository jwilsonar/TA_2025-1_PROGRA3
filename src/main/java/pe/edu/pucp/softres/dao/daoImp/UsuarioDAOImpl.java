
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
    public Integer insertar(UsuariosDTO usuario) {
        Integer resultado = 0;
        this.conexion = DBManager.getInstance().getConnection();
        String sql = "INSERT INTO RES_USUARIOS(ROL_ID, NOMBRECOMP, TIPO_DOC_ID, NUMERO_DOC, CONTRASENA, EMAIL, TELEFONO, SUELDO, FECHA_CONTRATACION, CANT_RESERVAS, ESTADO, FECHA_CREACION, USUARIO_CREACION, FECHA_MODIFICACION, USUARIO_MODIFICACION) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            this.statement = this.conexion.prepareCall(sql);
            this.conexion.setAutoCommit(false);
            this.statement.setInt(1, usuario.getIdRol());
            this.statement.setString(2, usuario.getNombreComp());
            this.statement.setInt(3, usuario.getIdTipoDoc());
            this.statement.setString(4, usuario.getNumeroDocumento());
            this.statement.setString(5, usuario.getContrasenha());
            this.statement.setString(6, usuario.getEmail());
            this.statement.setString(7, usuario.getTelefono());
            this.statement.setDouble(8, usuario.getSueldo());
            this.statement.setObject(9, usuario.getFechaContratacion());
            this.statement.setInt(10, usuario.getCantidadReservacion());
            this.statement.setBoolean(11, usuario.getEstado());
            this.statement.setObject(12, usuario.getFecha_creacion());
            this.statement.setString(13, usuario.getUsuario_creacion());
            this.statement.setObject(14, usuario.getFecha_modificacion());
            this.statement.setString(15, usuario.getUsuario_modificacion());

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
    public Integer modificar(UsuariosDTO usuario) {
         return 0;
    }

    @Override
    public Integer eliminar(Integer usuario) {
        return 0;
    }
    
}
