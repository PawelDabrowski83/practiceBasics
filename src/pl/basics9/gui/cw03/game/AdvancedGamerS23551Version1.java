package pl.basics9.gui.cw03.game;

public class AdvancedGamerS23551Version1 extends AdvancedGamer {
    @Override
    public String name() {
        return "Paweł";
    }

    @Override
    public Zagranie fake() {
        return Zagranie.KAMIEN;
    }

    @Override
    public Zagranie play(Zagranie fake) {
        return Zagranie.beat(fake);
    }

    @Override
    public void result(boolean score, Zagranie enemyMove) {

    }
}
