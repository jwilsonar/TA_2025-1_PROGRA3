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
public class NotificacionDTO {
    private Integer idNotificacion;
	private Integer idUsuario;
    private String mensaje;
    private Boolean leida;
	private LocalDateTime fecha_creacion;
	private String usuario_creacion;
    
    // Constructor
	public NotificacionDTO() {
		this.idNotificacion = null;
		this.idUsuario = null;
		this.mensaje = null;
		this.leida = false; // Por defecto
		this.fecha_creacion = LocalDateTime.now();
		this.usuario_creacion = null;
	}
	
	public NotificacionDTO(Integer idNotificacion,Integer idUsuario, String mensaje, String usuario_creacion) {
		this.idNotificacion = idNotificacion;
		this.idUsuario = idUsuario;
		this.mensaje = mensaje;
		this.leida = false; // Por defecto
		this.fecha_creacion = LocalDateTime.now();
		this.usuario_creacion = usuario_creacion;
	}
	
    public NotificacionDTO(Integer idUsuario, String mensaje, String usuario_creacion) {
		this.idUsuario = idUsuario;
		this.mensaje = mensaje;
		this.leida = false; // Por defecto
		this.fecha_creacion = LocalDateTime.now();
		this.usuario_creacion = usuario_creacion;
	}

    
    public NotificacionDTO(NotificacionDTO original) {
        this.idNotificacion = original.idNotificacion;
        this.idUsuario = original.idUsuario;
        this.mensaje = original.mensaje;
        this.leida = original.leida;
        this.fecha_creacion = original.fecha_creacion;
        this.usuario_creacion = original.usuario_creacion;
    }
    
    public Integer getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(Integer idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Boolean getLeida() {
        return leida;
    }

    public void setLeida(Boolean leida) {
        this.leida = leida;
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
}
