package pl.basics9.gui.cw03.game;

public class GamerNozyce implements IGamer {
    @Override
    public Zagranie play() {
        return Zagranie.NOZYCE;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }
}
