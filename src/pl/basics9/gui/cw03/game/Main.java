package pl.basics9.gui.cw03.game;

public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena(new GamerRandom(), new GamerKamien());
        arena.play(100);
    }
}
