package pl.basics6.ppj.c12.trees;

public class DrzewoLisciaste extends Drzewo {

    protected int ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "DrzewoLisciaste{" +
                "ksztaltLiscia=" + ksztaltLiscia +
                '}';
    }
}
