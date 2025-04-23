package pe.edu.pucp.softres.bo;

import pe.edu.pucp.softres.dao.NotificacionDAO;
import pe.edu.pucp.softres.dao.daoImp.NotificacionDAOImpl;
import pe.edu.pucp.softres.model.NotificacionDTO;

import java.time.LocalDateTime;
import java.util.List;

public class NotificacionBO {

    private NotificacionDAO notificacionDAO;

    public NotificacionBO() {
        this.notificacionDAO = new NotificacionDAOImpl();
    }

    public Integer insertar(Integer idUsuario, String mensaje, String usuarioCreacion) {
        NotificacionDTO notificacion = new NotificacionDTO();
        notificacion.setIdUsuario(idUsuario);
        notificacion.setMensaje(mensaje);
        notificacion.setLeida(false); // Por defecto
        notificacion.setFecha_creacion(LocalDateTime.now());
        notificacion.setUsuario_creacion(usuarioCreacion);
        return this.notificacionDAO.insertar(notificacion);
    }

    public NotificacionDTO obtenerPorId(Integer notificacionId) {
        return this.notificacionDAO.obtenerPorId(notificacionId);
    }

    public List<NotificacionDTO> listar(Boolean leida) {
        return this.notificacionDAO.listar(leida);
    }

    public Integer modificar(Integer idNotificacion, String mensaje, Boolean leida) {
        NotificacionDTO notificacion = new NotificacionDTO();
        notificacion.setIdNotificacion(idNotificacion);
        notificacion.setMensaje(mensaje);
        notificacion.setLeida(leida);
        return this.notificacionDAO.modificar(notificacion);
    }

    public Integer eliminar(Integer notificacionId) {
        return this.notificacionDAO.eliminar(notificacionId);
    }
}