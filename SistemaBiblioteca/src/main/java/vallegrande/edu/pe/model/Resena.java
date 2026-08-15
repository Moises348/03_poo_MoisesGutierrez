package vallegrande.edu.pe.model;

public class Resena {

    private int id;
    private String titulo;
    private String comentario;
    private double calificacion;

    public Resena(int id, String titulo, String comentario, double calificacion) {
        this.id = id;
        this.titulo = titulo;
        this.comentario = comentario;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getComentario() {
        return comentario;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void mostrarResena() {
        System.out.println("ID Reseña: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Comentario: " + comentario);
        System.out.println("Calificación: " + calificacion + " / 5");
        System.out.println("------------------------------------");
    }
}
