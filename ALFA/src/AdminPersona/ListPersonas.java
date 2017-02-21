/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPersona;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maria Mata
 */
public class ListPersonas {
    List<Persona> listapersona;

    public ListPersonas() {
        listapersona = new ArrayList<>();
    }

    public ListPersonas( Persona persona) {
        listapersona = new ArrayList<>();
        listapersona.add(persona);
    }

    public void aggpersona(Persona persona) {
        listapersona.add(persona);
    }
    
}
