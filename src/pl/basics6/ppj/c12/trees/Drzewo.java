package pl.basics6.ppj.c12.trees;

public class Drzewo {
    protected boolean wiecznieZielone;
    protected int wysokosc;
    protected String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    @Override
    public String toString() {
        return "Drzewo{" +
                "wiecznieZielone=" + wiecznieZielone +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzewa='" + przekrojDrzewa + '\'' +
                '}';
    }

    public void zerwijOwoc() {
        throw new DrzewoBezowocoweException();
    }
}
