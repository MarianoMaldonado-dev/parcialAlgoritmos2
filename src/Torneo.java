import java.util.ArrayList;

public class Torneo {
    private String nombreTorneo;
    private ArrayList<Equipo> equipos;

    public Torneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
        this.equipos = new ArrayList<>(); // Inicializamos el ArrayList de equipos
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    // Método para agregar un equipo al torneo
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
        System.out.println("\nEl equipo '" + equipo.getNombre() + "' fue agregado al torneo '" + nombreTorneo + "' correctamente.");
    }

    // Método para mostrar los equipos en el torneo
    public void mostrarEquipos() {
        System.out.println("\nEquipos en el torneo '" + nombreTorneo + "':");
        for (Equipo equipo : equipos) {
            equipo.mostrarDetalles();
        }
    }
}


/*
Class Torneo
    Atributos:
       - nombreTorneo String
       - equipos String[]

    Métodos:
       + agregarEquipo()
       + mostrarEquipo()
 */