package lab7;

public class NumberException extends Exception{
    int n;
    public NumberException(int n,String msg) {
        super(msg);
        this.n=n;
    }
    int getCount(){
        return n;
    }
}