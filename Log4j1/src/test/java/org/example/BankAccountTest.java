import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;
    private static final Logger logger = LogManager.getLogger(BankAccountTest.class);

    @BeforeEach
    public void setup() {
        account = new BankAccount(100);
        logger.info("Account setup with balance: " + account.getBalance());
    }

    @Test
    public void testDeposit() {
        account.deposit(50);
        logger.info("Deposited 50. Balance: " + account.getBalance());
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.withdraw(50);
        logger.info("Withdrew 50. Balance: " + account.getBalance());
        assertEquals(50, account.getBalance());
    }

    @Test
    public void testDepositNegativeAmount() {
        logger.info("Trying to deposit negative amount.");
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50);
        });
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        logger.info("Trying to withdraw more than the balance.");
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200);
        });
    }
}
