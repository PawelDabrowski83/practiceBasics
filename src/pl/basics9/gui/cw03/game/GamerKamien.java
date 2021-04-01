package pl.basics9.gui.cw03.game;

public class GamerKamien implements IGamer {

    @Override
    public Zagranie play() {
        return Zagranie.KAMIEN;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }
}
