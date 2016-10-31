package Model;

public class ModelUsuario {
    private static ModelUsuario instancia;
    
    public static ModelUsuario getInstance(){
        if (instancia==null){
            instancia = new ModelUsuario();
        }
        return instancia;
    }
    
    public boolean autenticarProveedor(String nick, String pass){
        servidor.PublicadorService service =  new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();
        return port.autenticarProveedor(nick, pass) == 1;
    }
    
}
