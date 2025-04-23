package pe.edu.pucp.softres.bo;

import pe.edu.pucp.softres.dao.ReservaDAO;
import pe.edu.pucp.softres.dao.daoImp.ReservaDAOImpl;
import pe.edu.pucp.softres.model.ReservaDTO;
import pe.edu.pucp.softres.parametros.ReservaParametros;

import java.time.LocalDateTime;
import java.util.List;

public class ReservaBO {

    private ReservaDAO reservaDAO;

    public ReservaBO() {
        this.reservaDAO = new ReservaDAOImpl();
    }

    public Integer insertar(LocalDateTime fechaHora, Integer cantidadPersonas,
                            Integer numeroMesas, Integer idTipoMesa,
                            Integer duracionEstimada, String observaciones) {
        ReservaDTO reserva = new ReservaDTO();
        reserva.setFecha_Hora(fechaHora);
        reserva.setCantidad_personas(cantidadPersonas);
        reserva.setNumeroMesas(numeroMesas);
        reserva.setIdTipoMesa(idTipoMesa);
        reserva.setDuracionEstimada(duracionEstimada);
        reserva.setObservaciones(observaciones);
        return this.reservaDAO.insertar(reserva);
    }

    public Integer insertar(LocalDateTime fechaHora, Integer cantidadPersonas,
                            Integer numeroMesas, Integer idTipoMesa,
                            Integer duracionEstimada, String observaciones,
                            String nombreEvento, String descripcionEvento) {
        ReservaDTO reserva = new ReservaDTO();
        reserva.setFecha_Hora(fechaHora);
        reserva.setCantidad_personas(cantidadPersonas);
        reserva.setNumeroMesas(numeroMesas);
        reserva.setIdTipoMesa(idTipoMesa);
        reserva.setDuracionEstimada(duracionEstimada);
        reserva.setObservaciones(observaciones);
        reserva.setNombreEvento(nombreEvento);
        reserva.setDescripcionEvento(descripcionEvento);
        return this.reservaDAO.insertar(reserva);
    }

    public ReservaDTO obtenerPorId(Integer reservaId) {
        return this.reservaDAO.obtenerPorId(reservaId);
    }

    public List<ReservaDTO> listar(ReservaParametros parametros) {
        return this.reservaDAO.listar(parametros);
    }

    public Integer modificar(LocalDateTime fechaHora, Integer cantidadPersonas,
                             Integer numeroMesas, Integer idTipoMesa,
                             Integer duracionEstimada, String observaciones) {
        ReservaDTO reserva = new ReservaDTO();
        reserva.setFecha_Hora(fechaHora);
        reserva.setCantidad_personas(cantidadPersonas);
        reserva.setNumeroMesas(numeroMesas);
        reserva.setIdTipoMesa(idTipoMesa);
        reserva.setDuracionEstimada(duracionEstimada);
        reserva.setObservaciones(observaciones);
        return this.reservaDAO.modificar(reserva);
    }

    public Integer eliminar(Integer reservaId, String motivoCancelacion) {
        return this.reservaDAO.eliminar(reservaId, motivoCancelacion);
    }
}