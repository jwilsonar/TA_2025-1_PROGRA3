package pe.edu.pucp.softres.bo;

import java.util.List;
import pe.edu.pucp.softres.dao.RolDAO;
import pe.edu.pucp.softres.dao.daoImp.RolDAOImpl;
import pe.edu.pucp.softres.model.RolDTO;

public class RolBO {

    private RolDAO rolDAO;

    public RolBO() {
        this.rolDAO = new RolDAOImpl();
    }

    public Integer insertar(String nombre) {
        RolDTO rol = new RolDTO();
        rol.setNombre(nombre);
        return this.rolDAO.insertar(rol);
    }

    public RolDTO obtenerPorId(Integer rolId) {
        return this.rolDAO.obtenerPorId(rolId);
    }

    public List<RolDTO> listar() {
        return this.rolDAO.listar();
    }

    public Integer modificar(RolDTO rol) {
        return this.rolDAO.modificar(rol);
    }

    public Integer eliminar(RolDTO rol) {
        return this.rolDAO.eliminar(rol);
    }
}