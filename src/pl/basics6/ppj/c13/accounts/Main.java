package pl.basics6.ppj.c13.accounts;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(1000, 1000, 100000);
        CreditCard creditCard = account.getCreditCard();
        DebetCard debetCard = account.getDebetCard();

        try {
            creditCard.pay(100);
            creditCard.pay(10000000);
        } catch (NoEnoughFunds e) {
            e.printStackTrace();
        }

    }
}
