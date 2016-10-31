package help4travelling;

import java.util.ArrayList;

public class ControladorRegistro implements IControladorRegistro{

    @Override
    public boolean agregarRegistro(String ip, String url, String so, String navegador) {
        return ManejadorRegistro.GetInstance().agregarRegistro(new DtRegistro(ip, url, so, navegador));
    }

    @Override
    public ArrayList<DtRegistro> listarRegistros() {
        return ManejadorRegistro.GetInstance().listarRegistros();
    }
    
}
