package modelos;

public class Salvaje {
    private String nombre;
    private String raza;
    protected int tamano;
    private String tipo =  "Salvaje";
    private String posicionSelva;

    public Salvaje(String nombre, String raza, int tamano, String posicionSelva) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
        this.posicionSelva = posicionSelva;
    }
}
