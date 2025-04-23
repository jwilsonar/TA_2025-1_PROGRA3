
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.FilaEsperaDTO;
import pe.edu.pucp.softres.parametros.FilaEsperaParametros;
import java.util.List;

/**
 *
 * @author frank
 */
public interface FilaEsperaDAO {
    Integer insertar(FilaEsperaDTO filaEspera);
    FilaEsperaDTO obtenerPorId(Integer idFilaEspera);
    List<FilaEsperaDTO> listar(FilaEsperaParametros parametros);
    Integer modificar(FilaEsperaDTO filaEspera);
    Integer eliminar(Integer filaEsperaId);
}
