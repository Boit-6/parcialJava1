import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones = new ArrayList<>();

    public void registrarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }
}
