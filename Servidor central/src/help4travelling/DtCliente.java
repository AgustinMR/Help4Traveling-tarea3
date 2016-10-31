package help4travelling;

import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class DtCliente implements Serializable {
    
    private String nick;
    private String clave;
    private String nombre;
    private String apellido;
    private String email;
    private DtFecha fechaN;
    private ArrayList<Integer> reservas;

    public DtCliente() {
    }
    
    public DtCliente(String nick, String nombre, String apellido, String email, DtFecha fechaN, Blob[] avatar, ArrayList<Integer> r){
        this.nick=nick;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.fechaN=fechaN;
        this.reservas=r;
    }
    
    public DtCliente(String nick, String nombre, String apellido, String email, DtFecha fechaN, Blob[] avatar, ArrayList<Integer> r, String clave){
        this.nick=nick;
        this.clave=clave;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.fechaN=fechaN;
        this.reservas=r;
    }
    
    public DtCliente(String nick, String nombre, String apellido, String email, DtFecha fechaN, ArrayList<Integer> r){
        this.nick=nick;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.fechaN=fechaN;
        this.reservas=r;
    }

    public ArrayList<Integer> getReservas() {
        return reservas;
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
    
    public void setReservas(ArrayList<Integer> reservas) {
        this.reservas = reservas;
    }
    
    
    
}
