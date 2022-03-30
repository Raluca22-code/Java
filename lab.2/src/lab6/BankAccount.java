package lab6;

public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance = balance + amount;
        System.out.println("Your balance is " + balance);
    }

    public void deposit(double amount) {
        balance = balance*amount;
        System.out.println("You just deposited " + balance);

    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (o == null || o.getClass() != this.getClass())
            return false;
        BankAccount something = (BankAccount)o;

        return (something.owner.equals(this.owner) && something.balance == this.balance);

    }

    @Override
    public int hashCode(){
        return (int) (owner.hashCode() + balance );
    }
    @Override
    public String toString() {
        return owner;
    }

    public String getOwner() {
        return "The owners are: " + this.owner; //idk
}
}