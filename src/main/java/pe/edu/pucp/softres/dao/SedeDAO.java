
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.SedeDTO;
import java.util.List;

/**
 *
 * @author frank
 */
public interface SedeDAO {
    Integer insertar(SedeDTO sede);
    SedeDTO obtenerPorId(Integer idSede);
    List<SedeDTO> listar(boolean estado);
    Integer modificar(SedeDTO sede);
    Integer eliminar(Integer sedeId);
}
