package ex_30_Exceptions;

public class Custom_Exception_Main_Class {
    public static void main(String[] args) {
        BankAccount acct = new BankAccount("Asha", 1000.0);

        //acct.deposit(0);
        try {
            System.out.println("Balance before: " + acct.getBalance());
            acct.withdraw(1560); // will trigger InsufficientFundsException
            System.out.println("Balance after: " + acct.getBalance());
        } catch (InsufficientFundsException e) {
            // Handle the specific business error cleanly
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }
}