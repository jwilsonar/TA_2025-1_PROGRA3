package pe.edu.pucp.softres.bo;

import pe.edu.pucp.softres.dao.TipoDocumentoDAO;
import pe.edu.pucp.softres.dao.daoImp.TipoDocumentoDAOImpl;
import pe.edu.pucp.softres.model.TipoDocumentoDTO;

import java.util.List;

public class TipoDocumentoBO {

    private TipoDocumentoDAO tipoDocumentoDAO;

    public TipoDocumentoBO() {
        this.tipoDocumentoDAO = new TipoDocumentoDAOImpl();
    }

    public Integer insertar(String nombre) {
        TipoDocumentoDTO tipoDocumento = new TipoDocumentoDTO();
        tipoDocumento.setNombre(nombre);
        return this.tipoDocumentoDAO.insertar(tipoDocumento);
    }

    public TipoDocumentoDTO obtenerPorId(Integer tDocId) {
        return this.tipoDocumentoDAO.obtenerPorId(tDocId);
    }

    public List<TipoDocumentoDTO> listar() {
        return this.tipoDocumentoDAO.listar();
    }

    public Integer modificar(TipoDocumentoDTO tDoc) {
        return this.tipoDocumentoDAO.modificar(tDoc);
    }

    public Integer eliminar(TipoDocumentoDTO tDoc) {
        return this.tipoDocumentoDAO.eliminar(tDoc);
    }
}