import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;
    private DBManager db;
    private static final Logger logger = LogManager.getLogger(BankAccountTest.class);

    @BeforeEach
    public void setup() throws SQLException {
        db = new DBManager("jdbc:mysql://localhost:3306/testdb", "root", "pMh47KTYf~3;y");
        account = new BankAccount(100, 1000.00, db);
    }


    @Test
    public void testDeposit() throws SQLException {
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw() throws SQLException {
        account.withdraw(50);
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
