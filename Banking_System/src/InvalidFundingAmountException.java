public class InvalidFundingAmountException extends BankException {
    /**
     * Khoan du.
     * @param amount the amount of the account
     */
    public InvalidFundingAmountException(double amount) {
        super("Số tiền không hợp lệ: $" + String.format("%.2f", amount));
    }
}
