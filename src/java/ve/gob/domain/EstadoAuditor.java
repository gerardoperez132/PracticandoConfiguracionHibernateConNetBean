package ve.gob.domain;
// Generated 11/03/2013 09:41:34 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * EstadoAuditor generated by hbm2java
 */
public class EstadoAuditor  implements java.io.Serializable {


     private long id;
     private Integer version;
     private String descripcion;
     private String nombre;
     private Set<Auditor> auditors = new HashSet<Auditor>(0);

    public EstadoAuditor() {
    }

	
    public EstadoAuditor(long id) {
        this.id = id;
    }
    public EstadoAuditor(long id, String descripcion, String nombre, Set<Auditor> auditors) {
       this.id = id;
       this.descripcion = descripcion;
       this.nombre = nombre;
       this.auditors = auditors;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public Integer getVersion() {
        return this.version;
    }
    
    public void setVersion(Integer version) {
        this.version = version;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Auditor> getAuditors() {
        return this.auditors;
    }
    
    public void setAuditors(Set<Auditor> auditors) {
        this.auditors = auditors;
    }




}


