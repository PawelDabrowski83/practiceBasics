package pl.basics6.ppj.c13.accounts;

public class Card {
    private Account account;

    public Card(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void pay(double amount) throws NoEnoughFunds {
        System.out.println("This class should be abstract");
    }
}
