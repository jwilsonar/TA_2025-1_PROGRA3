
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.SedeDTO;
import java.util.List;

/**
 *
 * @author frank
 */
public interface SedeDAO {
    int insertar(SedeDTO sede);
    SedeDTO obtenerPorId(Integer idSede);
    List<SedeDTO> listar(boolean estado);
    int modificar(SedeDTO sede);
    int eliminar(Integer sedeId);
}
