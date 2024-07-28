package tarea;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonaService {
    private List<Persona> personas;

    public PersonaService() {
        this.personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public List<Persona> obtenerLista() {
        return personas;
    }

    public List<String> obtenerNombresCompletos() {
        return personas.stream()
                       .map(Persona::toString)
                       .collect(Collectors.toList());
    }

    public List<Persona> obtenerMayoresDeEdad() {
        return personas.stream()
                       .filter(p -> p.getEdad() >= 18)
                       .collect(Collectors.toList());
    }

    public Optional<Persona> buscarPersona(String ciudad, String nombre) {
        return personas.stream()
                       .filter(p -> p.getEdad() >= 18)
                       .filter(p -> p.getCiudad().equals(ciudad))
                       .filter(p -> p.getPrimerNombre().contains(nombre))
                       .findFirst();
    }
}

