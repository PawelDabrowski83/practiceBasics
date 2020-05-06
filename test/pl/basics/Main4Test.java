package pl.basics;

import org.junit.Before;
import org.junit.Test;
import pl.basics.Main4.Account;
import pl.basics.Main4.User;
import pl.basics.Main4.AccountService;
import pl.basics.Main4.AccountServiceImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class Main4Test {

    User[] users;
    Account[] accounts;


    @Before
    public void setUp() {

        users = new User[]{new User(1, "name", "lastname"),
                new User(2, "Janina", "Kaczyńska"),
                new User(3, "Karol", "Deptak"),
                new User(4, "Jarema", "Libicki"),
                new User(5, "Teresa", "Biała")};
        accounts = new Account[]{new Account(1, 100, users[0]), new Account(2, 0, users[1]),
                new Account(3, 100500L, users[2]), new Account(4, 100L, users[2]),
                new Account(5, 7000, users[2]), new Account(6, 0, users[2]),
                new Account(7, 1999L, users[3]), new Account(8, 800, users[3])
        };
    }

    @Test
    public void shouldAccountImplFindAccountByOwnerIdWork() {

        // given
        AccountService accountService = new AccountServiceImpl(accounts);

        assertNull(accountService.findAccountByOwnerId(19));
        assertEquals(new Account(1, 100, users[0]), accountService.findAccountByOwnerId(1));
        assertEquals(new Account(2, 0, users[1]), accountService.findAccountByOwnerId(2));

    }

    @Test
    public void shouldAccountImplCountAccountsGreaterWork() {

        // given
        AccountService accountService = new AccountServiceImpl(accounts);

        assertEquals(6, accountService.countAccountsWithBalanceGreaterThan(0));
        assertEquals(3, accountService.countAccountsWithBalanceGreaterThan(1000));
    }
}
