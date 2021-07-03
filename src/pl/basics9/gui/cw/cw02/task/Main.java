package pl.basics9.gui.cw.cw02.task;

public class Main {
    public static void main(String[] args) {
        Kot kot = new Kot();
        Pies pies = new Pies();
        Krowa krowa = new Krowa();

        Zwierze[] zwierzeta = {kot, pies, krowa};

        for(Zwierze zwierze : zwierzeta) {
            System.out.println(zwierze.getClass().getSimpleName());
            System.out.println(zwierze.dajGlos());
            System.out.println(zwierze.wiek());
            System.out.println();
        }
    }
}
