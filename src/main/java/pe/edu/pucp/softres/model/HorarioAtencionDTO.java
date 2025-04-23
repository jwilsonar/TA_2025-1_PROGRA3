/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.softres.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author bryangnr
 */
public class HorarioAtencionDTO {
    private Integer idHorario;
    private DiaSemana diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Boolean esFeriado;
    private Boolean estado;
	private LocalDateTime fecha_creacion;
	private String usuario_creacion;
	private LocalDateTime fecha_modificacion;
	private String usuario_modificacion;
    
    // Constructor
	public HorarioAtencionDTO() {
        this.fecha_creacion = LocalDateTime.now();
        this.fecha_modificacion = null;
        this.usuario_modificacion = null;
    }
	
    public HorarioAtencionDTO(Integer idHorario, DiaSemana diaSemana, LocalTime horaInicio,
                              LocalTime horaFin, Boolean esFeriado, Boolean estado, String usuario_creacion) {
        this.idHorario = idHorario;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.esFeriado = esFeriado;
        this.estado = estado;
        this.fecha_creacion = LocalDateTime.now();
        this.usuario_creacion = usuario_creacion;
        this.fecha_modificacion = null;
        this.usuario_modificacion = null;
    }
    
    public HorarioAtencionDTO(HorarioAtencionDTO original) {
        this.idHorario = original.idHorario;
        this.diaSemana = original.diaSemana;
        this.horaInicio = original.horaInicio;
        this.horaFin = original.horaFin;
        this.esFeriado = original.esFeriado;
        this.estado = original.estado;
        this.fecha_creacion = original.fecha_creacion;
        this.usuario_creacion = original.usuario_creacion;
        this.fecha_modificacion = original.fecha_modificacion;
        this.usuario_modificacion = original.usuario_modificacion;
    }
    
    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public Boolean getEsFeriado() {
        return esFeriado;
    }

    public void setEsFeriado(Boolean esFeriado) {
        this.esFeriado = esFeriado;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDateTime fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getUsuario_creacion() {
        return usuario_creacion;
    }

    public void setUsuario_creacion(String usuario_creacion) {
        this.usuario_creacion = usuario_creacion;
    }

    public LocalDateTime getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(LocalDateTime fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public String getUsuario_modificacion() {
        return usuario_modificacion;
    }

    public void setUsuario_modificacion(String usuario_modificacion) {
        this.usuario_modificacion = usuario_modificacion;
    }
}
