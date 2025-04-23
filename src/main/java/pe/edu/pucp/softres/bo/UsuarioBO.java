package pe.edu.pucp.softres.bo;

import pe.edu.pucp.softres.dao.UsuarioDAO;
import pe.edu.pucp.softres.dao.daoImp.UsuarioDAOImpl;
import pe.edu.pucp.softres.model.UsuariosDTO;
import pe.edu.pucp.softres.parametros.UsuariosParametros;

import java.time.LocalDateTime;
import java.util.List;

public class UsuarioBO {

    private UsuarioDAO usuarioDAO;

    public UsuarioBO() {
        this.usuarioDAO = new UsuarioDAOImpl();
    }

    public Integer insertar(Integer idRol, String nombreComp, Integer idTipoDoc, String numeroDocumento, String contrasenha, String email,
                            String telefono, Double sueldo, LocalDateTime fechaContratacion, String usuarioCreacion) {

        UsuariosDTO usuario = new UsuariosDTO();
        usuario.setIdRol(idRol);
        usuario.setNombreComp(nombreComp);
        usuario.setIdTipoDoc(idTipoDoc);
        usuario.setNumeroDocumento(numeroDocumento);
        usuario.setContrasenha(contrasenha);
        usuario.setEmail(email);
        usuario.setTelefono(telefono);
        usuario.setSueldo(sueldo);
        usuario.setFechaContratacion(fechaContratacion);
        usuario.setCantidadReservacion(0); // Valor por defecto
        usuario.setEstado(true);
        usuario.setFecha_creacion(LocalDateTime.now());
        usuario.setUsuario_creacion(usuarioCreacion);
        return this.usuarioDAO.insertar(usuario);
    }

    public UsuariosDTO obtenerPorId(Integer usuarioId) {
        return this.usuarioDAO.obtenerPorId(usuarioId);
    }

    public List<UsuariosDTO> listar(UsuariosParametros parametros) {
        return this.usuarioDAO.listar(parametros);
    }

    public Integer modificar(Integer idUsuario, Integer idRol, String nombreComp, Integer idTipoDoc, String numeroDocumento,
                             String contrasenha, String email, String telefono, Double sueldo,
                             LocalDateTime fechaContratacion, String usuarioModificacion) {

        UsuariosDTO usuario = new UsuariosDTO();
        usuario.setIdUsuario(idUsuario);
        usuario.setIdRol(idRol);
        usuario.setNombreComp(nombreComp);
        usuario.setIdTipoDoc(idTipoDoc);
        usuario.setNumeroDocumento(numeroDocumento);
        usuario.setContrasenha(contrasenha);
        usuario.setEmail(email);
        usuario.setTelefono(telefono);
        usuario.setSueldo(sueldo);
        usuario.setFechaContratacion(fechaContratacion);
        usuario.setFecha_modificacion(LocalDateTime.now());
        usuario.setUsuario_modificacion(usuarioModificacion);
        return this.usuarioDAO.modificar(usuario);
    }

    public Integer eliminar(Integer usuarioId) {
        return this.usuarioDAO.eliminar(usuarioId);
    }
}
