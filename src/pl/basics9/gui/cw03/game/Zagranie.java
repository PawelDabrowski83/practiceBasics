package pl.basics9.gui.cw03.game;

public enum Zagranie {
    KAMIEN,
    PAPIER,
    NOZYCE;

    public static int duel(Zagranie z1, Zagranie z2) {
        if (z1 == z2) {
            return 0;
        }
        return beat(z1) == z2 ? 1 : -1;
    }

    public static Zagranie beat(Zagranie move) {
        if (move == KAMIEN) {
            return PAPIER;
        }
        if (move == NOZYCE) {
            return KAMIEN;
        }
        return NOZYCE;
    }

}


