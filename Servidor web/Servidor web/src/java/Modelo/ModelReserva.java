package Modelo;

import java.util.List;
import servidor.DtInfoReservaArray;
import servidor.Estado;

public class ModelReserva {
    private static ModelReserva instancia;
    private static servidor.PublicadorService service;
    private static servidor.Publicador port;

    public static ModelReserva getInstance(){
        if (instancia==null){
            instancia = new ModelReserva();
            service =  new servidor.PublicadorService();
            port = service.getPublicadorPort();
        }
        return instancia;
    }
    
    public List<Integer> listarReservas(String nickname){
        //return ICReserva.listarReservasXcli(nickname);
        return port.listarReservas(nickname).getItem();
    }
    
    public servidor.DtReserva devolverReserva(int id){
        //return ICReserva.datosReservas(id);
        return port.devolverReserva(id);
    }
    
    public List<Integer> ObtenerReservas(String cli){
        /*List<Integer> res = ICReserva.listarReservasXcli(cli);             
        Integer[] Iret = res.toArray(new Integer[res.size()]);
        return Iret;*/
        return port.obtenerReservas(cli).getItem();
    }
    
    public List<servidor.DtInfoReserva> ObtenerDatosReserva(int idRes){
        //return ICReserva.ObtenerInfoArticulosReservados(idRes);
        return port.obtenerDatosReserva(idRes).getItem();
    }
    //DtReserva reserva = new DtReserva(Estado.Registrada,fechaActual,infodeReserva,"eWatson",90);      
    public boolean agregarRes(Estado E, servidor.DtFecha fecha, List<servidor.DtInfoReserva> DtInf ,String nick,float F){
        //return ICReserva.CrearReserva(new DtReserva(E, fecha, DtInf, nick, F));
        //servidor.DtInfoReserva[] g = null;
        DtInfoReservaArray h = new DtInfoReservaArray();
        
        for(int x = 0; x < DtInf.size(); x++){
            h.getItem().add(DtInf.get(x));
        }
        
        return port.agregarRes(E, fecha, h, nick, F);
    }
    
    public boolean cancelarReserva(int id){
        //return ICReserva.actualizarEstado(Estado.Cancelada, id);
        return port.cancelarReserva(id);
    }
}
