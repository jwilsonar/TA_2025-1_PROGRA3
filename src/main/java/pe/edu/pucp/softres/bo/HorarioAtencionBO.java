package pe.edu.pucp.softres.bo;

import pe.edu.pucp.softres.dao.HorarioAtencionDAO;
import pe.edu.pucp.softres.dao.daoImp.HorarioAtencionDAOImpl;
import pe.edu.pucp.softres.model.HorarioAtencionDTO;
import pe.edu.pucp.softres.model.DiaSemana;
import pe.edu.pucp.softres.parametros.HorarioDeAtencionParametros;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class HorarioAtencionBO {

    private HorarioAtencionDAO horarioAtencionDAO;

    public HorarioAtencionBO() {
        this.horarioAtencionDAO = new HorarioAtencionDAOImpl();
    }

    public Integer insertar(DiaSemana diaSemana, LocalTime horaInicio, LocalTime horaFin, Boolean esFeriado, String usuarioCreacion) {
        HorarioAtencionDTO horarioAtencion = new HorarioAtencionDTO();
        horarioAtencion.setDiaSemana(diaSemana);
        horarioAtencion.setHoraInicio(horaInicio);
        horarioAtencion.setHoraFin(horaFin);
        horarioAtencion.setEsFeriado(esFeriado != null ? esFeriado : false);
        horarioAtencion.setEstado(true);
        horarioAtencion.setFecha_creacion(LocalDateTime.now());
        horarioAtencion.setUsuario_creacion(usuarioCreacion);
        return this.horarioAtencionDAO.insertar(horarioAtencion);
    }

    public HorarioAtencionDTO obtenerPorId(Integer idHorario) {
        return this.horarioAtencionDAO.obtenerPorId(idHorario);
    }

    public List<HorarioAtencionDTO> listar(HorarioDeAtencionParametros parametros) {
        return this.horarioAtencionDAO.listar(parametros);
    }

    public Integer modificar(Integer idHorario, DiaSemana diaSemana, LocalTime horaInicio, LocalTime horaFin, Boolean esFeriado, String usuarioModificacion) {
        HorarioAtencionDTO horarioAtencion = new HorarioAtencionDTO();
        horarioAtencion.setIdHorario(idHorario);
        horarioAtencion.setDiaSemana(diaSemana);
        horarioAtencion.setHoraInicio(horaInicio);
        horarioAtencion.setHoraFin(horaFin);
        horarioAtencion.setEsFeriado(esFeriado);
        horarioAtencion.setEstado(true); // Se asume que sigue activo
        horarioAtencion.setFecha_modificacion(LocalDateTime.now());
        horarioAtencion.setUsuario_modificacion(usuarioModificacion);
        return this.horarioAtencionDAO.modificar(horarioAtencion);
    }

    public Integer eliminar(Integer horarioId) {
        return this.horarioAtencionDAO.eliminar(horarioId);
    }
}
