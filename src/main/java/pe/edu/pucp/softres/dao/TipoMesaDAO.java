
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.TipoMesaDTO;
import java.util.List;

/**
 *
 * @author frank
 */
public interface TipoMesaDAO {
    Integer insertar(TipoMesaDTO tipoMesa);
    TipoMesaDTO obtenerPorId(Integer id);
    List<TipoMesaDTO> listar();
    Integer modificar(TipoMesaDTO tipoMesa);
    Integer eliminar(TipoMesaDTO tipoMesa);
}
