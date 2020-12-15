package pl.basics6.ppj.c08;

public class Cplx {
    private double realis;
    private double imaginaria;

    public Cplx(double realis, double imaginaria) {
        this.realis = realis;
        this.imaginaria = imaginaria;
    }

    public void add(Cplx number) {
        this.realis += number.realis;
        this.imaginaria += number.imaginaria;
    }

    public void sub(Cplx number) {
        add(new Cplx(number.realis * -1, number.imaginaria * -1));
    }

    public void mul(Cplx number) {
        this.realis = this.realis * number.realis - this.imaginaria * number.imaginaria;
        this.imaginaria = this.imaginaria * number.realis + this.realis * number.imaginaria;
    }

    public void inc() {
        realis += 1;
    }

    public void show() {
        String sign = imaginaria > 0 ? " + " : " - ";
        String value = realis + sign + imaginaria + "i";
        System.out.println(value);
    }
}
