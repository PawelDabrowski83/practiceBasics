package pl.basics9.gui.cw.cw03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        b1.show();

//        Box<String> b2 = new Box<>("Ala");
//        b2.show();

        DzienTygodnia dzisiaj = DzienTygodnia.CZWARTEK;

        String dzien = "Sobota";

        if (dzien.equals("Sobota")) {
            System.out.println("Dziś jest sobota.");
        }

        if (dzisiaj == DzienTygodnia.PIATEK) {
            System.out.println("Piątek");
        }

        ArrayList<Integer> list = new ArrayList();

        list.add(10);
        list.add(7);
        list.add(3);
        list.add(6);

        list.size();

        list.get(0);

        for (int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
