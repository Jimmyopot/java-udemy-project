public class BankAccount {
    private String number = "";
    private double balance = 0;
    private String customerName = "Donny";
    private String customerEmail = "donny@gmail.com";
    private String customerPhone = "";

    public BankAccount() {
        // This is CONSTRUCTOR CHAINING (this)
        this("78930", 2.50, "Jane", "jane@gmail.com", "091883998");
    }

    // constructor
    public BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.55, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $ "
                + balance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if (balance - withdrawAmount < 0) {
            System.out.println("Insufficient funds! you only have $ " + balance +
                    " in your account.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount +
                    " processed, remaining balance = $" + balance);
        }
    }
}
