package pl.basics6.ppj.c12.trees;

public class DrzewoIglaste extends Drzewo {

    protected int iloscIgiel;
    protected double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +"DrzewoIglaste{" +
                "iloscIgiel=" + iloscIgiel +
                ", dlugoscSzyszki=" + dlugoscSzyszki +
                '}';
    }
}
