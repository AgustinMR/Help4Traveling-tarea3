package Modelo;

import java.util.List;

public class ModelArticulo {
    private static ModelArticulo instancia;
    private static servidor.PublicadorService service;
    private static servidor.Publicador port;
    
    public static ModelArticulo getInstance(){
        if (instancia==null){
            instancia = new ModelArticulo();
            service =  new servidor.PublicadorService();
            port = service.getPublicadorPort();
        }
        return instancia;
    }
    
    public List<servidor.DtPromocion> listarPromociones(){
        //return ICArticulo.listarPromociones();
        return port.listarPromociones().getItem();
    }
    
    public servidor.DtPromocion datosPromocion(String nombreProm, String nameProv){
        return port.datosPromocion(nombreProm, nameProv);
    }
    
    public boolean EsServicio(String nombreServicio){
        return port.esServicio(nombreServicio);
    }
    
    public List<servidor.DtServicio> serviciosXprov(String nickP){
        //return ICArticulo.ListarServiciosProv(nickP);
        return port.serviciosXprov(nickP).getItem();
    }
    
    public List<servidor.DtCategoria> listarCategorias(){
        //return ICCategoria.listarCategorias();
        return port.listarCategorias().getItem();
    }
    
    public List<servidor.DtServicio> listarServicios(){
        //return ICArticulo.ListarServicios();
        return port.listarServicios().getItem();
    }
    
    public List<servidor.DtServicio> serviciosXcat(String nameCat){
        //return (List)ICCategoria.listarServicios(nameCat);
        return port.serviciosXcat(nameCat).getItem();
    }
    
    public servidor.DtServicio ObtenerDatosServicio(String nameServ, String nameProv){
        //return ICArticulo.datosServicio(nameServ, nameProv);
        return port.obtenerDatosServicio(nameServ, nameProv);
    }
    
    public byte[] getImagen(String nickP, String nomA, String num){
        //return ManejadorSQL.GetInstance().selectImgServicio(num, nickP, nomA);
        byte[] a = port.getImagenArt(nickP, nomA, num);
        return a;
    }
    
    
}
    
    
   


