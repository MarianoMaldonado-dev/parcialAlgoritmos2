public class EquiposApp {
    public static void main(String[] args) {
        System.out.println("\nBienvenido al calendario de torneos Quiditch");

        Equipo equipo1 = new Equipo();
        equipo1.equipo("Hogwarts", "Londres");
        equipo1.agregarJugador("Harry");
        equipo1.agregarJugador("Hermione");
        equipo1.agregarJugador("Ron");
        equipo1.agregarJugador("Ginny");
        equipo1.sobrecarga();

        Equipo equipo2 = new Equipo();
        equipo2.equipo("Slytherin", "Escocia");
        equipo2.agregarJugador("Draco");
        equipo2.agregarJugador("Crabbe");
        equipo2.agregarJugador("Goyle");
        equipo2.agregarJugador("Pansy");
        equipo2.sobrecarga();

        Torneo copaQuidditch = new Torneo("Copa Quidditch");
        copaQuidditch.agregarEquipo(equipo1);
        copaQuidditch.agregarEquipo(equipo2);

        copaQuidditch.mostrarEquipos();

        System.out.println("\nEl torneo se llevará a cabo el día Miércoles 20 de Noviembre del año 2024 a las 15:00");
    }
}

/*
Alumno: Mariano Maldonado
Examen Parcial Algoritmos y Estructuras de datos 2
Carrera: Analisis de Sistemas
 */