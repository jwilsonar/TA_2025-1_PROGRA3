package pe.edu.pucp.softres.bo;

import java.time.LocalDateTime;
import pe.edu.pucp.softres.dao.FilaEsperaDAO;
import pe.edu.pucp.softres.dao.daoImp.FilaEsperaDAOImpl;
import pe.edu.pucp.softres.model.FilaEsperaDTO;

import java.util.List;
import pe.edu.pucp.softres.parametros.FilaEsperaParametros;

public class FilaEsperaBO {

    private FilaEsperaDAO filaEsperaDAO;

    public FilaEsperaBO() {
        this.filaEsperaDAO = new FilaEsperaDAOImpl();
    }

    public Integer insertar(Integer idUsuario, Integer idReserva, Integer idEstadoFila, String usuarioCreacion) {
        FilaEsperaDTO fila = new FilaEsperaDTO();
        fila.setIdUsuario(idUsuario);
        fila.setIdReserva(idReserva);
//        fila.setEstado(new EstadoFilaEspera(idEstadoFila));
        fila.setFecha_creacion(LocalDateTime.now());
        fila.setUsuario_creacion(usuarioCreacion);
        fila.setFecha_modificacion(null);
        fila.setUsuario_modificacion(null);
        return this.filaEsperaDAO.insertar(fila);
    }

    public FilaEsperaDTO obtenerPorId(Integer filaId) {
        return this.filaEsperaDAO.obtenerPorId(filaId);
    }

    public List<FilaEsperaDTO> listar(FilaEsperaParametros parametros) {
        return this.filaEsperaDAO.listar(parametros);
    }

    public Integer modificar(Integer filaId, Integer idEstadoFila, String usuarioModificacion) {
        FilaEsperaDTO fila = new FilaEsperaDTO();
        fila.setIdFila(filaId);
//        fila.setEstado(new EstadoFilaEspera(idEstadoFila));
        fila.setFecha_modificacion(LocalDateTime.now());
        fila.setUsuario_modificacion(usuarioModificacion);
        return this.filaEsperaDAO.modificar(fila);
    }

    public Integer eliminar(Integer filaEsperaId) {
        return this.filaEsperaDAO.eliminar(filaEsperaId);
    }
}
