import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    private List<LineaPrestamo> lineas = new ArrayList<>();

    public void agregarLineaPrestamo(Ejemplar ejemplar) {
        LineaPrestamo linea = new LineaPrestamo(ejemplar);
        lineas.add(linea);
    }
}
