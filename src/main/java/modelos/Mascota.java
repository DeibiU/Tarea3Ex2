package modelos;

public class Mascota {
    private String nombre;
    private String raza;
    protected int tamano;
    private String tipo =  "Domestico";

    public Mascota(String nombre, String raza, int tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
    }
}
