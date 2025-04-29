import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private List<Prestamo> prestamos;

    public Usuario(String nombre, String apellido, String dni, List<Prestamo> prestamos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.prestamos = prestamos;
    }

    public void agregarPrestamo(Prestamo prestamo) {
    }

    public void mostrarHistorialPrestamos() {

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", prestamos=" + prestamos +
                '}';
    }
}
