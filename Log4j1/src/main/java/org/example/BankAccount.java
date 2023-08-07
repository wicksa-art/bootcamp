import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BankAccount {

    private double balance;
    private static final Logger logger = LogManager.getLogger(BankAccount.class);

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        logger.info("New account created with balance: " + initialBalance);
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