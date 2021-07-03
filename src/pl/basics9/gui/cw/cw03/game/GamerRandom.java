package pl.basics9.gui.cw.cw03.game;

import java.util.concurrent.ThreadLocalRandom;

public class GamerRandom implements IGamer {

    @Override
    public Zagranie play() {
        int random = ThreadLocalRandom.current().nextInt(3);
        switch (random) {
            case 0 -> {
                return Zagranie.PAPIER;
            }
            case 1 -> {
                return Zagranie.KAMIEN;
            }
            case 2 -> {
                return Zagranie.NOZYCE;
            }
        }
        return Zagranie.KAMIEN;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }
}
