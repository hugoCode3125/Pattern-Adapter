package ma.horse.adapter;

import ma.horse.computer.HDMI;
import ma.horse.computer.Vga;

public class HdmiVgaAdapter implements Vga {
    private HDMI hdmi;

    @Override
    public void print(String message) {
        System.out.println("============ Adapter ============");
        byte[] data = message.getBytes();
        hdmi.View(data);
        System.out.println("============= / Adapter ============");
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
