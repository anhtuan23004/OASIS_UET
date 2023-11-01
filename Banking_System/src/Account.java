import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<Transaction>();

    public Account() {
    }

    /**
     * Constructs an Account.
     * @param accountNumber the account number of the account
     * @param balance the balance of the account
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Kiem tra tinh hop le cua giao dich rut tien.
     * @param amount the amount to pay
     * @throws BankException thrown if the amount is not valid
     */
    public void doWithdrawing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else {
            if (this instanceof SavingsAccount && amount > 1000.0) {
                throw new InsufficientFundsException(amount);
            } else if (balance < amount) {
                throw new InsufficientFundsException(amount);
            } else {
                if (this instanceof SavingsAccount && this.getBalance() - amount < 5000.0) {
                    throw new InsufficientFundsException(amount);
                } else {
                    balance -= amount;
                }
            }
        }
    }

    /**
     * Kiem tra tinh hop le cua giao dich nap tien.
     * @param amount the amount to allocate
     * @throws BankException thrown if the amount is not valid
     */
    public void doDepositing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else {
            balance += amount;
        }
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    /**
     * Ham tra ve lich su giao dich.
     * @return history of the transaction
     */
    public String getTransactionHistory() {
        String his = "Lịch sử giao dịch của tài khoản " + getAccountNumber() + ":\n";
        ListIterator<Transaction> it = transactionList.listIterator();
        for (ListIterator<Transaction> iter = it; iter.hasNext();) {
            Transaction transaction = iter.next();
            his += transaction.getTransactionSummary() + "\n";
        }
        return his;
    }

    /**
     * Ham them giao dich.
     * @param transaction the transaction
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Account) {
            Account that = (Account) o;
            return this.getAccountNumber() == that.getAccountNumber();
        } else {
            return false;
        }
    }
}
