import java.util.ArrayList;
import java.util.List;

public class Libro extends Publicacion {
    private String isbn;
    private List<Autor> autores = new ArrayList<>();
    private Editorial editorial;

    public Libro(String titulo, int anio, Genero genero, String isbn, Editorial editorial) {
        super(titulo, anio, genero);
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public void agregarEjemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", autores=" + autores +
                ", editorial=" + editorial +
                '}';
    }
}
