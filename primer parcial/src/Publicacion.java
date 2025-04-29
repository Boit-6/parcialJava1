import java.util.ArrayList;
import java.util.List;

public class Publicacion {
    protected String titulo;
    protected int anio;
    protected List<Ejemplar> ejemplares = new ArrayList<>();
    protected Genero genero;

    public Publicacion(String titulo, int anio, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
    }

    public List<Ejemplar> getEjemplaresDisponibles() {
        List<Ejemplar> disponibles = new ArrayList<>();
        for (Ejemplar ejemplar : ejemplares) {
            if (ejemplar.estaDisponible()) {
                disponibles.add(ejemplar);
            }
        }
        return disponibles;
    }

    public void agregarEjemplar(Ejemplar ej3) {
    }
}
