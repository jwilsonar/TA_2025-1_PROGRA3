/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.softres.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author bryangnr
 */
public class ReservaDTO {

    private Integer idReserva;
	private Integer idUsuario;
	private Integer idLocal;
    private LocalDateTime fecha_Hora;
    private Integer cantidad_personas;
	private Integer idTipoMesa;
    private Integer numeroMesas;
    private Integer duracionEstimada;
    private String observaciones;
    private String motivoCancelacion;
    private Boolean confirmacionEmail;
    private EstadoFilaEspera estadofila;
    private String nombreEvento;
    private String descripcionEvento;
	private LocalDateTime fecha_creacion;
	private String usuario_creacion;
	private LocalDateTime fecha_modificacion;
	private String usuario_modificacion;

    // Constructores
	public ReservaDTO() {
		this.idReserva = null;
		this.idUsuario = null;
		this.idLocal = null;
		this.fecha_Hora = null;
		this.cantidad_personas = null;
		this.idTipoMesa = null;
		this.numeroMesas = null;
		this.duracionEstimada = null;
		this.observaciones = null;
		this.nombreEvento = null;
		this.descripcionEvento = null;

		this.fecha_creacion = LocalDateTime.now();      
		this.usuario_creacion = null;       
		this.fecha_modificacion = null;                
		this.usuario_modificacion = null;
		this.motivoCancelacion = null;                  
		this.confirmacionEmail = false;                 
		this.estadofila = EstadoFilaEspera.VACIA;     
	}
	
    public ReservaDTO(Integer idReserva,Integer idUsuario, Integer idLocal, LocalDateTime fecha_Hora,
                  Integer cantidad_personas, Integer idTipoMesa, Integer numeroMesas,
                  Integer duracionEstimada, String observaciones, String nombreEvento,
                  String descripcionEvento, String usuario_creacion) {
		this.idReserva = idReserva;
		this.idUsuario = idUsuario;
		this.idLocal = idLocal;
		this.fecha_Hora = fecha_Hora;
		this.cantidad_personas = cantidad_personas;
		this.idTipoMesa = idTipoMesa;
		this.numeroMesas = numeroMesas;
		this.duracionEstimada = duracionEstimada;
		this.observaciones = observaciones;
		this.nombreEvento = nombreEvento;
		this.descripcionEvento = descripcionEvento;

		this.fecha_creacion = LocalDateTime.now();      // Fecha actual
		this.usuario_creacion = usuario_creacion;       // Usuario que la crea
		this.fecha_modificacion = null;                 // Aún no modificada
		this.usuario_modificacion = null;
		this.motivoCancelacion = null;                  // Aún no cancelada
		this.confirmacionEmail = false;                 // Por defecto no confirmado
		this.estadofila = EstadoFilaEspera.VACIA;     
	}	
	//constructor copia
	public ReservaDTO(ReservaDTO original) {
        this.idReserva = original.idReserva;
        this.idUsuario = original.idUsuario;
        this.idLocal = original.idLocal;
        this.fecha_Hora = original.fecha_Hora;
        this.cantidad_personas = original.cantidad_personas;
        this.idTipoMesa = original.idTipoMesa;
        this.numeroMesas = original.numeroMesas;
        this.duracionEstimada = original.duracionEstimada;
        this.observaciones = original.observaciones;
        this.motivoCancelacion = original.motivoCancelacion;
        this.confirmacionEmail = original.confirmacionEmail;
        this.estadofila = original.estadofila;
        this.nombreEvento = original.nombreEvento;
        this.descripcionEvento = original.descripcionEvento;
        this.fecha_creacion = original.fecha_creacion;
        this.usuario_creacion = original.usuario_creacion;
        this.fecha_modificacion = original.fecha_modificacion;
        this.usuario_modificacion = original.usuario_modificacion;
    }

    // Getter & Setter
    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public LocalDateTime getFecha_Hora() {
        return fecha_Hora;
    }

    public void setFecha_Hora(LocalDateTime fecha_Hora) {
        this.fecha_Hora = fecha_Hora;
    }

    public Integer getCantidad_personas() {
        return cantidad_personas;
    }

    public void setCantidad_personas(Integer cantidad_personas) {
        this.cantidad_personas = cantidad_personas;
    }

    public Integer getIdTipoMesa() {
        return idTipoMesa;
    }

    public void setIdTipoMesa(Integer idTipoMesa) {
        this.idTipoMesa = idTipoMesa;
    }

    public Integer getNumeroMesas() {
        return numeroMesas;
    }

    public void setNumeroMesas(Integer numeroMesas) {
        this.numeroMesas = numeroMesas;
    }

    public Integer getDuracionEstimada() {
        return duracionEstimada;
    }

    public void setDuracionEstimada(Integer duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getMotivoCancelacion() {
        return motivoCancelacion;
    }

    public void setMotivoCancelacion(String motivoCancelacion) {
        this.motivoCancelacion = motivoCancelacion;
    }

    public Boolean getConfirmacionEmail() {
        return confirmacionEmail;
    }

    public void setConfirmacionEmail(Boolean confirmacionEmail) {
        this.confirmacionEmail = confirmacionEmail;
    }

    public EstadoFilaEspera getEstado() {
        return this.estadofila;
    }

    public void setEstado(EstadoFilaEspera estado) {
        this.estadofila = estado;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
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
