package pl.basics10.iterable;

public class Main {
    public static void main(String[] args) {


        IterNap napis = new IterNap("Ala ma kota");

        for (char z : napis) { // Ala ma kota
            System.out.print(z + " ");
        }

        char c = "test".charAt(0);


        for (char z : napis) { // Ala ma kota
            System.out.print(z + " ");
        }

    }
}
