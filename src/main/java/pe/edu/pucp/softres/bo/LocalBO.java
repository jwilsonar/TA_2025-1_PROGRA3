package pe.edu.pucp.softres.bo;

import java.time.LocalDateTime;
import java.util.List;
import pe.edu.pucp.softres.dao.LocalDAO;
import pe.edu.pucp.softres.dao.daoImp.LocalDAOImpl;
import pe.edu.pucp.softres.model.LocalDTO;
import pe.edu.pucp.softres.parametros.LocalParametros;

public class LocalBO {

    private LocalDAO localDAO;

    public LocalBO() {
        this.localDAO = new LocalDAOImpl();
    }

    public Integer insertar(Integer idSede, String direccion, String nombre, Integer capacidadTotal, String telefono, String usuarioCreacion) {
        LocalDTO local = new LocalDTO();
        local.setIdSede(idSede);
        local.setDireccion(direccion);
        local.setNombre(nombre);
        local.setCapacidadTotal(capacidadTotal);
        local.setTelefono(telefono);
        local.setEstado(true); // Se activa por defecto
        local.setFecha_creacion(LocalDateTime.now());
        local.setUsuario_creacion(usuarioCreacion);
        return this.localDAO.insertar(local);
    }

    public LocalDTO obtenerPorId(Integer localId) {
        return this.localDAO.obtenerPorId(localId);
    }

    public List<LocalDTO> listar(LocalParametros parametros) {
        return this.localDAO.listar(parametros);
    }

    public Integer modificar(LocalDTO local) {
        local.setFecha_modificacion(LocalDateTime.now()); 
        return this.localDAO.modificar(local);
    }

    public Integer eliminar(LocalDTO local) {
        return this.localDAO.eliminar(local);
    }
}
