package pl.basics9.gui.cw03.game;

public abstract class AdvancedGamer {
    public abstract String name();
    public abstract Zagranie fake();
    public abstract Zagranie play(Zagranie fake);
    public abstract void result(boolean score, Zagranie enemyMove);
}
