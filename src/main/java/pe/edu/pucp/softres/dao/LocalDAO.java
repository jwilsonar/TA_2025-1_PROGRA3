
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.LocalDTO;
import pe.edu.pucp.softres.parametros.LocalParametros;
import java.util.List;

/**
 *
 * @author frank
 */
public interface LocalDAO {
    int insertar(LocalDTO local);
    LocalDTO obtenerPorId(Integer idLocal);
    List<LocalDTO> listar(LocalParametros parametros);
    int modificar(LocalDTO local);
    int eliminar(LocalDTO local);
}
