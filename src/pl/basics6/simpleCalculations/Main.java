package pl.basics6.simpleCalculations;

public class Main {
    public static void main(String[] args) {
        System.out.println(hash(78));
        System.out.println(hash(41));
        System.out.println(hash(33));
    }

    public static int hash(int k){
        return ((k * 7) + 42) % 71;
    }
}
