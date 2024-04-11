package AssignmentA4;


public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    public BankAccount(int accountNumber,String accountHolderName,double balance, String accountType) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

        public void deposit(double amount){

            balance=balance+amount;
            System.out.println("Deposit of amount"+amount+"is succefull"+"new balance is:"+balance);

        }
         public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
            } else {
                System.out.println("Insufficient funds. Withdrawal failed.");
            }
        }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: $" + balance);
        System.out.println("Account Type: " + accountType);
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount(8976543, "Kim", 1000.0, "Savings");
        BankAccount account1 = new BankAccount(1234566, "Roger", 2000.0, "Savings");

        account.deposit(500.0);
        account.withdraw(200.0);

        // Displaying account details
        account.displayAccountDetails();
    }
}


