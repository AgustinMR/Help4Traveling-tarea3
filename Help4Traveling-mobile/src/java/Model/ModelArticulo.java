package Model;

import java.util.ArrayList;
import java.util.List;
import servidor.DtPromocion;
import servidor.DtPromocionArray;
import servidor.DtServicio;
import servidor.DtServicioArray;

public class ModelArticulo {
    private static ModelArticulo instancia;
    
    public static ModelArticulo getInstance(){
        if (instancia==null){
            instancia = new ModelArticulo();
        }
        return instancia;
    }
    
    public ArrayList<DtServicio> listarServiciosXprov(String nickP){
        servidor.PublicadorService service =  new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();
        DtServicioArray s = port.listarServiciosXprov(nickP);
        ArrayList<DtServicio> ret = new ArrayList<>();
        for(int x = 0; x < s.getItem().size(); x++){
            ret.add(s.getItem().get(x));
        }
        return ret;
    }
        
    public ArrayList<DtPromocion> listarPromocionesXprov(String nickP){
        servidor.PublicadorService service =  new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();
        DtPromocionArray p = port.listarPromocionesXprov(nickP);
        ArrayList<DtPromocion> ret = new ArrayList<>();
        for(int x = 0; x < p.getItem().size(); x++){
            ret.add(p.getItem().get(x));
        }
        return ret;
    }
    
    public boolean agregarVisita(String nickP, String nombreA){
        servidor.PublicadorService service =  new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();
        return port.agregarVisita(nickP, nombreA);
    }
    
    public DtServicio devolverServicio(String nickP, String nombreA){
        servidor.PublicadorService service =  new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();
        return port.obtenerDatosServicio(nickP, nombreA);
    }
    
    public DtPromocion devolverPromocion(String nickP, String nombreA){
        servidor.PublicadorService service =  new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();
        return port.datosPromocion(nickP, nombreA);
    }
    
}
