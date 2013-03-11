package ve.gob.domain;
// Generated 11/03/2013 09:41:34 AM by Hibernate Tools 3.2.1.GA



/**
 * Auditado generated by hbm2java
 */
public class Auditado  implements java.io.Serializable {


     private long id;
     private Integer version;
     private String apellido;
     private String cedula;
     private String login;
     private String nombre;

    public Auditado() {
    }

	
    public Auditado(long id) {
        this.id = id;
    }
    public Auditado(long id, String apellido, String cedula, String login, String nombre) {
       this.id = id;
       this.apellido = apellido;
       this.cedula = cedula;
       this.login = login;
       this.nombre = nombre;
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
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


