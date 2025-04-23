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
public class ComentariosDTO {
    private Integer idComentario;
	private Integer idUsuario;
	private Integer idReserva;
    private String mensaje;
    private Integer puntuacion;
    private Boolean estado;
	private LocalDateTime fecha_creacion;
	private String usuario_creacion;
	private LocalDateTime fecha_modificacion;
	private String usuario_modificacion;
    
    // Constructor
	public ComentariosDTO() {
		this.idComentario = null;
		this.idUsuario = null;
		this.idReserva = null;
		this.mensaje = null;
		this.puntuacion = null;
		this.estado = false;
		this.fecha_creacion = LocalDateTime.now();
		this.usuario_creacion = null;
		this.fecha_modificacion = null;
		this.usuario_modificacion = null;
	}
	
    public ComentariosDTO(Integer idComentario,Integer idUsuario, Integer idReserva, String mensaje,
                      Integer puntuacion, Boolean estado, String usuario_creacion) {
		this.idComentario = idComentario;
		this.idUsuario = idUsuario;
		this.idReserva = idReserva;
		this.mensaje = mensaje;
		this.puntuacion = puntuacion;
		this.estado = estado;
		this.fecha_creacion = LocalDateTime.now();
		this.usuario_creacion = usuario_creacion;
		this.fecha_modificacion = null;
		this.usuario_modificacion = null;
	}

    
    public ComentariosDTO(ComentariosDTO comentario) {
        this.idComentario = comentario.idComentario;
        this.idUsuario = comentario.idUsuario;
        this.idReserva = comentario.idReserva;
        this.mensaje = comentario.mensaje;
        this.puntuacion = comentario.puntuacion;
        this.estado = comentario.estado;
        this.fecha_creacion = comentario.fecha_creacion;
        this.usuario_creacion = comentario.usuario_creacion;
        this.fecha_modificacion = comentario.fecha_modificacion;
        this.usuario_modificacion = comentario.usuario_modificacion;
    }
    
   public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
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
