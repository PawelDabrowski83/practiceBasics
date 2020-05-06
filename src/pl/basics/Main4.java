package pl.basics;

import java.util.Arrays;

public class Main4 {

    interface AccountService {
        /**
         * It finds an account by owner id
         * @param id owner unique identifier
         * @return account or null
         */
        Account findAccountByOwnerId(long id);
        /**
         * It count the number of account with balance > the given value
         * @param value
         * @return the number of accounts
         */
        long countAccountsWithBalanceGreaterThan(long value);
    }

    // Declare and implement your AccountServiceImpl here
    static class AccountServiceImpl implements AccountService {

        private Account[] accounts;

        public AccountServiceImpl(Account[] accounts) {
            if (accounts != null) {
                this.accounts = Arrays.copyOf(accounts, accounts.length);
            }
        }

        public Account findAccountByOwnerId(long id) {

            return Arrays.stream(this.accounts).filter(n -> n.getOwner().getId() == id).findAny().orElse(null);
        }

        public long countAccountsWithBalanceGreaterThan(long value) {

            return Arrays.stream(this.accounts).filter(n -> n.getBalance() > value).count();
        }
    }


    static class Account {

        private long id;
        private long balance;
        private User owner;

        public Account(long id, long balance, User owner) {
            this.id = id;
            this.balance = balance;
            this.owner = owner;
        }

        public long getId() {
            return id;
        }

        public long getBalance() {
            return balance;
        }

        public User getOwner() {
            return owner;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Account)) return false;

            Account account = (Account) o;

            if (getId() != account.getId()) return false;
            if (getBalance() != account.getBalance()) return false;
            return getOwner().equals(account.getOwner());
        }

        @Override
        public int hashCode() {
            int result = (int) (getId() ^ (getId() >>> 32));
            result = 31 * result + (int) (getBalance() ^ (getBalance() >>> 32));
            result = 31 * result + getOwner().hashCode();
            return result;
        }
    }

    static class User {

        private long id;
        private String firstName;
        private String lastName;

        public User(long id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public long getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
