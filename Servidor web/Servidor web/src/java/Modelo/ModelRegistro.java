package Modelo;

import servidor.Publicador;
import servidor.PublicadorService;

public class ModelRegistro {
    private static ModelRegistro instancia;
    
    public static ModelRegistro getInstance(){
        if (instancia==null){
            instancia = new ModelRegistro();
        }
        return instancia;
    }
    
    public boolean agregarRegistro(String ip, String url, String nav, String so){
        PublicadorService service =  new PublicadorService();
        Publicador port = service.getPublicadorPort();
        return (port.agregarRegistro(ip, url, nav, so) == 1);
    }
    
}
