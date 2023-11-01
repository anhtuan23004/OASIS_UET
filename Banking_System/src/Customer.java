import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<Account>();

    public Customer() {
    }

    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    public String getCustomerInfo() {
        return "Số CMND: " + idNumber
                + ". Họ tên: " + fullName;
    }

    /**
     * Ham them tai khoan.
     * @param account the account of the customer
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * Ham xoa tai khoan.
     * @param account the account of the customer
     */
    public void removeAccount(Account account) {
        ListIterator<Account> it = accountList.listIterator();
        for (ListIterator<Account> iter = it; iter.hasNext();) {
            Account acc = iter.next();
            if (acc.getAccountNumber() == account.getAccountNumber()) {
                it.remove();
                return;
            }
        }
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
