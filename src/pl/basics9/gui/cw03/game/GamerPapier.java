package pl.basics9.gui.cw03.game;

public class GamerPapier implements IGamer {

    @Override
    public Zagranie play() {
        return Zagranie.PAPIER;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }
}
