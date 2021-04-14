package pl.basics9.gui.cw04.rockPaperScissors;

public enum Zagranie {
    KAMIEN, PAPIER, NOZYCE;

    public static Zagranie beat(Zagranie zagranie) {
        if (zagranie == KAMIEN) {
            return PAPIER;
        }
        if (zagranie == PAPIER) {
            return NOZYCE;
        }
        return KAMIEN;
    }

    public static int check(Zagranie move1, Zagranie move2) {
        if (move1 == move2) {
            return 0;
        }
        if (move1.equals(beat(move2))) {
            return 1;
        }
        return -1;
    }

    }

