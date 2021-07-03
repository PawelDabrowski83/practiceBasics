package pl.basics9.gui.cw.cw04.task1;

public class Czlowiek implements IRyba, IPtak, IBiegacz {
    @Override
    public String toString() {
        plywaj();
        lataj();
        biegaj();
        return super.toString();
    }
}
