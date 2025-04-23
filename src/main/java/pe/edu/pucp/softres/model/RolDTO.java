/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.softres.model;

/**
 *
 * @author bryangnr
 */
public class RolDTO {
    private Integer idRol;
    private String nombre;
    
    // constructor
	public RolDTO(){
        this.idRol = null;
        this.nombre = null;
    }
	
    public RolDTO(Integer idRol,String nombre){
        this.idRol = idRol;
        this.nombre = nombre;
    }
    
    public RolDTO(RolDTO rol){
        this.idRol = rol.idRol;
        this.nombre = rol.nombre;
    }
    
    public void setIdRol(Integer idRol){
        this.idRol = idRol;
    }
    
    public Integer getIdRol(){
        return this.idRol;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
