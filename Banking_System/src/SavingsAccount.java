public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * return the account number.
     * @param amount the amount of the account
     */
    @Override
    public void withdraw(double amount) {
        try {
            doWithdrawing(amount);
            this.addTransaction(new Transaction(5, amount, this.balance + amount, this.balance));
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * return the account number.
     * @param amount the amount of the account
     */
    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
            this.addTransaction(new Transaction(4, amount, this.balance - amount, this.balance));
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }
}
