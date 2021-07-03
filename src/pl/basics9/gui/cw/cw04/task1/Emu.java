package pl.basics9.gui.cw.cw04.task1;

public class Emu implements IPtak, IBiegacz{

    @Override
    public String toString() {
        lataj();
        biegaj();
        return super.toString();
    }
}
