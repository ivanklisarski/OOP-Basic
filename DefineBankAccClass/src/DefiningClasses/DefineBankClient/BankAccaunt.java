package DefiningClasses.DefineBankClient;

class BankAccaunt {

    private int id;
    private double balance;


    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void deposite(double amount) {

        if (amount <= 0) {
            System.out.println("no amount");
        }
        this.balance += amount;
    }

    public void whithdraw(double amount) {

        if (amount <= 0) {
            System.out.println("no amount");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("Account ID%s, balance %.2f", this.id, this.getBalance());
    }
}
