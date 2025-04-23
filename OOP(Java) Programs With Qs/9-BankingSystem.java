abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 500.0;

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited " + amount + " into Savings Account " + getAccountNumber());
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= MINIMUM_BALANCE) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew " + amount + " from Savings Account " + getAccountNumber());
        } else if (getBalance() - amount < MINIMUM_BALANCE) {
            System.out.println("Withdrawal denied. Minimum balance of " + MINIMUM_BALANCE + " must be maintained.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 10000.0;

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited " + amount + " into Current Account " + getAccountNumber());
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= -OVERDRAFT_LIMIT) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew " + amount + " from Current Account " + getAccountNumber());
        } else if (getBalance() - amount < -OVERDRAFT_LIMIT) {
            System.out.println("Withdrawal denied. Overdraft limit of " + OVERDRAFT_LIMIT + " exceeded.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345");
        CurrentAccount current = new CurrentAccount("CA54321");

        System.out.println("Savings Account:");
        savings.deposit(2000.0);
        savings.withdraw(1000.0);
        savings.withdraw(1600.0);
        System.out.println("Balance: " + savings.getBalance());
        System.out.println();

        System.out.println("Current Account:");
        current.deposit(5000.0);
        current.withdraw(12000.0);
        current.withdraw(3000.0);
        System.out.println("Balance: " + current.getBalance());
    }
}
