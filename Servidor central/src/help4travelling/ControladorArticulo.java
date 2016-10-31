package help4travelling;

import java.util.ArrayList;
import java.util.List;

public class ControladorArticulo implements IControladorArticulo{    
    private Promocion prom;
    private Servicio serv;
    
    public ControladorArticulo(){}
    
    @Override
    public boolean insertarServicio(DtServicio DtServ){
        Ciudad ciudadO = ManejadorCiudad.GetInstance().BuscarCiudad(DtServ.getCiudadOrigen());
        if (DtServ.getCiudadDestino() != null){
            Ciudad ciudadD = ManejadorCiudad.GetInstance().BuscarCiudad(DtServ.getCiudadDestino());
            return ManejadorArticulo.GetInstance().insertarServicio(DtServ, ciudadO, ciudadD);
        }else{
            //System.out.println("nulllllll");
            return ManejadorArticulo.GetInstance().insertarServicio(DtServ, ciudadO, null);
        }
    }
    
    @Override
    public boolean CrearPromocion(DtPromocion DtProm){
        String nameProm = DtProm.getNombre();
        ManejadorArticulo manArt = ManejadorArticulo.GetInstance();
        boolean ok = manArt.IsPromocion(nameProm, DtProm.getNickProv());
        
        //Si la instancia no existe ya en el sistema puedo crearla
        if(ok == false){
            Promocion p = new Promocion(DtProm);
            manArt.AgregarPromocion(p);            
            
            ManejadorSQL.GetInstance().agregarPromocion(DtProm, nameProm, DtProm.getServicios());
        }
        
        return !ok;
    }
    
    @Override
    public ArrayList<DtPromocion> listarPromociones(){
        return ManejadorArticulo.GetInstance().listarPromociones();
    }
    
    @Override
    public ArrayList<DtServicio> ListarServicios(){
        return ManejadorArticulo.GetInstance().ListarServicios();
    }
    
    @Override
    public ArrayList<DtPromocion> listarPromocionesProv(String nick){
        return ManejadorArticulo.GetInstance().listarPromocionesProv(nick);
    }
    
    @Override
    public ArrayList<DtServicio> ListarServiciosProv(String nick){
        return ManejadorArticulo.GetInstance().ListarServiciosProv(nick);
    }
    
    @Override
    public void PublicarServicio(String nameServ, String nameProv){
        Servicio ser = ManejadorArticulo.GetInstance().BuscarServicio(nameServ, nameProv);
        this.prom.AgregarServicio(ser);
        this.prom = null;
    }
    
    @Override
    public DtPromocion datosPromociones(String nombreProm, String nameProv){
        return ManejadorArticulo.GetInstance().datosPromociones(nombreProm, nameProv);
    }
    
    @Override
    public DtServicio datosServicio(String nombreServ, String nameProv){
        return ManejadorArticulo.GetInstance().datosServicio(nombreServ, nameProv);
    }
    
    @Override
    public Servicio ModificarServicio(DtServicio modSer){
        Servicio ser = ManejadorArticulo.GetInstance().ModificarServicio(modSer);
        this.serv = ser;
        return ser;
    }
    
    public void CambiarCiudadOrigen(String City){
        Ciudad ciu = ManejadorCiudad.GetInstance().BuscarCiudad(City);
        this.serv.CambiarOrigen(ciu);
    }
    
    public void CambiarCiudadDestino(String City){
        Ciudad ciu = ManejadorCiudad.GetInstance().BuscarCiudad(City);
        this.serv.CambiarDestino(ciu);
    }
    
    @Override
    public void AgregarCategoria(String catName){
        Categoria cat = ManejadorCategoria.GetInstance().BuscarCategoria(catName);
        this.serv.AgregarCategoria(cat);
    }
    
    @Override
    public void QuitarCategoria(String catName){
        ManejadorCategoria.GetInstance().QuitarCategoria(catName);
    }   
    
    @Override
    public List<String> listaDeCiudades(){
        return ManejadorCiudad.GetInstance().listaDeCiudades();
    }

    @Override
    public boolean insertarPromocion(DtPromocion promo) {
        return ManejadorArticulo.GetInstance().insertarPromocion(promo);
    }

    @Override
    public int devolverVisitas(String nickP, String nombreA) {
        return ManejadorArticulo.GetInstance().devolverVisitas(nickP, nombreA);
    }

    @Override
    public boolean agregarVisita(String nickP, String nombreA) {
        return ManejadorSQL.GetInstance().ingresarVisita(nickP, nombreA);
    }
}
