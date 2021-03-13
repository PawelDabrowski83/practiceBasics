package pl.basics6.ppj.c12.trees;

public class Main {
    public static void main(String[] args) {
        lasTest();
    }

    public static void lasTest() {
        Drzewo lipa = new Drzewo(true, 12, "normalny");
        Drzewo bez = new Drzewo(false, 11, "tak");
        DrzewoLisciaste dab = new DrzewoLisciaste(true, 8, "mały", 17);
        DrzewoLisciaste olsza = new DrzewoLisciaste(true, 0, "nieznany", 0);
        DrzewoIglaste sosna = new DrzewoIglaste(true, 29, "prosty", 17, 3.14);
        DrzewoIglaste swierk = new DrzewoIglaste(false, 18, "prosty", 1024, 0.99);
        DrzewoOwocowe sliwka = new DrzewoOwocowe(false, 12, "ukośny", 1, "śliwka");
        DrzewoOwocowe jablon = new DrzewoOwocowe(false, 9, "normalny", 2, "jabłko");

        Drzewo[] las = {jablon, sliwka, swierk, sosna, olsza, dab, bez, lipa};

        for (Drzewo d : las) {
            System.out.println(d);
            try {
                d.zerwijOwoc();
            } catch (DrzewoBezowocoweException e) {
                System.out.println("To nie jest drzewo owocowe");
            }
            System.out.println("====================================");
        }
    }
}
