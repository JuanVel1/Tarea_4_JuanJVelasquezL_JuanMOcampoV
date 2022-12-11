package entidades;

/**
 * Ruta
 */
public class Ruta {
    public Ruta(String origen, String destino, double duracion, double precio) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.precio = precio;
    }

    private String origen;
    private String destino;
    private double duracion;
    private double precio;

}