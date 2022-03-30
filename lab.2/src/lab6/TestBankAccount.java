package lab6;
import java.util.Objects;

public class TestBankAccount {
    public static void main(String[] args){
        BankAccount b1 = new BankAccount("Raluca", 200);
        BankAccount b2 = new BankAccount("Kyla", 150);

        b1.withdraw(200);
        b2.deposit(140);


        if(b1.equals(b2))
            System.out.println(b1 + " and " + b2 + " are equal ");
        else
            System.out.println(b1 + " and " + b2 + " are not equal ");

        if(b1.hashCode()==b2.hashCode())
            System.out.println(b1+" and " + b2 + " are equals ");
        else
            System.out.println(b1+" and " + b2 + " are not equals ");
    }
}
