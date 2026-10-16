package ma.horse.computer;

public class SuperVP implements HDMI, Vga {
    @Override
    public void View(byte[] data) {
        String message = new String(data);
        System.out.println("++++++++++++++++++++ Super VP Hdmi++++++++++++++++++++++++");
        System.out.println(message);
        System.out.println("++++++++++++++++++++ Super VP Hdmi+++++++++++++++++++++++");
    }

    @Override
    public void print(String message) {
        System.out.println("------------------ Super VP Vga--------------------");
        System.out.println(message);
        System.out.println("------------------ SuperVP  Vga---------------------");
    }
}
