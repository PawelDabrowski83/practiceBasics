package pl.basics6.inheritance;

public interface Writer {

    default void write(){
        System.out.println("Default");
    }

}
