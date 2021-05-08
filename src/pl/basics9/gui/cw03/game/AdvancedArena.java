package pl.basics9.gui.cw03.game;

public class AdvancedArena {

    private final AdvancedGamer player1;
    private final AdvancedGamer player2;
    private int p1score;
    private int p2score;
    int roundNo;

    public AdvancedArena(AdvancedGamer player1, AdvancedGamer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play(int liczbaRund) {
        fight(liczbaRund);
    }

    public void fight(int liczbaRund) {
        System.out.printf("Rozpoczyna pojedynek pomiędzy graczami %s i %s\n", player1.name(), player2.name());
        System.out.printf("Gra toczy się przez liczbę rund: %d\n", liczbaRund);
        while(liczbaRund-- > 0) {
            System.out.printf("Runda %d\n", ++roundNo);
            fightRound();
        }
        presentScore();

    }

    private void fightRound() {
        Zagranie fake1 = player1.fake();
        Zagranie fake2 = player2.fake();

        Zagranie move1 = player1.play(fake2);
        Zagranie move2 = player2.play(fake1);

        int result = Zagranie.duel(move1, move2);

        AdvancedGamer winner = result == 1 ? player1 :
                result == -1 ? player2 : null;
        if (winner != null) {
            if (winner.equals(player1)) {
                p1score++;
                player1.result(true, move2);
                player2.result(false, move1);
            } else {
                p2score++;
                player2.result(true, move1);
                player1.result(false, move2);
            }
        }

        if (winner == null) {
            System.out.println("Remis!");
            player1.result(false, move2);
            player2.result(false, move1);
        } else {
            System.out.printf("Wygrał gracz %s\n", winner.name());
        }
        System.out.printf("Zagrano %s na %s\n\n", move1.name(), move2.name());

    }

    private void presentScore() {
        System.out.println("======================");
        System.out.printf("Wynik po rozegraniu %d rund\n", roundNo);
        System.out.printf("Gracz %s wynik %d\n", player1.name(), p1score);
        System.out.printf("Gracz %s wynik %d\n", player2.name(), p2score);
        AdvancedGamer winner = p1score == p2score ? null :
                p1score > p2score ? player1 : player2;
        if (winner == null) {
            System.out.println("Remis!");
        } else {
            System.out.printf("Wygrywa: %s\n", winner.name());
        }


    }
}
