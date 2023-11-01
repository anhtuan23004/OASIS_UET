public class InsufficientFundsException extends BankException {
    /**
     * Tien quy khong du.
     * @param amount the amount of the account
     */
    public InsufficientFundsException(double amount) {
        super("Số dư tài khoản không đủ $" + String.format("%.2f", amount)
                + " để thực hiện giao dịch");
    }
}
