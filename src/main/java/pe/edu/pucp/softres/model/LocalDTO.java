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
public class LocalDTO {
    private Integer idLocal;
	private Integer idSede;
	private String nombre;
    private String direccion;
    private Integer capacidadTotal;
    private String telefono;
    private Boolean estado;
	private LocalDateTime fecha_creacion;
	private String usuario_creacion;
	private LocalDateTime fecha_modificacion;
	private String usuario_modificacion;
    
    // Constructor
	public LocalDTO() {
		this.idLocal = null;
		this.idSede = null;
		this.nombre = null;
		this.direccion = null;
		this.capacidadTotal = null;
		this.telefono = null;
		this.estado = false;
		this.fecha_creacion = LocalDateTime.now();
		this.usuario_creacion = null;
		this.fecha_modificacion = null;
		this.usuario_modificacion = null;
	}
    public LocalDTO(Integer idLocal, Integer idSede, String nombre, String direccion, Integer capacidadTotal,
                String telefono, Boolean estado, String usuario_creacion) {
		this.idLocal = idLocal;
		this.idSede = idSede;
		this.nombre = nombre;
		this.direccion = direccion;
		this.capacidadTotal = capacidadTotal;
		this.telefono = telefono;
		this.estado = estado;
		this.fecha_creacion = LocalDateTime.now();
		this.usuario_creacion = usuario_creacion;
		this.fecha_modificacion = null;
		this.usuario_modificacion = null;
	}
		
    public LocalDTO(LocalDTO original) {
        this.idLocal = original.idLocal;
        this.idSede = original.idSede;
        this.nombre = original.nombre;
        this.direccion = original.direccion;
        this.capacidadTotal = original.capacidadTotal;
        this.telefono = original.telefono;
        this.estado = original.estado;
        this.fecha_creacion = original.fecha_creacion;
        this.usuario_creacion = original.usuario_creacion;
        this.fecha_modificacion = original.fecha_modificacion;
        this.usuario_modificacion = original.usuario_modificacion;
    }
    
    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(Integer capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
