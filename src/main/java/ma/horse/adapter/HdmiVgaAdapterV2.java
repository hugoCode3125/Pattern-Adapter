package ma.horse.adapter;

import ma.horse.computer.HDMI;
import ma.horse.computer.TV;
import ma.horse.computer.Vga;

public class HdmiVgaAdapterV2  extends TV implements Vga {

    @Override
    public void print(String message) {
        System.out.println("============ Adapter ============");
        byte[] data = message.getBytes();
        super.View(data);
        System.out.println("============= / Adapter ============");
    }

}
