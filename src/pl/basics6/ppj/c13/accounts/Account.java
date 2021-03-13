package pl.basics6.ppj.c13.accounts;

public class Account {
    private double balance;
    private double dailyDebet;
    private double credit;
    private CreditCard creditCard;
    private DebetCard debetCard;

    public Account(double balance, double dailyDebet, double credit) {
        this.balance = balance;
        this.dailyDebet = dailyDebet;
        this.credit = credit;
        this.creditCard = new CreditCard(this);
        this.debetCard = new DebetCard(this);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDailyDebet() {
        return dailyDebet;
    }

    public void setDailyDebet(double dailyDebet) {
        this.dailyDebet = dailyDebet;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public DebetCard getDebetCard() {
        return debetCard;
    }

    public void setDebetCard(DebetCard debetCard) {
        this.debetCard = debetCard;
    }

    public void payDebet(double amount) throws NoEnoughFunds {
        if (amount > dailyDebet) {
            throw new NoEnoughFunds(amount - dailyDebet);
        }
        dailyDebet -= amount;
        System.out.println("Payment complete: " + amount);
    }

    public void payCredit(double amount) throws NoEnoughFunds {
        if (amount > credit) {
            throw new NoEnoughFunds(amount - credit);
        }
        credit -= amount;
        System.out.println("Payment complete: " + amount);

    }
}
