package pl.basics9.gui.cw.cw04.task1;

public class Kaczka implements IRyba, IPtak {
    @Override
    public String toString() {
        plywaj();
        lataj();
        return super.toString();
    }
}
