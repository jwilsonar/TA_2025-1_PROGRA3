
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.TipoMesaDTO;
import java.util.List;

/**
 *
 * @author frank
 */
public interface TipoMesaDAO {
    int insertar(TipoMesaDTO tipoMesa);
    TipoMesaDTO obtenerPorId(Integer id);
    List<TipoMesaDTO> listar();
    int modificar(TipoMesaDTO tipoMesa);
    int eliminar(TipoMesaDTO tipoMesa);
}
