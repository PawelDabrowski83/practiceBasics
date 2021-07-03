package pl.basics9.gui.cw.cw03.game;

public class AdvancedGamerKamien extends AdvancedGamer {
    IGamer gamer = new GamerKamien();
    @Override
    public String name() {
        return gamer.name();
    }

    @Override
    public Zagranie fake() {
        return gamer.play();
    }

    @Override
    public Zagranie play(Zagranie fake) {
        return gamer.play();
    }

    @Override
    public void result(boolean score, Zagranie enemyMove) {

    }
}
