package pe.edu.pucp.softres.bo;

import pe.edu.pucp.softres.dao.ComentarioDAO;
import pe.edu.pucp.softres.dao.daoImp.ComentarioDAOImpl;
import pe.edu.pucp.softres.model.ComentariosDTO;
import pe.edu.pucp.softres.parametros.ComentarioParametros;

import java.util.List;

public class ComentarioBO {

    private ComentarioDAO comentarioDAO;

    public ComentarioBO() {
        this.comentarioDAO = new ComentarioDAOImpl();
    }

    public Integer insertar(Integer idUsuario, Integer idReserva, String mensaje, Integer puntuacion, String usuarioCreacion) {
        ComentariosDTO comentario = new ComentariosDTO();
        //comentario.setIdUsuario(idUsuario);
        //comentario.setIdReserva(idReserva);
        comentario.setMensaje(mensaje);
        comentario.setPuntuacion(puntuacion);
        comentario.setEstado(true);
        //comentario.setFecha_creacion(LocalDateTime.now());
        //comentario.setUsuario_creacion(usuarioCreacion);
        return this.comentarioDAO.insertar(comentario);
    }

    public ComentariosDTO obtenerPorId(Integer comentarioId) {
        return this.comentarioDAO.obtenerPorId(comentarioId);
    }

    public List<ComentariosDTO> listar(ComentarioParametros parametros) {
        return this.comentarioDAO.listar(parametros);
    }

    public Integer modificar(Integer idComentario, String mensaje, Integer puntuacion, String usuarioModificacion) {
        ComentariosDTO comentario = new ComentariosDTO();
        comentario.setIdComentario(idComentario);
        comentario.setMensaje(mensaje);
        comentario.setPuntuacion(puntuacion);
        //comentario.setFecha_modificacion(LocalDateTime.now());
        //comentario.setUsuario_modificacion(usuarioModificacion);
        return this.comentarioDAO.modificar(comentario);
    }

    public Integer eliminar(Integer comentarioId) {
        return this.comentarioDAO.eliminar(comentarioId);
    }
}
