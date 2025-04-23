
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.NotificacionDTO;
import java.util.List;

/**
 *
 * @author frank
 */
public interface NotificacionDAO {
    Integer insertar(NotificacionDTO notificacion);
    NotificacionDTO obtenerPorId(Integer idNotificacion);
    List<NotificacionDTO> listar(boolean leido);
    Integer modificar(NotificacionDTO notificacion);
    Integer eliminar(Integer notificacion);
    void marcarLeida(Integer idNotificacion);
}
