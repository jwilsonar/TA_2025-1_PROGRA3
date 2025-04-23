package pe.edu.pucp.softres.bo;

import java.time.LocalDateTime;
import java.util.List;
import pe.edu.pucp.softres.dao.MesaDAO;
import pe.edu.pucp.softres.dao.daoImp.MesaDAOImpl;
import pe.edu.pucp.softres.model.EstadoMesa;
import pe.edu.pucp.softres.model.MesaDTO;
import pe.edu.pucp.softres.parametros.MesaParametros;

public class MesaBO {

    private MesaDAO mesaDAO;

    public MesaBO() {
        this.mesaDAO = new MesaDAOImpl();
    }

    public Integer insertar(Integer idLocal, Integer idTipoMesa, String numeroMesa, Integer capacidad, EstadoMesa estado,
                            Integer x, Integer y, String usuarioCreacion) {
        MesaDTO mesa = new MesaDTO();
        mesa.setIdLocal(idLocal);
        mesa.setIdTipoMesa(idTipoMesa);
        mesa.setNumeroMesa(numeroMesa);
        mesa.setCapacidad(capacidad);
        mesa.setEstado(estado);
        mesa.setX(x);
        mesa.setY(y);
        mesa.setFecha_creacion(LocalDateTime.now());
        mesa.setUsuario_creacion(usuarioCreacion);
        return this.mesaDAO.insertar(mesa);
    }

    public MesaDTO obtenerPorId(Integer mesaId) {
        return this.mesaDAO.obtenerPorId(mesaId);
    }

    public List<MesaDTO> listar(MesaParametros parametros) {
        return this.mesaDAO.listar(parametros);
    }

    public Integer modificar(Integer idMesa, Integer idLocal, Integer idTipoMesa, String numeroMesa, Integer capacidad,
                             EstadoMesa estado, Integer x, Integer y, String usuarioModificacion) {
        MesaDTO mesa = new MesaDTO();
        mesa.setIdMesa(idMesa);
        mesa.setIdLocal(idLocal);
        mesa.setIdTipoMesa(idTipoMesa);
        mesa.setNumeroMesa(numeroMesa);
        mesa.setCapacidad(capacidad);
        mesa.setEstado(estado);
        mesa.setX(x);
        mesa.setY(y);
        mesa.setFecha_modificacion(LocalDateTime.now());
        mesa.setUsuario_modificacion(usuarioModificacion);
        return this.mesaDAO.modificar(mesa);
    }

    public Integer eliminar(Integer mesaId) {
        return this.mesaDAO.eliminar(mesaId);
    }
}
