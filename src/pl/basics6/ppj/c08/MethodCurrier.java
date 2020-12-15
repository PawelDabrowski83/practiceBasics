package pl.basics6.ppj.c08;

public class MethodCurrier {

    public void setValue(int value) {
        System.out.println("integer: " + value);
        value *= 10;
        System.out.println("MOD: integer: " + value);
    }

    public void setValue(float value) {
        System.out.println("float: " + value);
        value *= 10;
        System.out.println("MOD: float: " + value);
    }

    public void setValue(Number number) {
        System.out.print("zmienna typu Number: ");
        number.showValue();
        number.value *= 10;
        System.out.print("MOD zmienna typu Number: ");
        number.showValue();
    }
}
