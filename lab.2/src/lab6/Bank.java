package lab6;
import java.util.ArrayList;


public class Bank {

    ArrayList r1 = new ArrayList();

    public void addAccount(String owner, double balance) {
        BankAccount b3 = new BankAccount(owner, balance);
        r1.add(b3);
    }

    public void printAccounts() {
        for (int i = 0; i < r1.size(); i++) {
            String r = (String) r1.get(i);
            System.out.println(r);
        }
    }

    public void printAccounts(double minBalance, double maxBalance) {
        for (int i = 0; i < r1.size(); i++) {
            String r = (String) r1.get(i);
            double a = (double) r1.get(i);
            if (a > minBalance && a < maxBalance)
                System.out.println(r);
        }
    }

    //idk :)
/*    public BankAccount getAllAccount(String owner) {

    }
*/

}