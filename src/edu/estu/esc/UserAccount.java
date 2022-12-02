package edu.estu.esc;

public class UserAccount implements Account {
    private double balance; // default balance variable

    /**
     * Default constructor
     */
    UserAccount() {

    }

    /**
     * Initiate user account with given balance
     * this type of relations have been named as 'method overloading'
     * @param balance balance
     */
    UserAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        // return balance
        return balance;
    }

    @Override
    public double deposit(double amount) {
        // control if amount is negative
        if (!signControl(amount)) return -1;

        // add amount to the balance
        this.balance += amount;

        // return balance
        return balance;
    }

    @Override
    public double withdrawal(double amount) {
        // control if amount is negative
        // or balance - amount is negative
        if (!signControl(amount) || !signControl(balance - amount)) return -1;

        // subtract amount from balance
        this.balance -= amount;

        // return balance
        return balance;
    }

    private boolean signControl(double result) {
        // return true if result greater than or equal to 0
        return result >= 0;
    }
}
