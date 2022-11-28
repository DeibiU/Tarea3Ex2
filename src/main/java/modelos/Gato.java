package modelos;

public class Gato extends Mascota implements Felino {

    private int bonus= 13;

    public Gato(String nombre, String raza, int tamano) {
        super(nombre, raza, tamano);
    }

    public void maullar() {
        System.out.println("miau");
    }

    public void cazar() {
        System.out.println("RASPINGAZZO! daño implementado " + poderGarras * tamano + bonus + " dorikis.");
    }
}
