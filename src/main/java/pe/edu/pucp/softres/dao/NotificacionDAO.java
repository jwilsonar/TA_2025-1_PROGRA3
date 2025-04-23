
package pe.edu.pucp.softres.dao;

import pe.edu.pucp.softres.model.NotificacionDTO;
import java.util.List;

/**
 *
 * @author frank
 */
public interface NotificacionDAO {
    int insertar(NotificacionDTO notificacion);
    NotificacionDTO obtenerPorId(Integer idNotificacion);
    List<NotificacionDTO> listar(boolean leido);
    int modificar(NotificacionDTO notificacion);
    int eliminar(Integer notificacion);
    void marcarLeida(Integer idNotificacion);
}
