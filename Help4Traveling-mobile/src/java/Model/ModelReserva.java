package Model;

import java.util.ArrayList;
import net.java.dev.jaxb.array.IntArray;
import servidor.DtReserva;

public class ModelReserva {
    private static ModelReserva instancia;
    
    public static ModelReserva getInstance(){
        if (instancia==null){
            instancia = new ModelReserva();
        }
        return instancia;
    }
    
    public ArrayList<Integer> listarReservasXProv(String nickP){
        servidor.PublicadorService service =  new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();
        IntArray r =  port.listarReservasXprov(nickP);
        ArrayList<Integer> ret = new ArrayList<>();
        for(int x = 0; x < r.getItem().size(); x++){
            ret.add(r.getItem().get(x));
        }
        return ret;
    }
    
    public DtReserva devolverReserva(int idReserva){
        servidor.PublicadorService service =  new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();
        return port.devolverReserva(idReserva);
    }
    
    public boolean actualizarEstadoArticulo(String idReserva, String nickP, String nombreA){
        servidor.PublicadorService service =  new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();
        return port.actualizarEstadoArticulo(idReserva, nickP, nombreA);
    }
    
}
