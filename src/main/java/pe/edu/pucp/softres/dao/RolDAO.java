
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.RolDTO;
import java.util.List;

/**
 *
 * @author frank
 */
public interface RolDAO {
    Integer insertar(RolDTO rol);
    RolDTO obtenerPorId(Integer id);
    List<RolDTO> listar();
    Integer modificar(RolDTO rol);
    Integer eliminar(RolDTO rol);
}
