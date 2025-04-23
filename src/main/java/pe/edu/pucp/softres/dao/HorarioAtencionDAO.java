
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.HorarioAtencionDTO;
import pe.edu.pucp.softres.parametros.HorarioDeAtencionParametros;
import java.util.List;

/**
 *
 * @author frank
 */
public interface HorarioAtencionDAO {
    Integer insertar(HorarioAtencionDTO horario);
    HorarioAtencionDTO obtenerPorId(Integer idHorario);
    List<HorarioAtencionDTO> listar(HorarioDeAtencionParametros parametros);
    Integer modificar(HorarioAtencionDTO horario);
    Integer eliminar(Integer horarioId);
}
