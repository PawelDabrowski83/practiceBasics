package pl.basics9.gui.cw.cw03.game;

import java.util.ArrayList;
import java.util.List;

public class AdvancedGamerS23551 extends AdvancedGamer {

    Zagranie toPlay = Zagranie.NOZYCE;
    Zagranie toFake = Zagranie.KAMIEN;
    Zagranie lastEnemyFake;
    List<Zagranie> enemyMoves = new ArrayList<>();

    @Override
    public String name() {
        return "Paweł";
    }

    @Override
    public Zagranie fake() {
        return toFake;
    }

    @Override
    public Zagranie play(Zagranie fake) {
        lastEnemyFake = fake;
        return toPlay;
    }

    @Override
    public void result(boolean score, Zagranie enemyMove) {
        enemyMoves.add(enemyMove);

        boolean isEnemyConsistent = true;
        if (lastEnemyFake != enemyMove) {
            isEnemyConsistent = false;
        }
        if (!score) {
            if (isEnemyConsistent) {
                toFake = enemyMove;
                toPlay = Zagranie.beat(toFake);
            } else {
                toFake = enemyMove;
                toPlay = Zagranie.beat(toFake);
            }

        }

    }
}
