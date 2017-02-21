package base;
import AdminPersona.Persona;
import java.util.List;

/**
 *
 * @author Manuel Mariño
 */
public class Celula {
    int id;
    String nombre;
    String direccion;
    Persona lider;
    Persona colider;
    Persona anfitrion;
    List <Persona> discipulos;
    public Celula() {
    }

    public Celula(int id, String nombre, String direccion, Persona lider, Persona colider, Persona anfitrion, List<Persona> discipulos) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.lider = lider;
        this.colider = colider;
        this.anfitrion = anfitrion;
        this.discipulos = discipulos;
    }
    
}
