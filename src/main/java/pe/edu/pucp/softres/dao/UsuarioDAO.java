
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.UsuariosDTO;
import pe.edu.pucp.softres.parametros.UsuariosParametros;

import java.util.List;

/**
 *
 * @author frank
 */
public interface UsuarioDAO {
    int insertar(UsuariosDTO usuario);
    UsuariosDTO obtenerPorId(Integer idUsuario);
    List<UsuariosDTO> listar(UsuariosParametros parametros);
    int modificar(UsuariosDTO usuario);
    int eliminar(Integer usuarioId);
}
