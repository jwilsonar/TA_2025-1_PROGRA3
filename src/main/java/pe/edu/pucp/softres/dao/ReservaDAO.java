
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.ReservaDTO;
import pe.edu.pucp.softres.parametros.ReservaParametros;
import java.util.List;

/**
 *
 * @author frank
 */
public interface ReservaDAO {
    int insertar(ReservaDTO reserva);
    ReservaDTO obtenerPorId(Integer idReserva);
    List<ReservaDTO> listar(ReservaParametros parametros);
    int modificar(ReservaDTO reserva);
    int eliminar(Integer reservaId, String motivo);
    int asignarMesas(ReservaDTO reserva);
}
