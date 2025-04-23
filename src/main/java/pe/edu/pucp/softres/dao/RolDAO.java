
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.RolDTO;
import java.util.List;

/**
 *
 * @author frank
 */
public interface RolDAO {
    int insertar(RolDTO rol);
    RolDTO obtenerPorId(Integer id);
    List<RolDTO> listar();
    int modificar(RolDTO rol);
    int eliminar(RolDTO rol);
}
