
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.MesaDTO;
import pe.edu.pucp.softres.model.ReservaDTO;
import pe.edu.pucp.softres.parametros.MesaParametros;
import java.util.List;

/**
 *
 * @author frank
 */
public interface MesaDAO {
    int insertar(MesaDTO mesa);
    MesaDTO obtenerPorId(Integer idMesa);
    List<MesaDTO> listar(MesaParametros parametros);
    int modificar(MesaDTO mesa);
    int eliminar(Integer mesaId);
    List<MesaDTO> asignarMesas(ReservaDTO reserva);
}
