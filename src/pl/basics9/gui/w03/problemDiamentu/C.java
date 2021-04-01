package pl.basics9.gui.w03.problemDiamentu;

public class C implements A, B {

    public C() {
        xxx();
    }

    @Override
    public void xxx() {
        // ((A)this).xxx(); // stackoverflow
        A.super.xxx();
    }

    public static void main(String[] args) {
        new C().xxx();
    }
}
