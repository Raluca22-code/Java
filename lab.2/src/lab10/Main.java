package lab10;

public class Main {

    public static void main(String[] args) {
        Chronometer ch = new Chronometer();
        ChronometerThread ct = new ChronometerThread();
        Controller cc = new Controller(ct,ch);

    }

}