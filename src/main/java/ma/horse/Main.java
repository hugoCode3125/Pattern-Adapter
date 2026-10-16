package ma.horse;

import ma.horse.computer.Ecran;
import ma.horse.computer.UniteCentral;

public class Main {
    public static void main(String[] args) {

        UniteCentral uniteCentral = new UniteCentral();
        uniteCentral.setVga(new Ecran());
        uniteCentral.print("Bonjour boss");
    }
}