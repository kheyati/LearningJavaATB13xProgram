package ex_30_Exceptions;

public class Bank {
    private String currency;
    private Integer amount;
// Parametrised constructor
    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }
// Getter & Setter
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    //Function to add all the amount in all the banks

    public Integer add(Bank bankName) throws currencyMismatchException {
        if (bankName.currency.equals("INR")) {
            return bankName.amount+ this.amount;
        }else {
            throw new currencyMismatchException("Currency mismatch");
        }
        }


    }
class currencyMismatchException extends Exception{
    public currencyMismatchException(String msg) {
        System.out.println(msg);

    }
}