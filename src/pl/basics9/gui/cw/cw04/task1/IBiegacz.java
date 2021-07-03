package pl.basics9.gui.cw.cw04.task1;

public interface IBiegacz {

    default void biegaj() {
        System.out.println("Potrafię biegać");
    }
}
