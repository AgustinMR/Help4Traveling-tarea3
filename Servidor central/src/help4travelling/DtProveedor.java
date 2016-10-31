package help4travelling;

import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class DtProveedor implements Serializable{
 
    private String nick;
    private String nombre;
    private String apellido;
    private String email;
    private DtFecha fechaN;
    private String nombreEmpresa;
    private String url;
    private ArrayList<DtServicio> servicio;
    private String clave;

    public DtProveedor() {
    }
     
    public DtProveedor(String nick, String nombre, String apellido, String email, DtFecha fechaN, Blob[] avatar, String nombreEmpresa, String url, ArrayList<DtServicio> servicio){
        this.nick=nick;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.fechaN=fechaN;
        this.nombreEmpresa=nombreEmpresa; 
        this.url=url;
        this.servicio=servicio;
    }
    
    public DtProveedor(String nick, String nombre, String apellido, String email, DtFecha fechaN, Blob[] avatar, String nombreEmpresa, String url, ArrayList<DtServicio> servicio, String clave){
        this.nick=nick;
        this.clave=clave;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.fechaN=fechaN;
        this.nombreEmpresa=nombreEmpresa; 
        this.url=url;
        this.servicio=servicio;
    }
     
    public DtProveedor(String nick, String nombre, String apellido, String email, DtFecha fechaN, String nombreEmpresa, String url, ArrayList<DtServicio> servicio){
        this.nick=nick;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.fechaN=fechaN;
        this.nombreEmpresa=nombreEmpresa; 
        this.url=url;
        this.servicio=servicio;
    }
    
    public String getNick(){
        return this.nick;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public DtFecha getFechaN(){
        return this.fechaN;
    }
    
     public String getNombreEmpresa(){
        return this.nombreEmpresa;
    }
     
      public String getUrl(){
        return this.url;
    }
         
    public ArrayList<DtServicio> getServicio() {
        return servicio;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaN(DtFecha fechaN) {
        this.fechaN = fechaN;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setServicio(ArrayList<DtServicio> servicio) {
        this.servicio = servicio;
    }
    
    
    
    
}
