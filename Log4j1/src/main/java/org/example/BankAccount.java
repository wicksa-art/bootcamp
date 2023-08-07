import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.SQLException;

public class BankAccount {
    private int id;
    private double balance;
    private DBManager db;
    private static final Logger logger = LogManager.getLogger(BankAccount.class);

    public BankAccount(int id, double initialBalance, DBManager db) throws SQLException {
        this.id = id;
        this.balance = initialBalance;
        this.db = db;
        db.createAccount(this);
        logger.info("New account created with id: " + id + ", balance: " + initialBalance);
    }

    public int getId() {
        return id;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            logger.error("Cannot deposit negative amounts.");
            throw new IllegalArgumentException("Cannot deposit negative amounts.");
        }
        this.balance += amount;
        logger.info("Deposited " + amount + ". Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            logger.error("Cannot withdraw more than the current balance.");
            throw new IllegalArgumentException("Cannot withdraw more than the current balance.");
        }
        this.balance -= amount;
        logger.info("Withdrew " + amount + ". Current balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}