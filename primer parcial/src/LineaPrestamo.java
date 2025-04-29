import java.util.Date;

public class LineaPrestamo {
    private Date fechaDevolucionEstimada;
    private Ejemplar ejemplar;

    public LineaPrestamo(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
        this.fechaDevolucionEstimada = new Date();
    }



    public Date getFechaDevolucionEstimada() {
        return fechaDevolucionEstimada;
    }
}
