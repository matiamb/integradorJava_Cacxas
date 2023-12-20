
package logica;

import java.util.List;
import persistencia.ControladorePersistencia;
import persistencia.exceptions.NonexistentEntityException;


public class Controladora {
    
    ControladorePersistencia controlpersis = new ControladorePersistencia();
    
    public void crearOrador(Orador ora){
        controlpersis.crearOrador(ora);
    }
    
    public List<Orador> traerOradores(){
        return controlpersis.traerOradores();
    }
    
    public void borrarOrador(int id) throws NonexistentEntityException{
        controlpersis.borrarOrador(id);
    }
    
}
