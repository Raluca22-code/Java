package lab6;
import java.util.*;
//ex3 TreeSet

public class Bank1 {
    static void printAccounts(Set list) {
        System.out.println("- - - - - - - -");
        Iterator i = list.iterator();
        while (i.hasNext()) {
            String s = (String) i.next();
            System.out.println(s);
        }
    }
   public static void printAccounts(Set list, double minBalance, double maxBalance) {
        Iterator j = list.iterator();
        while (j.hasNext()) {
            double d = (double) j.next();
            String s = (String) j.next();
            if (d < maxBalance && d > minBalance) {
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add("Raluca");tree.add("Timea");tree.add("Monika");tree.add("Raluca N");
        tree.add("Robert");tree.add("Florina");tree.add("Kyla");
        printAccounts(tree);

    }

}