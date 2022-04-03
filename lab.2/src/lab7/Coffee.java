package lab7;

public class Coffee {
    private int temp;
    private int conc;
    private int count;

    Coffee(int t, int c) {
        temp = t;
        conc = c;
    }

    int getTemp() {
        return temp;
    }

    int getConc() {
        return conc;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        return "[cofee temperature=" + temp + ":concentration=" + conc + "]";
    }
}