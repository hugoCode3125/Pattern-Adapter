package ma.horse.computer;

public class Ecran implements Vga {
    @Override
    public void print(String message) {
        System.out.println("******* Ecran ********");
        System.out.println("Ecran: " + message);
        System.out.println("********* Ecran **********");
    }
}
