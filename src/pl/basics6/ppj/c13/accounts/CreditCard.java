package pl.basics6.ppj.c13.accounts;

public class CreditCard extends Card {

   public CreditCard(Account account) {
      super(account);
   }

   public void pay(double amount) throws NoEnoughFunds {
      getAccount().payCredit(amount);
   }
}
