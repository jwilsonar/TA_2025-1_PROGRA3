
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.HorarioAtencionDTO;
import pe.edu.pucp.softres.parametros.HorarioDeAtencionParametros;
import java.util.List;

/**
 *
 * @author frank
 */
public interface HorarioAtencionDAO {
    int insertar(HorarioAtencionDTO horario);
    HorarioAtencionDTO obtenerPorId(Integer idHorario);
    List<HorarioAtencionDTO> listar(HorarioDeAtencionParametros parametros);
    int modificar(HorarioAtencionDTO horario);
    int eliminar(Integer horarioId);
}
