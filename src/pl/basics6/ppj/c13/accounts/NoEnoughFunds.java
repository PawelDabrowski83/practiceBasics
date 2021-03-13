package pl.basics6.ppj.c13.accounts;

public class NoEnoughFunds extends Exception {

    public NoEnoughFunds(double amount) {
        super("Limit exceeded by: " + amount);
    }
}
