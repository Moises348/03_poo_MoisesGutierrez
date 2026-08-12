package vallegrande.edu.pe.model;

public class Contacto {

    private int id;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String correo;

    // Constructor completo (6 parámetros)
    public Contacto(int id, String nombres, String apellidos, String direccion, String telefono, String correo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Métodos Getters
    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    // Método para imprimir los detalles
    public void mostrarContacto() {
        System.out.println("ID: " + id);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
    }
}