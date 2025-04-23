
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.UsuariosDTO;
import pe.edu.pucp.softres.parametros.UsuariosParametros;

import java.util.List;

/**
 *
 * @author frank
 */
public interface UsuarioDAO {
    Integer insertar(UsuariosDTO usuario);
    UsuariosDTO obtenerPorId(Integer idUsuario);
    List<UsuariosDTO> listar(UsuariosParametros parametros);
    Integer modificar(UsuariosDTO usuario);
    Integer eliminar(Integer usuarioId);
}
