package pl.basics9.gui.cw.cw02.task3;

public class TooBigSquareException extends IllegalArgumentException {
    public TooBigSquareException(int value) {
        super("Maximum length is " + value);
    }
}
