package pl.basics9.gui.cw03.game;

public class Arena {
    IGamer player1;
    IGamer player2;

    int player1Score;
    int player2Score;

    public Arena(IGamer player1, IGamer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void fight(int liczbaRund) {
        System.out.printf("Rozpoczyna pojedynek pomiędzy graczami %s i %s\n", player1.name(), player2.name());
        System.out.printf("Gra toczy się przez liczbę rund: %d\n", liczbaRund);
    }

    private void fightRound(int roundNumber) {

    }
}
