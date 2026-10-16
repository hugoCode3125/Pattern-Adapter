package ma.horse;

import ma.horse.adapter.HdmiVgaAdapter;
import ma.horse.computer.Ecran;
import ma.horse.computer.TV;
import ma.horse.computer.UniteCentral;

public class Main {
    public static void main(String[] args) {

        UniteCentral uniteCentral = new UniteCentral();
        uniteCentral.setVga(new Ecran());
        uniteCentral.print("Bonjour boss");

        HdmiVgaAdapter adapter = new HdmiVgaAdapter();
        adapter.setHdmi(new TV());
        uniteCentral.setVga(adapter);
        uniteCentral.print("Bonjour boss");

    }
}