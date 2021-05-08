package pl.basics9.gui.cw03.game;

public class Main {
    public static void main(String[] args) {

        AdvancedArena arena = new AdvancedArena(new AdvancedGamerKamien(), new AdvancedGamerS23551());
        arena.play(400);
    }
}
