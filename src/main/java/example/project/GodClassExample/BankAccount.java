package example.project.GodClassExample;

public class BankAccount {

    String owner;
    String accountNumber;
    double balance;
    double interest;

    public BankAccount(String owner, String accountNumber, double balance, double interest) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    // TODO: move this method to BankAccount class
    public void addInterest() {
        double interest = this.getInterest();
        double value = this.getBalance() * interest;
        this.setBalance(this.getBalance() + value);
    }

    public double getBalance() {return balance;}

    // TODO: move this method to BankAccount class
    public double obtainBalance() {
        return this.getBalance();
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Object getAccountNumber() {
        return accountNumber;
    }
}
