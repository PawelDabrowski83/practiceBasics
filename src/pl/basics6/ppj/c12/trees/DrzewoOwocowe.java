package pl.basics6.ppj.c12.trees;

public class DrzewoOwocowe extends DrzewoLisciaste {

    protected String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "DrzewoOwocowe{" +
                "nazwaOwoca='" + nazwaOwoca + '\'' +
                '}';
    }

    @Override
    public void zerwijOwoc() {
        System.out.println("zerwano owoc: " + nazwaOwoca);
    }
}
