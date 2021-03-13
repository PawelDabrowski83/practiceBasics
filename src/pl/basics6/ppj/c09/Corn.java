package pl.basics6.ppj.c09;

/*
twórz klasęCorn, której kostruktor przyjmie i zainicjuje pole cornCount. Następnie przygotuj metodę makePopcorn
zwróci tablicę obiektów klasy Popcorn w ilości z przedziału od 0 do cornCount.
 */
public class Corn {
    int cornCount;

    public Corn() {
        this.cornCount = 0;
    }

    public Corn(int cornCount) {
        this.cornCount = cornCount;
    }

    private int randomizePopcorns() {
        if (cornCount == 0) {
            return 0;
        }
        return (int) (Math.random() * cornCount + 1);
    }

    public Popcorn[] makePopcorn() {
        Popcorn[] popcorns = new Popcorn[randomizePopcorns()];
        for (int i = 0; i < popcorns.length; i++) {
            popcorns[i] = new Popcorn();
        }
        return popcorns;
    }

}
