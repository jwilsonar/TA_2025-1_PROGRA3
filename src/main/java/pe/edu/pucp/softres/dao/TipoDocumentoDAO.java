
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.TipoDocumentoDTO;
import java.util.List;

/**
 *
 * @author frank
 */
public interface TipoDocumentoDAO {
    int insertar(TipoDocumentoDTO tipoDocumento);
    TipoDocumentoDTO obtenerPorId(Integer id);
    List<TipoDocumentoDTO> listar();
    int modificar(TipoDocumentoDTO tipoDocumento);
    int eliminar(TipoDocumentoDTO tipoDocumento);
}
