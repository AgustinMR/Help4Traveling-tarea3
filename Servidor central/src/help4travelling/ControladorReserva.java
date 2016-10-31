package help4travelling;

import java.util.ArrayList;
import java.util.Set;

public class ControladorReserva implements IControladorReserva{
 
    private int nroRes;
    private Reserva res;
    private Articulo artmem;
    private infoReserva irmem;
    private DtReserva dtRes;
    
    @Override
    public ArrayList<Integer> listarReservasXcli(String nickU){
        return ManejadorReserva.GetInstance().listarReservasXcli(nickU);
    }
    
    @Override
    public boolean CrearReserva(DtReserva dtRes){ 
        return ManejadorReserva.GetInstance().CrearReserva(dtRes);
    }
    
    @Override
    public void ReservarArticulo(DtInfoReserva dtir){
        Articulo art = ManejadorArticulo.GetInstance().ObtenerArticulo(dtir.GetNombreArticulo(),dtir.getNickProveedor());
        infoReserva ir = res.ReservarArticulo(dtir, art);
        this.artmem = art;
        this.irmem = ir;
    }
    
    @Override
    public void ConfirmarReserva(boolean ok){
        if(ok == true){
            this.artmem.EnlazarReserva(irmem);
            ManejadorReserva.GetInstance().GuardarReserva(this.res, this.irmem);
        }
        else{
            this.res.DesenlazarReserva(this.irmem);
        }
    }
    
    @Override
    //Lista todas las key de las reservas en el sistema
    public Set ListarNroReservas(){
        return ManejadorReserva.GetInstance().DevolverKeyReservas();        
    }
    
    @Override
    public DtReserva ObtenerDatosReserva(int idReserva){
        this.nroRes = idReserva;
        return ManejadorReserva.GetInstance().ObtenerDatosReserva(idReserva);
    }
    
    @Override
    public ArrayList<DtInfoReserva> ObtenerInfoArticulosReservados(int id){
        return ManejadorReserva.GetInstance().ObtenerInfoArticulosReservados(id);
    }
    
    @Override
    public ArrayList<DtReserva> listarReservas(){
        return ManejadorReserva.GetInstance().listarReservas();
    }
    
    @Override
    public boolean actualizarEstado(Estado e, int idRes){
        return ManejadorReserva.GetInstance().modReserva(e, idRes);
    }
    
    @Override
    public DtReserva datosReservas(int idRes){
        return ManejadorReserva.GetInstance().ObtenerDatosReserva(idRes);
    }
    
    @Override
    public ArrayList<Integer> listarReservasXprov(String nickP) {
        return ManejadorReserva.GetInstance().listarReservasXprov(nickP);
    }
    
    @Override
    public boolean eliminarReserva(String id){
        return ManejadorReserva.GetInstance().eliminarReserva(id);
    }
    
    @Override
    public String devolverEstadoArticulo(String idReserva, String nickP, String nombreA){
        return ManejadorSQL.GetInstance().devolverEstadoArticulo(idReserva, nickP, nombreA);
    }

    @Override
    public boolean actualizarEstadoArticulo(String idReserva, String nickP, String nombreA) {
        return ManejadorReserva.GetInstance().actualizarEstadoArticulo(idReserva, nickP, nombreA, Estado.Facturada);
    }
    
}
