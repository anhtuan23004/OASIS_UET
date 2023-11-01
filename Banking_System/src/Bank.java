import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<Customer>();

    /**
     * Ghi du lieu.
     * @param inputStream the input stream
     */
    public void readCustomerList(InputStream inputStream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        Customer curCustomer = null;
        try {
            while ((line = reader.readLine()) != null) {
                if (Character.isAlphabetic(line.charAt(0))) {
                    String[] tokens = line.split("\\s+(?=\\d)");
                    if (curCustomer != null) {
                        customerList.add(curCustomer);
                    }
                    long idNumber = Long.parseLong(tokens[1]);
                    String fullName = tokens[0];
                    curCustomer = new Customer(idNumber, fullName);
                } else if (Character.isDigit(line.charAt(0)) && curCustomer != null) {
                    String[] tokens = line.split("\\s+");
                    long accountNumber = Long.parseLong(tokens[0]);
                    String accountType = tokens[1];
                    double balance = Double.parseDouble(tokens[2]);
                    if (accountType.equals(Account.CHECKING)) {
                        curCustomer.addAccount(new CheckingAccount(accountNumber, balance));
                    } else if (accountType.equals(Account.SAVINGS)) {
                        curCustomer.addAccount(new SavingsAccount(accountNumber, balance));
                    }
                }
            }
            if (curCustomer != null) {
                customerList.add(curCustomer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Ham trả về dữ liệu danh sách khách hàng sắp xếp tăng dần theo họ tên khách hàng.
     * @return Customer list
     */
    public String getCustomersInfoByNameOrder() {
        List<Customer> cus = new ArrayList<Customer>(this.customerList);
        cus.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        StringBuilder ans = new StringBuilder();
        for (Customer c : cus) {
            ans.append(c.getCustomerInfo()).append(".\n");
        }
        return ans.toString();
    }

    /**
     * Ham trả về dữ liệu danh sách khách hàng sắp xếp tăng dần theo số CMND.
     * @return customer list
     */
    public String getCustomersInfoByIdOrder() {
        List<Customer> cus = new ArrayList<Customer>(this.customerList);
        cus.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getIdNumber() > o2.getIdNumber()) {
                    return 1;
                } else if (o1.getIdNumber() < o2.getIdNumber()) {
                    return -1;
                }
                return 0;
            }
        });
        StringBuilder ans = new StringBuilder();
        for (Customer c : cus) {
            ans.append(c.getCustomerInfo()).append(".\n");
        }
        return ans.toString();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
