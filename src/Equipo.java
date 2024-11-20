import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String ciudad;
    private ArrayList<String> jugadores;

    public void equipo(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    public void agregarJugador(String jugador) {
        jugadores.add(jugador);
    }

    public void mostrarDetalles() {
        System.out.println("\nEquipo: " + nombre + " de " + ciudad);
        System.out.println("\nJugadores:");
        for (String jugador : jugadores) {
            System.out.println("- " + jugador);
        }
    }

    public void sobrecarga() {
        System.out.println("\nEl equipo " + nombre + " tiene " + jugadores.size() + " jugadores.");
    }

}
/*
Class Equipo
    Atributos:
        - nombre String
        - ciudad String
        - jugadores String[]

    Métodos:
       + mostrarDetalles()
       + sobrecarga()
 */