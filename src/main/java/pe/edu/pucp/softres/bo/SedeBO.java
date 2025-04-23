package pe.edu.pucp.softres.bo;

import pe.edu.pucp.softres.dao.SedeDAO;
import pe.edu.pucp.softres.dao.daoImp.SedeDAOImpl;
import pe.edu.pucp.softres.model.SedeDTO;

import java.util.List;

public class SedeBO {

    private SedeDAO sedeDAO;

    // Constructor
    public SedeBO() {
        this.sedeDAO = new SedeDAOImpl();
    }

    public Integer insertar(String nombre, String distrito) {
        SedeDTO sede = new SedeDTO();
        sede.setNombre(nombre);
        sede.setDistrito(distrito);
        sede.setEstado(true);  
        return this.sedeDAO.insertar(sede);
    }

    public SedeDTO obtenerPorId(Integer sedeId) {
        return this.sedeDAO.obtenerPorId(sedeId);
    }

    public List<SedeDTO> listar(Boolean estado) {
        return this.sedeDAO.listar(estado);
    }

    public Integer modificar(String nombre, String distrito) {
        SedeDTO sede = new SedeDTO();
        sede.setNombre(nombre);
        sede.setDistrito(distrito);
        sede.setEstado(true); 
        return this.sedeDAO.modificar(sede);
    }

    // Función para eliminar una sede
    public Integer eliminar(Integer sedeId) {
        return this.sedeDAO.eliminar(sedeId);
    }
}