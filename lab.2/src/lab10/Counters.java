package lab10;

public class Counters extends Thread{

    static int c;
    Thread t;
    public Counters(String string, Thread t) {
        setName(string);
        this.t = t;
    }

    public void run() {
        if(t != null){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + " i = " + i);
            c++;
        }
        System.out.println(getName() + " job finalised." + c);

    }


    public static void main(String[] args){

        Counters  c1 = new  Counters ("c1", null);
        Counters  c2 = new  Counters ("c2", c1);

        c1.start();
        c2.start();
    }

}