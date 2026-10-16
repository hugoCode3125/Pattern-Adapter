package ma.horse.computer;

public class VideoProjecteur implements Vga {
    @Override
    public void print(String message) {
        System.out.println("******** Projecteur *******");
        System.out.println("Projecteur: " + message);
        System.out.println("********* Projecteur **********");
    }
}
