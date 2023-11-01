import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    /**
     * Ham nap tien vao tai khoan.
     * @param amount so tien nap vao tai khoan
     */
    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     * Ham rut tien tu tai khoan.
     * @param amount so tien rut khoi tai khoan
     */
    private void withdraw(double amount) {
        if (amount > 0) {
            if (amount < balance) {
                balance -= amount;
            } else {
                System.out.println("So tien ban rut vuot qua so du!");
            }
        } else {
            System.out.println("So tien ban rut ra khong hop le!");
        }
    }

    /**
     * Ham them mot giao dich vao danh sach giap dich.
     * @param amount so tien giao dich
     * @param operation ten loai giao dich
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
            transitionList.add(new Transaction(operation, amount, balance));
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
            transitionList.add(new Transaction(operation, amount, balance));
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Ham in ra giao dich.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction current = transitionList.get(i);
            String operation = current.getOperation();
            double amount = current.getAmount();
            double balance = current.getBalance();
            String amountStr = String.format("%.2f", amount);
            String balanceStr = String.format("%.2f", balance);
            if (operation.equals(Transaction.DEPOSIT)) {
                System.out.println(String.format("Giao dich %d: Nap tien $%s. So du luc nay: $%s.",
                    (i + 1), amountStr, balanceStr));
            } else if (operation.equals(Transaction.WITHDRAW)) {
                System.out.println(String.format("Giao dich %d: Rut tien $%s. So du luc nay: $%s.",
                        (i + 1), amountStr, balanceStr));
            }
        }
    }
}
