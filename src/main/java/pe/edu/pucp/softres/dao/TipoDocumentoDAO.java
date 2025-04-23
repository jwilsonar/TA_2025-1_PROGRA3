
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.TipoDocumentoDTO;
import java.util.List;

/**
 *
 * @author frank
 */
public interface TipoDocumentoDAO {
    Integer insertar(TipoDocumentoDTO tipoDocumento);
    TipoDocumentoDTO obtenerPorId(Integer id);
    List<TipoDocumentoDTO> listar();
    Integer modificar(TipoDocumentoDTO tipoDocumento);
    Integer eliminar(TipoDocumentoDTO tipoDocumento);
}
