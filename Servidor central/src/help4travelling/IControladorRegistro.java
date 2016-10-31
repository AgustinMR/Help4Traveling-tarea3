
package help4travelling;

import java.util.ArrayList;

public abstract interface IControladorRegistro{
    public abstract boolean agregarRegistro(String ip, String url, String so, String navegador);
    public abstract ArrayList<DtRegistro> listarRegistros();
}
