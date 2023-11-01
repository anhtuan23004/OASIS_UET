public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 2;
    public static final int TYPE_WITHDRAW_CHECKING = 3;
    public static final int TYPE_DEPOSIT_SAVINGS = 4;
    public static final int TYPE_WITHDRAW_SAVINGS = 5;
    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    /**
     * Constructs a Transaction.
     * @param type the type of transaction
     * @param amount the amount of the transaction
     * @param initialBalance the initial balance of the transaction
     * @param finalBalance the final balance of the transaction
     */
    public Transaction(int type, double amount,
                       double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * return the type of the transaction.
     * @param type the type of the transaction
     * @return type of the transaction
     */
    private String getTransactionTypeString(int type) {
        if (type == TYPE_DEPOSIT_CHECKING) {
            return "Nạp tiền vãng lai";
        } else if (type == TYPE_WITHDRAW_CHECKING) {
            return "Rút tiền vãng lai";
        } else if (type == TYPE_DEPOSIT_SAVINGS) {
            return "Nạp tiền tiết kiệm";
        } else if (type == TYPE_WITHDRAW_SAVINGS) {
            return "Rút tiền tiết kiệm";
        } else {
            return "Không tìm thấy";
        }
    }

    /**
     * Kieu giao dich.
     * @return kieu giao dich
     */
    public String getTransactionSummary() {
        return "- Kiểu giao dịch: " + getTransactionTypeString(type)
                + ". Số dư ban đầu: $" + String.format("%.2f", initialBalance)
                + ". Số tiền: $" + String.format("%.2f", amount)
                + ". Số dư cuối: $" + String.format("%.2f", finalBalance) + ".";
    }
}
