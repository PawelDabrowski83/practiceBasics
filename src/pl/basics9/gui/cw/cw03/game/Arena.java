package pl.basics9.gui.cw.cw03.game;

public class Arena {
    final IGamer player1;
    final IGamer player2;

    int player1Score;
    int player2Score;
    int roundNo;

    public Arena(IGamer player1, IGamer player2) {
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
        Zagranie move1 = player1.play();
        Zagranie move2 = player2.play();

        int result = Zagranie.duel(move1, move2);

        IGamer winner = result == 1 ? player1 :
                        result == -1 ? player2 : null;
        if (winner != null) {
            if (winner.equals(player1)) {
                player1Score++;
            } else {
                player2Score++;
            }
        }

        if (winner == null) {
            System.out.println("Remis!");
        } else {
            System.out.printf("Wygrał gracz %s\n", winner.name());
        }
        System.out.printf("Zagrano %s na %s\n\n", move1.name(), move2.name());

    }

    private void presentScore() {
        System.out.println("======================");
        System.out.printf("Wynik po rozegraniu %d rund\n", roundNo);
        System.out.printf("Gracz %s wynik %d\n", player1.name(), player1Score);
        System.out.printf("Gracz %s wynik %d\n", player2.name(), player2Score);
        IGamer winner = player1Score == player2Score ? null :
                player1Score > player2Score ? player1 : player2;
        if (winner == null) {
            System.out.println("Remis!");
        } else {
            System.out.printf("Wygrywa: %s\n", winner.name());
        }


    }
}
