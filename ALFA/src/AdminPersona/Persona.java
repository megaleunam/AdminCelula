/*
 * Clase Persona 
 * registra datos de la persona,
 * la persona son integrantes de la celula, asisten a una celula.
 * almacenados en la base de datos
 */
package AdminPersona;

/**
 *
 * @author Manuel Mariño
 */
public class Persona {
    String nombre;
    String apellido;
    String direcccion;
    String email;
    String telefono;
    

    public Persona() {
    }

    public Persona(String nombre, String apellido, String direcccion, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direcccion = direcccion;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
