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
public class UsuariosDTO {
    private Integer idUsuario;
	private Integer idRol;
    private String nombreComp;
	private Integer idTipoDoc;
    private String numeroDocumento;
    private String contrasenha;
    private String email;
    private String telefono;
    private Double sueldo;
    private LocalDateTime fechaContratacion;
    private Integer cantidadReservacion;
    private Boolean estado;
	private LocalDateTime fecha_creacion;
	private String usuario_creacion;
	private LocalDateTime fecha_modificacion;
	private String usuario_modificacion;
    
    // Constructor
	public UsuariosDTO() {
        this.fecha_creacion = LocalDateTime.now();
        this.fecha_modificacion = null;
        this.usuario_modificacion = null;
    }
	
    public UsuariosDTO(Integer idUsuario, Integer idRol, String nombreComp, Integer idTipoDoc, String numeroDocumento,
                       String contrasenha, String email, String telefono, Double sueldo,
                       LocalDateTime fechaContratacion, Integer cantidadReservacion, Boolean estado,
                       String usuario_creacion) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.nombreComp = nombreComp;
        this.idTipoDoc = idTipoDoc;
        this.numeroDocumento = numeroDocumento;
        this.contrasenha = contrasenha;
        this.email = email;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.fechaContratacion = fechaContratacion;
        this.cantidadReservacion = cantidadReservacion;
        this.estado = estado;
        this.fecha_creacion = LocalDateTime.now();
        this.usuario_creacion = usuario_creacion;
        this.fecha_modificacion = null;
        this.usuario_modificacion = null;
    }
    
    public UsuariosDTO(UsuariosDTO original) {
        this.idUsuario = original.idUsuario;
        this.idRol = original.idRol;
        this.nombreComp = original.nombreComp;
        this.idTipoDoc = original.idTipoDoc;
        this.numeroDocumento = original.numeroDocumento;
        this.contrasenha = original.contrasenha;
        this.email = original.email;
        this.telefono = original.telefono;
        this.sueldo = original.sueldo;
        this.fechaContratacion = original.fechaContratacion;
        this.cantidadReservacion = original.cantidadReservacion;
        this.estado = original.estado;
        this.fecha_creacion = original.fecha_creacion;
        this.usuario_creacion = original.usuario_creacion;
        this.fecha_modificacion = original.fecha_modificacion;
        this.usuario_modificacion = original.usuario_modificacion;
    }
    
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombreComp() {
        return nombreComp;
    }

    public void setNombreComp(String nombreComp) {
        this.nombreComp = nombreComp;
    }

    public Integer getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(Integer idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDateTime getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDateTime fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Integer getCantidadReservacion() {
        return cantidadReservacion;
    }

    public void setCantidadReservacion(Integer cantidadReservacion) {
        this.cantidadReservacion = cantidadReservacion;
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
