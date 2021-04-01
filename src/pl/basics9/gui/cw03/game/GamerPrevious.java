package pl.basics9.gui.cw03.game;

public class GamerPrevious implements IGamer {

    private Zagranie opponentsLastPlay;

    @Override
    public Zagranie play() {
        if (opponentsLastPlay == null) {
            return Zagranie.KAMIEN;
        }
        return Zagranie.beat(opponentsLastPlay);
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }
}
