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
public class MesaDTO {
    private Integer idMesa;
	private Integer idLocal;
	private Integer idTipoMesa;
    private String numeroMesa;
    private Integer capacidad;
	private EstadoMesa estado;
    private Integer x;
    private Integer y;
	private LocalDateTime fecha_creacion;
	private String usuario_creacion;
	private LocalDateTime fecha_modificacion;
	private String usuario_modificacion;
    // TODO ubicacion,estado;
    
	public MesaDTO() {
		this.idMesa = null;
		this.idLocal = null;
		this.idTipoMesa = null;
		this.numeroMesa = null;
		this.capacidad = null;
		this.estado = null;
		this.x = null;
		this.y = null;
		this.fecha_creacion = LocalDateTime.now();
		this.usuario_creacion = null;
		this.fecha_modificacion = null;
		this.usuario_modificacion = null;
	}
	
    public MesaDTO(Integer idMesa,Integer idLocal, Integer idTipoMesa, String numeroMesa, Integer capacidad,
               EstadoMesa estado, Integer x, Integer y, String usuario_creacion) {
		this.idMesa = idMesa;
		this.idLocal = idLocal;
		this.idTipoMesa = idTipoMesa;
		this.numeroMesa = numeroMesa;
		this.capacidad = capacidad;
		this.estado = estado;
		this.x = x;
		this.y = y;
		this.fecha_creacion = LocalDateTime.now();
		this.usuario_creacion = usuario_creacion;
		this.fecha_modificacion = null;
		this.usuario_modificacion = null;
	}

    public MesaDTO(MesaDTO original) {
        this.idMesa = original.idMesa;
        this.idLocal = original.idLocal;
        this.idTipoMesa = original.idTipoMesa;
        this.numeroMesa = original.numeroMesa;
        this.capacidad = original.capacidad;
        this.estado = original.estado;
        this.x = original.x;
        this.y = original.y;
        this.fecha_creacion = original.fecha_creacion;
        this.usuario_creacion = original.usuario_creacion;
        this.fecha_modificacion = original.fecha_modificacion;
        this.usuario_modificacion = original.usuario_modificacion;
    }
    
    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public Integer getIdTipoMesa() {
        return idTipoMesa;
    }

    public void setIdTipoMesa(Integer idTipoMesa) {
        this.idTipoMesa = idTipoMesa;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public EstadoMesa getEstado() {
        return estado;
    }

    public void setEstado(EstadoMesa estado) {
        this.estado = estado;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
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
