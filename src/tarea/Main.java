package tarea;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();

        // Agregar personas a la lista
        personaService.agregarPersona(new Persona(1, "Luis", "Fernando", "Gonzalez", "Perez", "M", "1234567890101", 25, "Guatemala"));
        personaService.agregarPersona(new Persona(2, "Ana", "Maria", "Lopez", "Diaz", "F", "1234567890102", 30, "Guatemala"));
        personaService.agregarPersona(new Persona(3, "Carlos", "Enrique", "Martinez", "Sanchez", "M", "1234567890103", 17, "Quetzaltenango"));

        // Imprimir el nombre completo de cada persona utilizando streams
        personaService.obtenerNombresCompletos().forEach(System.out::println);

        // Buscar personas mayores de edad
        List<Persona> mayoresDeEdad = personaService.obtenerMayoresDeEdad();

        // Imprimir personas mayores de edad
        System.out.println("\nPersonas mayores de edad:");
        mayoresDeEdad.forEach(p -> System.out.println(p.toString()));

        // Buscar la primera persona mayor de edad, de la ciudad de Guatemala y cuyo primer nombre contenga "Lu"
        Optional<Persona> personaOpt = personaService.buscarPersona("Guatemala", "Lu");

        // Imprimir la persona encontrada
        personaOpt.ifPresent(persona -> System.out.println("\nPersona encontrada: " + persona.toString()));
    }
}

