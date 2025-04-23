package pe.edu.pucp.softres.bo;

import pe.edu.pucp.softres.dao.TipoMesaDAO;
import pe.edu.pucp.softres.dao.daoImp.TipoMesaDAOImpl;
import pe.edu.pucp.softres.model.TipoMesaDTO;

import java.util.List;

public class TipoMesaBO {

    private TipoMesaDAO tipoMesaDAO;

    public TipoMesaBO() {
        this.tipoMesaDAO = new TipoMesaDAOImpl();
    }

    public Integer insertar(String nombre) {
        TipoMesaDTO tipoMesa = new TipoMesaDTO();
        tipoMesa.setNombre(nombre);
        return this.tipoMesaDAO.insertar(tipoMesa);
    }

    public TipoMesaDTO obtenerPorId(Integer tipoMesaId) {
        return this.tipoMesaDAO.obtenerPorId(tipoMesaId);
    }

    public List<TipoMesaDTO> listar() {
        return this.tipoMesaDAO.listar();
    }

    public Integer modificar(TipoMesaDTO tipoMesa) {
        return this.tipoMesaDAO.modificar(tipoMesa);
    }

    public Integer eliminar(TipoMesaDTO tipoMesa) {
        return this.tipoMesaDAO.eliminar(tipoMesa);
    }
}