/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.softres.model;

import java.time.LocalDateTime;

/**
 *
 * @author bryangnr
 */
public class FilaEsperaDTO {
    
    private Integer idFila;
	private Integer idUsuario;
	private Integer idReserva;
    private EstadoFilaEspera estado;
	private LocalDateTime fecha_creacion;
	private String usuario_creacion;
	private LocalDateTime fecha_modificacion;
	private String usuario_modificacion;
    
    // Constructor
	public FilaEsperaDTO() {
		this.idFila = null;
		this.idUsuario = null;
		this.idReserva = null;
		this.estado = null;
		this.fecha_creacion = LocalDateTime.now();
		this.usuario_creacion = null;
		this.usuario_modificacion = null;
		this.fecha_modificacion = null;
	}
	
    public FilaEsperaDTO(Integer idFila,Integer idUsuario, Integer idReserva, EstadoFilaEspera estado,
                     String usuario_creacion) {
		this.idFila = idFila;
		this.idUsuario = idUsuario;
		this.idReserva = idReserva;
		this.estado = estado;
		this.fecha_creacion = LocalDateTime.now();
		this.usuario_creacion = usuario_creacion;
		this.usuario_modificacion = null;
		this.fecha_modificacion = null;
	}

    
    public FilaEsperaDTO(FilaEsperaDTO original) {
        this.idFila = original.idFila;
        this.idUsuario = original.idUsuario;
        this.idReserva = original.idReserva;
        this.estado = original.estado;
        this.fecha_creacion = original.fecha_creacion;
        this.usuario_creacion = original.usuario_creacion;
        this.fecha_modificacion = original.fecha_modificacion;
        this.usuario_modificacion = original.usuario_modificacion;
    }
    
    public Integer getIdFila() {
        return idFila;
    }

    public void setIdFila(Integer idFila) {
        this.idFila = idFila;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public EstadoFilaEspera getEstado() {
        return estado;
    }

    public void setEstado(EstadoFilaEspera estado) {
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
