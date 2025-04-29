import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Direccion direccionEditorial = new Direccion("Calle13", 1, "Mendoza", "5507");
        Editorial editorial = new Editorial("Editorial Ejemplo", "www.ej.com", direccionEditorial);
        Genero generoLibro = new Genero("Ficcion", "Novelas de ficción");
        Autor autor1 = new Autor("AutorUno", "Argentina", LocalDate.of(2010, 1, 1));
        Autor autor2 = new Autor("AutorDos", "Chile", LocalDate.of(2000, 2, 20));

        Libro libro1 = new Libro("libroEjemplo", 2023, generoLibro, "123", editorial);
        libro1.agregarAutor(autor1);
        libro1.agregarAutor(autor2);
        libro1.agregarEjemplar(new Ejemplar("EJ1", EstadoEjemplar.DISPONIBLE, libro1));
        libro1.agregarEjemplar(new Ejemplar("EJ2", EstadoEjemplar.DISPONIBLE, libro1));

        Genero generoRevista = new Genero("Ciencia", "Revistas científicas");
        Publicacion revista1 = new Publicacion("Revista1", 2023, generoRevista);
        revista1.agregarEjemplar(new Ejemplar("EJ3", EstadoEjemplar.DISPONIBLE, revista1));

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.registrarPublicacion(libro1);
        biblioteca.registrarPublicacion(revista1);

        Usuario usuario = new Usuario("Residente","Jr","1421436543",null);
        Prestamo prestamo = new Prestamo();
        prestamo.agregarLineaPrestamo(new Ejemplar("EJ1", EstadoEjemplar.PRESTADO, libro1));
        usuario.agregarPrestamo(prestamo);
        usuario.mostrarHistorialPrestamos();

        System.out.println(libro1);
//      System.out.println(autor1);
        System.out.println(usuario);
        System.out.println(revista1);
    }
}
