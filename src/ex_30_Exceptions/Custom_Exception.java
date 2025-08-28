package ex_30_Exceptions;

    // 2) A simple BankAccount that uses the custom exception
    class BankAccount {
        private String owner;
        private double balance;
// Parametrized constructor
        public BankAccount(String owner, double startingBalance) {
            this.owner = owner;
            this.balance = startingBalance;
        }
// method deposit
        public void deposit(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
            balance += amount;
        }

        // Declare that this method can throw our custom checked exception
        public void withdraw(double amount) throws InsufficientFundsException {
            if (amount <= 0) throw new IllegalArgumentException("Withdrawal must be positive");
            if (amount > balance) {
                // 3) Throw the custom exception with a helpful message
                throw new InsufficientFundsException(
                        "Cannot withdraw " + amount + ". Available balance: " + balance
                );
            }
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }
    }

// 1) Define a custom checked exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message); // pass message to Exception
    }
}

