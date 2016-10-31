package Model;

public class ModelRegistro {
    private static ModelRegistro instancia;
    
    public static ModelRegistro getInstance(){
        if (instancia==null){
            instancia = new ModelRegistro();
        }
        return instancia;
    }
    
    public boolean agregarRegistro(String ip, String url, String so, String nav){
        servidor.PublicadorService service =  new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();
        return port.agregarRegistro(ip, url, so, nav);
    }
    
}
