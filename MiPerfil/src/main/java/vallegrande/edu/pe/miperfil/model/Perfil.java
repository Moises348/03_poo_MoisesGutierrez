package vallegrande.edu.pe.miperfil.model;

public class Perfil {
    private String nombre;
    private String carrera;
    private String semestre;
    private String juegoFav; // Nuevo campo

    public Perfil(String nombre, String carrera, String semestre, String juegoFav) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
        this.juegoFav = juegoFav;
    }

    public String getNombre() { return nombre; }
    public String getCarrera() { return carrera; }
    public String getSemestre() { return semestre; }
    public String getJuegoFav() { return juegoFav; }

    public String obtenerPresentacion() {
        return "¡Perfil Confirmado Exitosamente!\n" +
                "-----------------------------------\n" +
                "Nombre: " + nombre + "\n" +
                "Carrera: " + carrera + "\n" +
                "Semestre: " + semestre + "\n" +
                "Juego Favorito: " + juegoFav;
    }
}