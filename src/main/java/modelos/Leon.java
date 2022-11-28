package modelos;

public class Leon extends Salvaje implements Felino {


    public Leon(String nombre, String raza, int tamano, String posicionSelva) {
        super(nombre, raza, tamano, posicionSelva);
    }

    public void maullar() {
        System.out.println("miausote");
    }

    public void cazar() {
        System.out.println("RASPINGAZZO! daño implementado " + poderGarras * tamano + " dorikis.");
    }
}